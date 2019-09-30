/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.controller;

import controller.NasabahController;
import controller.TransaksiController;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import web.view.PanelIsiUlang;
import model.Database;
import model.TabelTransaksi;
import model.Tarif;
import utilities.RupiahFormatter;
import web.view.PanelDashboard;
import web.view.PanelPembayaran;
import web.view.PanelTransfer;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class WebController {
    
    private static WebController instance;

    public WebController() {
    }
    
    public static WebController getInstance() {
        if (instance == null)
            instance = new WebController();
        return instance;
    }
    
    public void updateDashboard(PanelDashboard panel) {
        panel.getNama().setText(Database.getInstance().getNasabah().getNama());
        panel.getNickname().setText(Database.getInstance().getNasabah().getNickname());
        panel.getNoRekening().setText(String.valueOf(Database.getInstance().getNasabah().getNomorRekening()));
        panel.getNik().setText(String.valueOf(Database.getInstance().getNasabah().getNik()));
        panel.getNoHp().setText(Database.getInstance().getNasabah().getNomorHP());
        panel.getTempatLahir().setText(Database.getInstance().getNasabah().getTmpLahir());
        panel.getTglLahir().setText(Database.getInstance().getNasabah().getTanggalLahir());
        panel.getAlamat().setText(Database.getInstance().getNasabah().getAlamat());
        panel.getEmail().setText(Database.getInstance().getNasabah().getEmail());
        panel.getJenisKelamin().setText(Database.getInstance().getNasabah().getJenisKelamin());
        panel.getKartu().setText(NasabahController.getInstance().getKartu());
    }
    
    public void updateSaldo(PanelDashboard panel) {
        panel.getSaldo().setText(NasabahController.getInstance().getSaldo());
        panel.getLimitTransfer().setText(RupiahFormatter.getInstance().format(NasabahController.getInstance().getLimitTransfer() - Database.getInstance().getNasabah().getJumlahTransfer()));
        panel.getLimitTarik().setText(RupiahFormatter.getInstance().format(NasabahController.getInstance().getLimitTarik() - Database.getInstance().getNasabah().getJumlahTarik()));
        panel.getBarLimitTransfer().setValue((int)(100*Database.getInstance().getNasabah().getJumlahTransfer()/NasabahController.getInstance().getLimitTransfer()));
        panel.getBarLimitTarik().setValue((int)(100*Database.getInstance().getNasabah().getJumlahTarik()/NasabahController.getInstance().getLimitTarik()));
    }
    
    public void transfer(PanelTransfer panel) {
        try {
            if (TransaksiController.getInstance().validRekeningTransfer(panel.getNoRekening())) {
                TransaksiController.getInstance().setNominal(panel.getNominal());
                if (TransaksiController.getInstance().validWithdraw()) {
                    if (TransaksiController.getInstance().validTransfer()) {
                        String konfimasi = "No. Rekening : " + String.valueOf(panel.getNoRekening()) + "\nNama : " + Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNama() + "\nNominal Transfer : " + RupiahFormatter.getInstance().format(panel.getNominal());
                        int jawab = JOptionPane.showConfirmDialog(panel, konfimasi, "Konfirmasi Transfer", JOptionPane.OK_CANCEL_OPTION);
                        if (jawab == JOptionPane.OK_OPTION) {
                            TransaksiController.getInstance().transfer();
                            JOptionPane.showMessageDialog(panel, "Transfer Berhasil");
                            panel.clear();
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(panel, "Anda Mencapai Batas Transfer Harian", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(panel, "Saldo Tidak Cukup", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(panel, "No. Rekening Salah", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel, "No. Rekening dan Nominal Transfer berupa angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void updateMutasi(JTable tabel) {
        tabel.setModel(new TabelTransaksi(Database.getInstance().getNasabah().getListTransaksi()));
    }
    
    public void isiUlang(PanelIsiUlang panel) {
        try {
            long id = Long.parseLong(panel.getInputID().getText());
            TransaksiController.getInstance().setNominal(panel.getNominal());
            if (TransaksiController.getInstance().validWithdraw()) {
                    String konfirmasi = "Isi Ulang " + panel.getJenis().getSelectedItem().toString() + "\n" +
                            panel.getLabelID().getText() + " : " + panel.getInputID().getText() + "\n" + 
                            "Nominal : " + RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal());
                    int jawab = JOptionPane.showConfirmDialog(panel, konfirmasi, "Konfirmasi Isi Ulang", JOptionPane.OK_CANCEL_OPTION);
                    if (jawab == JOptionPane.OK_OPTION) {
                        TransaksiController.getInstance().isiUlang();
                        JOptionPane.showMessageDialog(panel, "Isi Ulang Berhasil");
                        panel.clear();
                    }
            }
            else
                JOptionPane.showMessageDialog(panel, "Saldo Anda Tidak Mencukupi", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel, "ID Pelanggan berupa angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void pembayaran(PanelPembayaran panel) {
        try {
            long id = Long.parseLong(panel.getInputID().getText());
            TransaksiController.getInstance().setTagihan(panel.getJenis().getSelectedIndex());
            if (TransaksiController.getInstance().validWithdraw()) {
                String konfirmasi = "Pembayaran " + panel.getJenis().getSelectedItem().toString() + "\n" +
                        "ID Pelanggan : " + panel.getInputID().getText() + "\n" +
                        "Nominal : " + RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal()) + "\n" +
                        "Biaya Admin : " + RupiahFormatter.getInstance().format(Tarif.getInstance().getAdminTagihan()) + "\n" +
                        "Total : " + RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal() + Tarif.getInstance().getAdminTagihan());
                int jawab = JOptionPane.showConfirmDialog(panel, konfirmasi, "Konfirmasi Pemabayaran", JOptionPane.OK_CANCEL_OPTION);
                if (jawab == JOptionPane.OK_OPTION) {
                    TransaksiController.getInstance().bayarTagihan();
                    JOptionPane.showMessageDialog(panel, "Pembayaran Berhasil");
                    panel.clear();
                }
            }
            else
                JOptionPane.showMessageDialog(panel, "Saldo Anda Tidak Mencukupi", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel, "ID Pelanggan berupa angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
}

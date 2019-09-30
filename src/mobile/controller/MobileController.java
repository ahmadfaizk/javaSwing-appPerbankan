/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.controller;

import controller.NasabahController;
import controller.TransaksiController;
import mobile.view.PanelInformasi;
import mobile.view.PanelIsiUlang;
import mobile.view.PanelPembayaran;
import mobile.view.PanelTransfer;
import model.Database;
import model.Tarif;
import utilities.RupiahFormatter;
/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class MobileController {
    
    private static MobileController instance;
    
    public MobileController() {
    }
    
    public static MobileController getInstance() {
        if (instance == null) {
            instance = new MobileController();
            return instance;
        }
        else
            return instance;
    }
    
    public String getNama() {
        return Database.getInstance().getNasabah().getNickname();
    }
    
    public void updateSaldo(PanelInformasi panel) {
        panel.getSaldo().setText(NasabahController.getInstance().getSaldo());
    }
    
    public void updatePanelInformasi(PanelInformasi panel) {
        panel.getNama().setText(Database.getInstance().getNasabah().getNama());
        panel.getNik().setText(Database.getInstance().getNasabah().getNik());
        panel.getKartu().setText(NasabahController.getInstance().getKartu());
        panel.getNoRekening().setText(String.valueOf(Database.getInstance().getNasabah().getNomorRekening()));
        panel.getUserId().setText(Database.getInstance().getNasabah().getUserId());
        panel.getJenisKelamin().setText(Database.getInstance().getNasabah().getJenisKelamin());
        panel.getTempatLahir().setText(Database.getInstance().getNasabah().getTmpLahir());
        panel.getTanggalLahir().setText(Database.getInstance().getNasabah().getTanggalLahir());
        panel.getEmail().setText(Database.getInstance().getNasabah().getEmail());
        panel.getNoHp().setText(Database.getInstance().getNasabah().getNomorHP());
        panel.getAlamat().setText(Database.getInstance().getNasabah().getAlamat());
    }
    
    public void transfer(PanelTransfer panel) {
        try {
            if (TransaksiController.getInstance().validRekeningTransfer(panel.getNoRekening())) {
                TransaksiController.getInstance().setNominal(panel.getJumlahTransfer());
                if (TransaksiController.getInstance().validWithdraw()) {
                    if (TransaksiController.getInstance().validTransfer()) {
                        panel.getPanel_konfirmasi().setVisible(true);
                        panel.getNama().setText(Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNama());
                        panel.getJumlah().setText(RupiahFormatter.getInstance().format(panel.getJumlahTransfer()));
                        panel.setNotifikasi("");
                    }
                    else
                        panel.setNotifikasi("Anda Mencapai Batas Transfer");
                }
                else
                    panel.setNotifikasi("Saldo Anda Tidak Mencukupi");
            }
            else
                panel.setNotifikasi("No. Rekening Salah");
        }
        catch (NumberFormatException e) {
            panel.setNotifikasi("No. Rekening dan Nominal Transfer berupa angka");
        }
    }
    
    public void pembayaran(PanelPembayaran panel) {
        try {
            long id = Long.valueOf(panel.getIdPelanggan().getText());
            TransaksiController.getInstance().setTagihan(panel.getJenis().getSelectedIndex());
            if (TransaksiController.getInstance().validWithdraw()) {
                panel.getPanel_konfirmasi().setVisible(true);
                panel.getIdPel().setText(String.valueOf(id));
                panel.setNotifikasi("");
                panel.getJumlahTagihan().setText(RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal()));
                panel.getBiayaAdmin().setText(RupiahFormatter.getInstance().format(Tarif.getInstance().getAdminTagihan()));
                panel.getBiayaTotal().setText(RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal() + Tarif.getInstance().getAdminTagihan()));
            }
            else
                panel.setNotifikasi("Saldo Anda Tidak Mecukupi");
        }
        catch (NumberFormatException e) {
            panel.setNotifikasi("ID Pelanggan berupa angka");
        }
    }
    
    public void isiUlang(PanelIsiUlang panel) {
        try {
            long id = Long.parseLong(panel.getNomerIsiUlang().getText());
            TransaksiController.getInstance().setNominal(panel.getNominal());
            if (TransaksiController.getInstance().validWithdraw()) {
                panel.getPanel_konfirmasi().setVisible(true);
                panel.getNoHp().setText(String.valueOf(id));
                panel.getJumlahIsiUlang().setText(RupiahFormatter.getInstance().format(panel.getNominal()));
            }
            else {
                panel.setNotifikasi("Saldo anda tidak cukup");
            }
        }
        catch (NumberFormatException e) {
            panel.setNotifikasi("ID Pelanggan berupa angka");
        }
    }
}

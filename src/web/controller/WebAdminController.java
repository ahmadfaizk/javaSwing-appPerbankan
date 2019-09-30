/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.controller;

import controller.AdminController;
import controller.NasabahController;
import controller.TransaksiController;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Database;
import model.TabelNasabah;
import model.TabelTransaksi;
import utilities.RupiahFormatter;
import web.view.admin.PanelCekMutasi;
import web.view.admin.PanelCreateNasabah;
import web.view.admin.PanelDeleteNasabah;
import web.view.admin.PanelSetor;
import web.view.admin.PanelTarik;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class WebAdminController {
    
    private static WebAdminController instance;

    public WebAdminController() {
    }
    
    public static WebAdminController getInstance() {
        if (instance == null)
            instance = new WebAdminController();
        return instance;
    }
    
    public void addNasabah(PanelCreateNasabah view) {
        try {
            if (view.isiSemuaData()) {
                if (view.getNamaLengkap().getText().isEmpty() || view.getNamaPanggilan().getText().isEmpty() || view.getNik().getText().isEmpty() || view.getGender().isEmpty() || view.getTahunLahir().getText().isEmpty() || view.getEmail().getText().isEmpty() || view.getNoHP().getText().isEmpty() || view.getAlamat().getText().isEmpty() || view.getNoRekening().getText().isEmpty() || view.getNoPin().getText().isEmpty() || view.getUserId().getText().isEmpty() || view.getPassword().getText().isEmpty() || view.getSetoranAwal().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(view, "Harap Isi Semua Datanya", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else if (NasabahController.getInstance().isRekening(Long.parseLong(view.getNoRekening().getText()))) {
                    JOptionPane.showMessageDialog(view, "No. Rekening sudah dipakai", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else if (NasabahController.getInstance().validasiPin(view.getNoPin().getText()))
                    JOptionPane.showMessageDialog(view, "PIN tidak Valid", "Peringatan", JOptionPane.WARNING_MESSAGE);
                else if (NasabahController.getInstance().isUserId(view.getUserId().getText())) {
                    JOptionPane.showMessageDialog(view, "User ID sudah dipakai", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else if (AdminController.getInstance().isUserId(view.getUserId().getText())) {
                    JOptionPane.showMessageDialog(view, "User ID sudah dipakai", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else if (NasabahController.getInstance().getMinimumDeposit(view.getKartu()) >= Double.parseDouble(view.getSetoranAwal().getText())) {
                    JOptionPane.showMessageDialog(view, "Kartu " + view.getJenisKartu().getSelectedItem().toString() + " Minimum Deposit Awal Sebesar " + RupiahFormatter.getInstance().format(NasabahController.getInstance().getMinimumDeposit(view.getKartu())), "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else {
                    if (JOptionPane.showConfirmDialog(view, "Apakah daya ini sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        NasabahController.getInstance().addNasabah(view.getNamaLengkap().getText(), view.getNamaPanggilan().getText(), view.getNik().getText(), view.getGender(), view.getTempatLahir().getText(), view.getTglLahir(), view.getEmail().getText(), view.getNoHP().getText(), view.getAlamat().getText(), view.getUserId().getText(), view.getPassword().getText(), Long.parseLong(view.getNoRekening().getText()), view.getNoPin().getText(), view.getKartu(), Double.parseDouble(view.getSetoranAwal().getText()));             
                        JOptionPane.showMessageDialog(view, "Berhasil Membuat Akun Nasabah");
                        view.clear();
                    }
                }
            }
            else {
                if (view.getNamaLengkap().getText().isEmpty() || view.getNamaPanggilan().getText().isEmpty() || view.getNoRekening().getText().isEmpty() || view.getNoPin().getText().isEmpty() || view.getUserId().getText().isEmpty() || view.getPassword().getText().isEmpty() || view.getSetoranAwal().getText().isEmpty())
                    JOptionPane.showMessageDialog(view, "Harap Isi Semua Datanya", "Peringatan", JOptionPane.WARNING_MESSAGE);
                else if (NasabahController.getInstance().isRekening(Long.parseLong(view.getNoRekening().getText()))) {
                    JOptionPane.showMessageDialog(view, "No. Rekening sudah dipakai", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else if (!NasabahController.getInstance().validasiPin(view.getNoPin().getText()))
                    JOptionPane.showMessageDialog(view, "PIN tidak Valid", "Peringatan", JOptionPane.WARNING_MESSAGE);
                else if (NasabahController.getInstance().isUserId(view.getUserId().getText())) {
                    JOptionPane.showMessageDialog(view, "User ID sudah dipakai", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else if (AdminController.getInstance().isUserId(view.getUserId().getText())) {
                    JOptionPane.showMessageDialog(view, "User ID sudah dipakai", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else if (NasabahController.getInstance().getMinimumDeposit(view.getKartu()) >= Double.parseDouble(view.getSetoranAwal().getText())) {
                    JOptionPane.showMessageDialog(view, "Kartu " + view.getJenisKartu().getSelectedItem().toString() + " Minimum Deposit Awal Sebesar " + RupiahFormatter.getInstance().format(NasabahController.getInstance().getMinimumDeposit(view.getKartu())), "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else {
                    if (JOptionPane.showConfirmDialog(view, "Apakah daya ini sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        NasabahController.getInstance().addNasabah(view.getNamaLengkap().getText(), view.getNamaPanggilan().getText(), view.getUserId().getText(), view.getPassword().getText(), Long.parseLong(view.getNoRekening().getText()), view.getNoPin().getText(), view.getKartu(), Double.parseDouble(view.getSetoranAwal().getText()));
                        JOptionPane.showMessageDialog(view, "Berhasil Membuat Akun Nasabah");
                        view.clear();
                    }
                }
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateTabelNasabah(JTable tabel) {
        tabel.setModel(new TabelNasabah(Database.getInstance().getListNasabah()));
    }
    
    public void setorTunai(PanelSetor panel) {
        try {
            long rekening = Long.parseLong(panel.getNoRekening().getText());
            double jumlah = Double.parseDouble(panel.getNominal().getText());
            if (NasabahController.getInstance().isRekening(rekening)) {
                TransaksiController.getInstance().setNominal(jumlah);
                String text = "Setor Tunai\n" + "Nama : " + Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNama() + "\nNominal : " + RupiahFormatter.getInstance().format(jumlah);
                int jawab = JOptionPane.showConfirmDialog(panel, text, "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                if (jawab == JOptionPane.OK_OPTION) {
                    TransaksiController.getInstance().setorTunai();
                    JOptionPane.showMessageDialog(panel, "Setor Tunai Berhasil");
                }
                panel.clear();
            }
            else
                JOptionPane.showMessageDialog(panel, "No. Rekening tidak tersedia", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel, "No. Rekening dan Nominal berupa angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void tarikTunai(PanelTarik panel) {
        try {
            long rekening = Long.parseLong(panel.getNoRekening().getText());
            double jumlah = Double.parseDouble(panel.getNominal().getText());
            if (NasabahController.getInstance().isRekening(rekening)) {
                TransaksiController.getInstance().setNominal(jumlah);
                if (TransaksiController.getInstance().validWithdraw(TransaksiController.getInstance().getIndex())) {
                    if (TransaksiController.getInstance().validAdminTarik()) {
                        String text = "Tarik Tunai\n" + "Nama : " + Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNama() + "\nNominal : " + RupiahFormatter.getInstance().format(jumlah);
                        int jawab = JOptionPane.showConfirmDialog(panel, text, "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                        if (jawab == JOptionPane.OK_OPTION) {
                            TransaksiController.getInstance().tarikTunai();
                            JOptionPane.showMessageDialog(panel, "Tarik Tunai Berhasil");
                            panel.clear();
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(panel, "Melebihi Batas Transfer Harian", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(panel, "Saldo Tidak Cukup", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(panel, "No. Rekening tidak tersedia", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel, "No. Rekening dan Nominal berupa angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void cekMutasi(PanelCekMutasi panel) {
        try {
            if (NasabahController.getInstance().isRekening(Long.parseLong(panel.getNoRekening().getText()))) {
                panel.getTabelMutasi().setModel(new TabelTransaksi(Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getListTransaksi()));
                panel.getNama().setText(Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNama());
            }
            else
                JOptionPane.showMessageDialog(panel, "No. Rekening tidak tersedia", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel, "No. Rekening berupa angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void deleteNasabah(PanelDeleteNasabah panel) {
        try {
            if (NasabahController.getInstance().isRekening(Long.parseLong(panel.getInput().getText()))) {
                panel.getPanelKonfirmasi().setVisible(true);
                panel.getNama().setText(Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNama());
                panel.getNoRekening().setText(String.valueOf(Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNomorRekening()));
                panel.getKartu().setText(NasabahController.getInstance().getKartu(TransaksiController.getInstance().getIndex()));
                panel.getUserId().setText(Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getUserId());
                panel.getSaldo().setText(NasabahController.getInstance().getSaldo(TransaksiController.getInstance().getIndex()));                
            }
            else
                JOptionPane.showMessageDialog(panel, "No. Rekening tidak tersedia", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(panel, "No. Rekening berupa angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
//    public void addAdmin(PanelCreateAdmin view) {
//        try {
//            if (view.getNamaLengkap().getText().isEmpty() || view.getNamaPanggilan().getText().isEmpty() || view.getUserId().getText().isEmpty() || view.getPassword().getText().isEmpty()) {
//                JOptionPane.showMessageDialog(view, "Harap Isi Semua Datanya", "Peringatan", JOptionPane.WARNING_MESSAGE);
//            }
//            else if(AdminController.getInstance().isUserId(view.getUserId().getText())) {
//                JOptionPane.showMessageDialog(view, "User ID sudah dipakai", "Peringatan", JOptionPane.WARNING_MESSAGE);
//            }
//            else{
//                Database.getInstance().addAdmin(view.getNamaLengkap().getText(), view.getNamaPanggilan().getText(), view.getUserId().getText(), view.getPassword().getText());
//                JOptionPane.showMessageDialog(view, "Berhasil Membuat Akun Administator");
//            }
//        }
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(view, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
}

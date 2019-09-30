/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.controller;

import atm.view.ATM;
import atm.view.PanelInfo;
import atm.view.PanelInput;
import atm.view.PanelKonfirmasi;
import controller.NasabahController;
import model.Database;
import utilities.RupiahFormatter;
import controller.TransaksiController;
import model.Tarif;

/**
 *
 * @author student
 */
public class ATMController {
    
    private static ATMController instance;

    public ATMController() {
    }
    
    public static ATMController getInstance() {
        if (instance == null)
            instance = new ATMController();
        return instance;
    }
    
    public void initAllPanel(ATM atm) {
        //MenuAwal
        atm.getMenuAwal().getLabel1().setText("<-- Rp. 50.000,00");
        atm.getMenuAwal().getLabel2().setText("<-- Rp. 100.000,00");
        atm.getMenuAwal().getLabel3().setText("<-- Rp. 200.000,00");
        atm.getMenuAwal().getLabel4().setText("<-- Keluar");
        atm.getMenuAwal().getLabel5().setText("Rp. 500.000,00 -->");
        atm.getMenuAwal().getLabel6().setText("Rp. 1.000.000 -->");
        atm.getMenuAwal().getLabel7().setText("Penarikan Jumlah Lain -->");
        atm.getMenuAwal().getLabel8().setText("Transaksi Lainnya -->");
        atm.getMenuAwal().getLabelJudul().setText("Tarik Tunai");
        //Menu Lain
        atm.getMenuLain().getLabelJudul().setText("Menu Lainnya");
        atm.getMenuLain().getLabel1().setText("<-- Pembayaran");
        atm.getMenuLain().getLabel2().setText("<-- Isi Ulang");
        atm.getMenuLain().getLabel3().setText("<-- Ganti PIN");
        atm.getMenuLain().getLabel4().setText("<-- Menu Sebelumnya");
        atm.getMenuLain().getLabel5().setText("Informasi Saldo -->");
        atm.getMenuLain().getLabel6().setText("Transfer -->");
        atm.getMenuLain().getLabel8().setText("Keluar -->");
        //Tarik Tunai
        atm.getPanelTarik().setJudul1("Masukkan Jumlah Penarikan Tunai");
        atm.getPanelTarik().setJudul2("(Dalam Kelipatan Rp. 50.000,00)");
        //Transfer
        atm.getPanelInputRekening().setJudul1("Transfer Saldo");
        atm.getPanelInputRekening().setJudul2("Masukkan No. Rekening Tujuan");
        atm.getPanelInputNominal().setJudul1("Transfer Saldo");
        atm.getPanelInputNominal().setJudul2("Masukkan Nominal Transfer");
        //Menu Pembayaran
        atm.getMenuPembayaran().getLabel1().setText("<-- Listrik Pasca Bayar");
        atm.getMenuPembayaran().getLabel2().setText("<-- PDAM");
        atm.getMenuPembayaran().getLabel4().setText("<-- Kembali");
        atm.getMenuPembayaran().getLabel8().setText("Keluar -->");
        atm.getMenuPembayaran().getLabelJudul().setText("Menu Pembayaran");
        //Isi Ulang
        atm.getMenuIsiUlang().getLabel1().setText("<-- Listrik Pra Bayar");
        atm.getMenuIsiUlang().getLabel2().setText("<-- Pulsa");
        atm.getMenuIsiUlang().getLabel3().setText("<-- Go-Pay");
        atm.getMenuIsiUlang().getLabel5().setText("Ovo -->");
        atm.getMenuIsiUlang().getLabel6().setText("LinkAja -->");
        atm.getMenuIsiUlang().getLabel4().setText("<-- Kembali");
        atm.getMenuIsiUlang().getLabel8().setText("Keluar -->");
        atm.getMenuIsiUlang().getLabelJudul().setText("Menu Isi Ulang");
        //Nominal Isi Ulang
        atm.getMenuNominalIsiUlang().clear();
        atm.getMenuNominalIsiUlang().getLabel1().setText("<-- 20000");
        atm.getMenuNominalIsiUlang().getLabel2().setText("<-- 50000");
        atm.getMenuNominalIsiUlang().getLabel3().setText("<-- 100000");
        atm.getMenuNominalIsiUlang().getLabel5().setText("250000 -->");
        atm.getMenuNominalIsiUlang().getLabel6().setText("500000 -->");
        atm.getMenuNominalIsiUlang().getLabel7().setText("1000000 -->");
        atm.getMenuNominalIsiUlang().getLabel4().setText("<-- Kembali");
        atm.getMenuNominalIsiUlang().getLabel8().setText("Keluar -->");
        atm.getMenuNominalIsiUlang().getLabelJudul().setText("Nominal Isi Ulang");
        //Ganti PIN
        atm.getInputPinLama().setJudul1("Ganti PIN");
        atm.getInputPinLama().setJudul2("Masukkan PIN Lama Anda");
        atm.getInputPinBaru().setJudul1("Ganti PIN");
        atm.getInputPinBaru().setJudul2("Masukkan PIN Lama Anda");
    }
    
    public void initPanelInputId(PanelInput view, int index) {
        if (index == 0)
            view.setJudul1("Pembayaran PLN");
        else
            view.setJudul1("Pembayaran PDAM");
        view.setJudul2("Masukkan ID Pelanggan");
        TransaksiController.getInstance().setTagihan(index);
    }
    
    public void initPanelKonfirmasiTarik(PanelKonfirmasi view) {
        view.getJudul().setText("Konfirmasi Tarik Tunai");
        view.getInfo1().setHorizontalAlignment(0);
        view.getInfo1().setText(RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal()));
    }
    
    public void initInfoTransaksi(PanelInfo view, boolean sukses) {
        view.setJudul("Info Transaksi");
        if (sukses == true)
            view.setInfo("Transaksi Berhasil");
        else
            view.setInfo("Transaksi Gagal");
    }
    
    public void initPanelKonfirmasiTransfer(PanelKonfirmasi view) {
        view.getJudul().setText("Konfirmasi Transfer");
        view.getInfo1().setText("No. Rekening : " + Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNomorRekening());
        view.getInfo2().setText("Nama : " + Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getNama());
        view.getInfo3().setText("Nominal : " + RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal()));
    }
    
    public void initPanelKonfirmasiPembayaran(PanelKonfirmasi view, long id) {
        view.getJudul().setText("Konfirmasi Pembayaran Tagihan");
        view.getInfo1().setText("Id Pelanggan : " + id);
        view.getInfo2().setText("Jumlah Tagihan : " + RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal()));
        view.getInfo3().setText("Biaya Admin : " + RupiahFormatter.getInstance().format(Tarif.getInstance().getAdminTagihan()));
        view.getInfo4().setText("Biaya Total : " + RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal() + Tarif.getInstance().getAdminTagihan()));
    }
    
    public void initPanelIsiUlang(ATM atm, int index) {
        atm.getPanelInputNoHp().setJudul2("Masukkan No. HP");
        atm.getKonfirmasiIsiUlang().getInfo1().setText("No. HP : ");
        switch (index) {
            case 0: 
                atm.getPanelInputNoHp().setJudul1("Isi Ulang Token PLN"); 
                atm.getPanelInputNoHp().setJudul2("Masukkan ID Pelanggan");
                atm.getKonfirmasiIsiUlang().getInfo1().setText("ID Pelanggan : ");
                break;
            case 1:
                atm.getPanelInputNoHp().setJudul1("Isi Ulang Pulsa");
                break;
            case 2:
                atm.getPanelInputNoHp().setJudul1("Isi Ulang Go-Pay");
                break;
            case 3:
                atm.getPanelInputNoHp().setJudul1("Isi Ulang Ovo");
                break;
            case 4:
                atm.getPanelInputNoHp().setJudul1("Isi Ulang LinkAja");
                break;
            default:
                break;
        }
    }
    
    public void initKonfirmasiIsiUlang(PanelKonfirmasi view, String id) {
        view.getJudul().setText("Konfirmasi Isi Ulang");
        view.getInfo1().setText(view.getInfo1().getText() + id);
    }
    
    public void initKonfirmasiIsiUlang(PanelKonfirmasi view) {
        view.getInfo2().setText("Nominal Isi Ulang : " + RupiahFormatter.getInstance().format(TransaksiController.getInstance().getNominal()));
    }
    
    public void initInfoGantiPin(PanelInfo view) {
        view.setJudul("Ganti PIN");
        view.setInfo("PIN Anda Berhasil Diubah");
    }
    
    public void button8(ATM atm) {
        if (atm.getPanelLogin().isVisible()) {
            try {
                if (atm.getPanelLogin().getNoPin().getText().isEmpty()) {
                    atm.getPanelLogin().setNotifikasi("No. PIN kosong");
                }
                else if (NasabahController.getInstance().isValidPin(atm.getPanelLogin().getNoPin().getText())) {
                    atm.gantiPanel(atm.getMenuAwal());
                    atm.getPanelLogin().clear();
                }
                else {
                    atm.getPanelLogin().setNotifikasi("No. Rekening atau No. PIN anda salah");
                }
            }
            catch (NumberFormatException e) {
                atm.getPanelLogin().setNotifikasi("No. Rekening dan No. PIN berupa angka");
            }
        }
        else if (atm.getMenuAwal().isVisible()) {
            atm.gantiPanel(atm.getMenuLain());
        }
        else if (atm.getMenuLain().isVisible()) {
            atm.gantiPanel(atm.getPanelLogin());
        }
        else if (atm.getPanelTarik().isVisible()) {
            atm.getPanelTarik().getInput().setText("");
        }
    }
    
    public void button3(ATM atm) {
        if (atm.getMenuAwal().isVisible()) {
            TransaksiController.getInstance().setNominal(200000);
            initPanelKonfirmasiTarik(atm.getKonfirmasiTarik());
            atm.gantiPanel(atm.getKonfirmasiTarik());
        }
        else if (atm.getMenuIsiUlang().isVisible()) {
            initPanelIsiUlang(atm, 2);
            atm.gantiPanel(atm.getInputNoHp());
        }
        else if (atm.getMenuNominalIsiUlang().isVisible()) {
            TransaksiController.getInstance().setNominal(100000);
            initKonfirmasiIsiUlang(atm.getKonfirmasiIsiUlang());
            atm.gantiPanel(atm.getKonfirmasiIsiUlang());
        }
        else if (atm.getMenuLain().isVisible()) {
            atm.gantiPanel(atm.getInputPinLama());
        }
    }
    
    public void button7(ATM atm) {
        if (atm.getMenuAwal().isVisible()) {
            atm.gantiPanel(atm.getPanelTarik());
        }
        else if (atm.getPanelTarik().isVisible()) {
            try {
                double nominal = Double.parseDouble(atm.getPanelTarik().getInput().getText());
                if (nominal % 50000 == 0) {
                    TransaksiController.getInstance().setNominal(nominal);
                    initPanelKonfirmasiTarik(atm.getKonfirmasiTarik());
                    atm.gantiPanel(atm.getKonfirmasiTarik());
                    atm.getPanelTarik().clear();
                }
                else
                    atm.getPanelTarik().setNotifikasi("Jumlah Tarik Tunai bukan  kelipatan 50.000");
            }
            catch (NumberFormatException e) {
                atm.getPanelTarik().setNotifikasi("Jumlah Tarik Tunai Berupa angka");
            }
        }
        else if (atm.getKonfirmasiTarik().isVisible()) {
            atm.gantiPanel(atm.getPanelInfo());
            if (TransaksiController.getInstance().validWithdraw() && TransaksiController.getInstance().validTarik()) {
                TransaksiController.getInstance().tarik();
                initInfoTransaksi(atm.getPanelInfo(),true);
            }
            else
                initInfoTransaksi(atm.getPanelInfo(),false);
        }
        else if (atm.getPanelInputRekening().isVisible()) {
            try {
                long rekening = Long.parseLong(atm.getPanelInputRekening().getInput().getText());
                if (TransaksiController.getInstance().validRekeningTransfer(rekening)) {
                    atm.getPanelInputRekening().clear();
                    atm.gantiPanel(atm.getPanelInputNominal());
                }
                else
                    atm.getPanelInputRekening().setNotifikasi("No. Rekening salah");
            }
            catch (NumberFormatException e) {
                atm.getPanelInputRekening().setNotifikasi("No. Rekening berupa angka");
            }
        }
        else if (atm.getPanelInputNominal().isVisible()) {
            try {
                double nominal = Double.parseDouble(atm.getPanelInputNominal().getInput().getText());
                TransaksiController.getInstance().setNominal(nominal);
                atm.gantiPanel(atm.getKonfirmasiTransfer());
                atm.getPanelInputNominal().clear();
                initPanelKonfirmasiTransfer(atm.getKonfirmasiTransfer());
            }
            catch (NumberFormatException e) {
                atm.getPanelInputNominal().setNotifikasi("Nominal berupa angka");
            }
        }
        else if (atm.getKonfirmasiTransfer().isVisible()) {
            atm.gantiPanel(atm.getPanelInfo());
            if (TransaksiController.getInstance().validWithdraw() && TransaksiController.getInstance().validTransfer()) {
                TransaksiController.getInstance().transfer();
                initInfoTransaksi(atm.getPanelInfo(),true);
            }
            else
                initInfoTransaksi(atm.getPanelInfo(),false);
        }
        else if (atm.getPanelInputId().isVisible()) {
            try {
                long id = Long.parseLong(atm.getPanelInputId().getInput().getText());
                initPanelKonfirmasiPembayaran(atm.getKonfirmasiPembayaran(), id);
                atm.getPanelInputId().clear();
                atm.gantiPanel(atm.getKonfirmasiPembayaran());
            }
            catch (NumberFormatException e) {
                atm.getPanelInputId().setNotifikasi("Id Pelanggan berupa angka");
            }
        }
        else if (atm.getKonfirmasiPembayaran().isVisible()) {
            atm.gantiPanel(atm.getPanelInfo());
            if (TransaksiController.getInstance().validWithdraw()) {
                TransaksiController.getInstance().bayarTagihan();
                initInfoTransaksi(atm.getPanelInfo(),true);
            }
            else
                initInfoTransaksi(atm.getPanelInfo(),false);
        }
        else if (atm.getPanelInputNoHp().isVisible()) {
            try {
                long id = Long.parseLong(atm.getPanelInputNoHp().getInput().getText());
                initKonfirmasiIsiUlang(atm.getKonfirmasiIsiUlang(),String.valueOf(id));
                atm.getPanelInputNoHp().clear();
                atm.gantiPanel(atm.getMenuNominalIsiUlang());
            }
            catch (NumberFormatException e) {
                atm.getPanelInputNoHp().setNotifikasi("Input berupa angka");
            }
        }
        else if (atm.getMenuNominalIsiUlang().isVisible()) {
            TransaksiController.getInstance().setNominal(1000000);
            initKonfirmasiIsiUlang(atm.getKonfirmasiIsiUlang());
            atm.gantiPanel(atm.getKonfirmasiIsiUlang());
        }
        else if (atm.getKonfirmasiIsiUlang().isVisible()) {
           atm.gantiPanel(atm.getPanelInfo());
            if (TransaksiController.getInstance().validWithdraw()) {
                TransaksiController.getInstance().isiUlang();
                initInfoTransaksi(atm.getPanelInfo(),true);
            }
            else
                initInfoTransaksi(atm.getPanelInfo(),false);
        }
        else if (atm.getInputPinLama().isVisible()) {
            if (NasabahController.getInstance().isValidPin(atm.getInputPinLama().getInput().getText())) {
                atm.getInputPinLama().clear();
                atm.gantiPanel(atm.getInputPinBaru());
            }
            else
                atm.getInputPinLama().setNotifikasi("PIN Anda Salah");
        }
        else if (atm.getInputPinBaru().isVisible()) {
            try {
                if (atm.getInputPinBaru().getInput().getText().length() == 6) {
                    NasabahController.getInstance().gantiPin(atm.getInputPinBaru().getInput().getText());
                    atm.getInputPinBaru().clear();
                    initInfoGantiPin(atm.getPanelInfo());
                    atm.gantiPanel(atm.getPanelInfo());
                }
                else
                    atm.getInputPinBaru().setNotifikasi("PIN Berisi 6 Angka");
            }
            catch (NumberFormatException e) {
                atm.getInputPinBaru().setNotifikasi("PIN Berupa Angka");
            }
        }
    }
    
    public void button6(ATM atm) {
        if (atm.getMenuAwal().isVisible()) {
            TransaksiController.getInstance().setNominal(1000000);
            initPanelKonfirmasiTarik(atm.getKonfirmasiTarik());
            atm.gantiPanel(atm.getKonfirmasiTarik());
        }
        else if (atm.getMenuLain().isVisible()) {
            atm.gantiPanel(atm.getPanelInputRekening());
        }
        else if (atm.getMenuIsiUlang().isVisible()) {
            initPanelIsiUlang(atm,4);
            atm.gantiPanel(atm.getPanelInputNoHp());
        }
        else if (atm.getMenuIsiUlang().isVisible()) {
            TransaksiController.getInstance().setNominal(500000);
            initKonfirmasiIsiUlang(atm.getKonfirmasiIsiUlang());
            atm.gantiPanel(atm.getKonfirmasiIsiUlang());
        }
    }
    
    public void button5(ATM atm) {
        if (atm.getMenuAwal().isVisible()) {
            TransaksiController.getInstance().setNominal(500000);
            initPanelKonfirmasiTarik(atm.getKonfirmasiTarik());
            atm.gantiPanel(atm.getKonfirmasiTarik());
        }
        else if (atm.getMenuLain().isVisible()) {
            atm.gantiPanel(atm.getPanelInfo());
            atm.getPanelInfo().setJudul("Saldo Anda");
            atm.getPanelInfo().setInfo(NasabahController.getInstance().getSaldo());
        }
        else if (atm.getMenuIsiUlang().isVisible()) {
            initPanelIsiUlang(atm, 3);
            atm.gantiPanel(atm.getInputNoHp());
        }
        else if (atm.getMenuIsiUlang().isVisible()) {
            TransaksiController.getInstance().setNominal(250000);
            initKonfirmasiIsiUlang(atm.getKonfirmasiIsiUlang());
            atm.gantiPanel(atm.getKonfirmasiIsiUlang());
        }
    }
    
    public void button1(ATM atm) {
        if (atm.getMenuAwal().isVisible()) {
            TransaksiController.getInstance().setNominal(50000);
            initPanelKonfirmasiTarik(atm.getKonfirmasiTarik());
            atm.gantiPanel(atm.getKonfirmasiTarik());
        }
        else if (atm.getMenuLain().isVisible()) {
            atm.gantiPanel(atm.getMenuPembayaran());
        }
        else if (atm.getMenuPembayaran().isVisible()) {
            initPanelInputId(atm.getPanelInputId(), 0);
            atm.gantiPanel(atm.getPanelInputId());
        }
        else if (atm.getMenuIsiUlang().isVisible()) {
            initPanelIsiUlang(atm, 0);
            atm.gantiPanel(atm.getPanelInputNoHp());
        }
        else if (atm.getMenuNominalIsiUlang().isVisible()) {
            TransaksiController.getInstance().setNominal(20000);
            initKonfirmasiIsiUlang(atm.getKonfirmasiIsiUlang());
            atm.gantiPanel(atm.getKonfirmasiIsiUlang());
        }
    }
    
    public void button2(ATM atm) {
        if (atm.getMenuAwal().isVisible()) {
            TransaksiController.getInstance().setNominal(100000);
            initPanelKonfirmasiTarik(atm.getKonfirmasiTarik());
            atm.gantiPanel(atm.getKonfirmasiTarik());
        }
        else if (atm.getMenuLain().isVisible()) {
            atm.gantiPanel(atm.getMenuIsiUlang());
        }
        else if (atm.getMenuPembayaran().isVisible()) {
            initPanelInputId(atm.getPanelInputId(), 1);
            atm.gantiPanel(atm.getPanelInputId());
        }
        else if (atm.getMenuIsiUlang().isVisible()) {
            initPanelIsiUlang(atm, 1);
            atm.gantiPanel(atm.getPanelInputNoHp());
        }
        else if (atm.getMenuNominalIsiUlang().isVisible()) {
            TransaksiController.getInstance().setNominal(50000);
            initKonfirmasiIsiUlang(atm.getKonfirmasiIsiUlang());
            atm.gantiPanel(atm.getKonfirmasiIsiUlang());
        }
    }
}

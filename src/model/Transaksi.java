/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TransaksiController;
import java.util.Date;
import java.text.SimpleDateFormat;
import utilities.RupiahFormatter;
/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class Transaksi {
    private String date;
    private int kode;
    private double jumlah;
    private double saldo;
    public static int SETORAN_AWAL = 10;
    public static int SETORAN_TUNAI = 11;
    public static int TRANSFER_MASUK = 21;
    public static int PENARIKAN_TUNAI = 51;
    public static int TRANSFER = 52;
    public static int PEMBAYARAN = 53;
    public static int ISI_ULANG = 54;
    
    public Transaksi(int kode, double jumlah) {
        this.kode = kode;
        this.jumlah = jumlah;
        date = new SimpleDateFormat("dd/MM/yy").format(new Date());
        if (kode == SETORAN_AWAL)
            saldo = jumlah;
        else if (kode == TRANSFER_MASUK || kode == SETORAN_TUNAI)
            saldo = Database.getInstance().getNasabah(TransaksiController.getInstance().getIndex()).getTabungan().getSaldo();
        else
            saldo = Database.getInstance().getNasabah().getTabungan().getSaldo();
    }

    public String getDate() {
        return date;
    }

    public int getKode() {
        return kode;
    }

    public double getJumlah() {
        return jumlah;
    }
    
    public String getNominal() {
        return RupiahFormatter.getInstance().format(jumlah);
    }

    public String getSaldo() {
        return RupiahFormatter.getInstance().format(saldo);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class Nasabah extends User {
    private long rekening;
    private String pin;
    private Tabungan tabungan;
    private List<Transaksi> listTransaksi = new ArrayList<>();;
    private Kartu kartu;
    private double jumlahTransfer = 0;
    private double jumlahTarik = 0;

    public Nasabah(String nama, String nickname, String nik, String jenisKelamin, String tempatLahir, String tanggalLahir, String email, String nomorHP, String alamat, String userId, String password, long rekening, String pin, Kartu kartu, double saldo) {
        super(nama, nickname, nik, jenisKelamin, tempatLahir, tanggalLahir, email, nomorHP, alamat, userId, password);
        this.rekening = rekening;
        this.pin = pin;
        tabungan = new Tabungan(saldo);
        this.kartu = kartu;
    }
    
    public Nasabah(String nama, String nickname, String userId, String password, long rekening, String pin, Kartu kartu, double saldo) {
        super(nama, nickname, userId, password);
        this.rekening = rekening;
        this.pin = pin;
        this.kartu = kartu;
        tabungan = new Tabungan(saldo);
    }
    
    public void addTransaksi(int kode, double jumlah) {
        listTransaksi.add(new Transaksi(kode, jumlah));
        if (kode == Transaksi.TRANSFER)
            jumlahTransfer += jumlah;
        if (kode == Transaksi.PENARIKAN_TUNAI)
            jumlahTarik += jumlah;
    }
    
    public List<Transaksi> getListTransaksi() {
        return listTransaksi;
    }

    public void setNomorPin(String pin) {
        this.pin = pin;
    }

    public long getNomorRekening() {
        return rekening;
    }

    public String getNomorPin() {
        return pin;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }
    
    public boolean isRekening(long rekening) {
        return this.rekening == rekening;
    }
    
    public boolean isPin(String pin) {
        return this.pin.equals(pin);
    }

    public long getRekening() {
        return rekening;
    }

    public String getPin() {
        return pin;
    }

    public void setRekening(long rekening) {
        this.rekening = rekening;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Kartu getKartu() {
        return kartu;
    }

    public double getJumlahTransfer() {
        return jumlahTransfer;
    }

    public double getJumlahTarik() {
        return jumlahTarik;
    }
    
    
}

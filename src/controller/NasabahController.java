/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Database;
import model.Kartu;
import model.Nasabah;
import model.Transaksi;
import utilities.RupiahFormatter;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class NasabahController {
    
    private static NasabahController instance;
    
    public NasabahController() {
    }
    
    public static NasabahController getInstance() {
        if (instance == null) {
            instance = new NasabahController();
        }
        return instance;
    }
    
    public void addNasabah(String nama, String nickname, String nik, String jenisKelamin, String tempatLahir, String tanggalLahir, String email, String nomorHP, String alamat, String userId, String password, long rekening, String pin, Kartu kartu, double saldo) {
        Database.getInstance().getListNasabah().add(new Nasabah(nama, nickname, nik, jenisKelamin, tempatLahir, tanggalLahir, email, nomorHP, alamat, userId, password, rekening, pin, kartu, saldo));
        Database.getInstance().getListNasabah().get(Database.getInstance().getJumlahNasabah()-1).addTransaksi(Transaksi.SETORAN_AWAL, saldo);
    }
    
    public void addNasabah(String nama, String nickname, String userId, String password, long rekening, String pin, Kartu kartu, double saldo) {
        Database.getInstance().getListNasabah().add(new Nasabah(nama, nickname, userId, password, rekening, pin, kartu, saldo));
        Database.getInstance().getListNasabah().get(Database.getInstance().getJumlahNasabah()-1).addTransaksi(Transaksi.SETORAN_AWAL, saldo);
    }
    
    public String getSaldo() {
        return RupiahFormatter.getInstance().format(Database.getInstance().getNasabah().getTabungan().getSaldo());
    }
    
    public String getSaldo(int i) {
        return RupiahFormatter.getInstance().format(Database.getInstance().getNasabah(i).getTabungan().getSaldo());
    }
    
    public boolean isValidPin(String pin) {
        return Database.getInstance().getNasabah().isPin(pin);
    }
    
    public void gantiPin(String pin) {
        Database.getInstance().getNasabah().setPin(pin);
    }
    
    public boolean validasiPin(String pin) {
        try {
            long p = Long.parseLong(pin);
            if (pin.length() == 6)
                return true;
            else
                return false;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean isValidUserId(String userId) {
        return Database.getInstance().getNasabah().isUserId(userId);
    }
    
    public boolean isValidPassword(String password) {
        return Database.getInstance().getNasabah().isPassword(password);
    }
    
    public void changeUserId(String userId) {
        Database.getInstance().getNasabah().setUserId(userId);
    }
    
    public void changePassword(String password) {
        Database.getInstance().getNasabah().setPassword(password);
    }
    
    public boolean isRekening(long rekening) {
        boolean valid = false;
        for (int i=0; i<Database.getInstance().getJumlahNasabah(); i++) {
            if(Database.getInstance().getNasabah(i).isRekening(rekening)) {
                valid = true;
                TransaksiController.getInstance().setIndex(i);
            }
        }
        return valid;
    }
    
    public boolean isUserId(String userId) {
        boolean valid = false;
        for (int i=0; i<Database.getInstance().getJumlahNasabah(); i++) {
            if(Database.getInstance().getNasabah(i).isUserId(userId))
                valid = true;
        }
        return valid;
    }
    
    public void deleteNasabah(int index) {
        Database.getInstance().getListNasabah().remove(index);
    }
    
    public String getKartu() {
        switch(Database.getInstance().getNasabah().getKartu()) {
            case SILVER: return "Silver";
            case GOLD: return "Gold";
            case PLATINUM: return "Platinum";
            default: return null;
        }
    }
    
    public String getKartu(int i) {
        switch(Database.getInstance().getNasabah(i).getKartu()) {
            case SILVER: return "Silver";
            case GOLD: return "Gold";
            case PLATINUM: return "Platinum";
            default: return null;
        }
    }
    
    public double getLimitTransfer() {
        switch(Database.getInstance().getNasabah().getKartu()) {
            case SILVER: return 5000000;
            case GOLD: return 10000000;
            case PLATINUM: return 25000000;
            default: return 0;
        }
    }
    
    public double getLimitTarik() {
        switch(Database.getInstance().getNasabah().getKartu()) {
            case SILVER: return 5000000;
            case GOLD: return 7500000;
            case PLATINUM: return 10000000;
            default: return 0;
        }
    }
    
    public double getLimitTarik(int index) {
        switch(Database.getInstance().getNasabah(index).getKartu()) {
            case SILVER: return 5000000;
            case GOLD: return 7500000;
            case PLATINUM: return 10000000;
            default: return 0;
        }
    }
    
    public double getMinimumDeposit(Kartu kartu) {
        switch(kartu) {
            case SILVER: return 250000;
            case GOLD: return 500000;
            case PLATINUM: return 1000000;
            default: return 0;
        }
    }
    
    public double getMinimumSaldo() {
        switch(Database.getInstance().getNasabah().getKartu()) {
            case SILVER: return 50000;
            case GOLD: return 75000;
            case PLATINUM: return 100000;
            default: return 0;
        }
    }
}

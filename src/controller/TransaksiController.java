/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Random;
import model.Database;
import model.Tarif;
import model.Transaksi;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class TransaksiController {
    
    private static TransaksiController instance;
    private int index;
    private double nominal;
    private Random random = new Random();
    
    public static TransaksiController getInstance() {
        if (instance == null ) {
            instance = new TransaksiController();
            return instance;
        }
        else
            return instance;
    }
    
    public boolean validRekeningTransfer(long noRekening){
        boolean valid = false;
        if (!(Database.getInstance().getNasabah().isRekening(noRekening))) {
            for (int i=0; i<Database.getInstance().getJumlahNasabah(); i++) {
                if (Database.getInstance().getNasabah(i).isRekening(noRekening)) {
                    valid = true;
                    index = i;
                }
            }
        }
        return valid;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public int getIndex() {
        return index;
    }
    
    public boolean validWithdraw() {
        return Database.getInstance().getNasabah().getTabungan().validWithdraw(nominal);
    }
    
    public boolean validWithdraw(int index) {
        return Database.getInstance().getNasabah(index).getTabungan().validWithdraw(nominal);
    }
    
    public boolean validTransfer() {
        return (NasabahController.getInstance().getLimitTransfer()>=(Database.getInstance().getNasabah().getJumlahTransfer()+nominal));
    }
    
    public boolean validTarik() {
        return (NasabahController.getInstance().getLimitTarik()>=Database.getInstance().getNasabah().getJumlahTarik()+nominal);
    }
    
    public boolean validAdminTarik() {
        return (NasabahController.getInstance().getLimitTarik(index)>=Database.getInstance().getNasabah(index).getJumlahTarik()+nominal);
    }
    
    public void transfer() {
        Database.getInstance().getNasabah().getTabungan().withdraw(nominal);
        Database.getInstance().getNasabah().addTransaksi(Transaksi.TRANSFER, nominal);
        Database.getInstance().getNasabah(index).getTabungan().add(nominal);
        Database.getInstance().getNasabah(index).addTransaksi(Transaksi.TRANSFER_MASUK, nominal);
    }
    
    public void bayarTagihan() {
        nominal += Tarif.getInstance().getAdminTagihan();
        Database.getInstance().getNasabah().getTabungan().withdraw(nominal);
        Database.getInstance().getNasabah().addTransaksi(Transaksi.PEMBAYARAN, nominal);
    }

    public void tarik() {
        Database.getInstance().getNasabah().getTabungan().withdraw(nominal);
        Database.getInstance().getNasabah().addTransaksi(Transaksi.PENARIKAN_TUNAI, nominal);
    }
    
    public void isiUlang() {
        Database.getInstance().getNasabah().getTabungan().withdraw(nominal);
        Database.getInstance().getNasabah().addTransaksi(Transaksi.ISI_ULANG, nominal);
    }
    
    public void setorTunai() {
        Database.getInstance().getNasabah(index).getTabungan().add(nominal);
        Database.getInstance().getNasabah(index).addTransaksi(Transaksi.SETORAN_TUNAI, nominal);
    }
    
    public void tarikTunai() {
        Database.getInstance().getNasabah(index).getTabungan().withdraw(nominal);
        Database.getInstance().getNasabah(index).addTransaksi(Transaksi.PENARIKAN_TUNAI, nominal);
    }
    
    public double getNominal() {
        return nominal;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }
    
    
    public void setTagihan(int index) {
        switch(index) {
            case 0:
                this.nominal = random.nextInt(Tarif.getInstance().getPlnMaximum()-Tarif.getInstance().getPlnMinimum()) + Tarif.getInstance().getPlnMinimum();
                break;
            case 1:
                this.nominal = random.nextInt(Tarif.getInstance().getPdamMaximum()-Tarif.getInstance().getPdamMinimum()) + Tarif.getInstance().getPdamMinimum();
                break;
        }
    }
}

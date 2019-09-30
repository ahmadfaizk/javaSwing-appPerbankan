/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class Tabungan {
    private double saldo;

    public Tabungan(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void add(double saldo) {
        this.saldo += saldo;
    }
    
    public boolean validWithdraw(double saldo) {
        if (saldo <= this.saldo) {
            return true;
        }
        else
            return false;
    }
    
    public void withdraw(double saldo) {
        this.saldo -= saldo;
    }
}

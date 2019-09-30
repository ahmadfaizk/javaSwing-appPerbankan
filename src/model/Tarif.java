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
public class Tarif {
    private static Tarif instance;
    private int plnMaximum = 200000;
    private int plnMinimum = 50000;
    private int pdamMaximum = 100000;
    private int pdamMinimum = 30000;
    private int adminTagihan = 3000;
    
    public Tarif(){
    }
    
    public static Tarif getInstance() {
        if (instance == null)
            instance = new Tarif();
        return instance;
    }

    public int getPlnMaximum() {
        return plnMaximum;
    }

    public int getPlnMinimum() {
        return plnMinimum;
    }

    public int getPdamMaximum() {
        return pdamMaximum;
    }

    public int getPdamMinimum() {
        return pdamMinimum;
    }

    public int getAdminTagihan() {
        return adminTagihan;
    }
    
    
}

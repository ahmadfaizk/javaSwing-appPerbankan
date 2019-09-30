/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Database;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class LoginController {
    
    private static LoginController instance;

    public LoginController() {
    }
    
    public static LoginController getInstance() {
        if (instance == null)
            instance = new LoginController();
        return instance;
    }
    
    public boolean isValidNasabah(String userId, String password) {
        boolean valid = false;
        for (int i=0; i<Database.getInstance().getJumlahNasabah(); i++) {
            if (Database.getInstance().getNasabah(i).isUserId(userId) && Database.getInstance().getNasabah(i).isPassword(password)){
                valid = true;
                Database.getInstance().setIndexActiveUser(i);
                break;
            }
        }
        return valid;
    }
    
    public boolean isValidAdmin(String userId, String password) {
        boolean valid = false;
        for (int i=0; i<Database.getInstance().getJumlahAdmin(); i++) {
            if (Database.getInstance().getAdmin(i).isUserId(userId) && Database.getInstance().getAdmin(i).isPassword(password)){
                valid = true;
                Database.getInstance().setIndexActiveUser(i);
                break;
            }
        }
        return valid;
    }
}

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
public class AdminController {
    
    private static AdminController instance;

    public AdminController() {
    }
    
    public static AdminController getInstance() {
        if(instance == null)
            instance = new AdminController();
        return instance;
    }
    
    public boolean isUserId(String userId) {
        boolean valid = false;
        for (int i=0; i<Database.getInstance().getJumlahAdmin(); i++) {
            if(Database.getInstance().getAdmin(i).isUserId(userId))
                valid = true;
        }
        return valid;
    }
}

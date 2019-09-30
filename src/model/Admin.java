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
public class Admin extends User {

    public Admin(String nama, String nickname, String nik, String jenisKelamin, String tempatLahir, String tanggalLahir, String email, String nomorHP, String alamat, String userId, String password) {
        super(nama, nickname, nik, jenisKelamin, tempatLahir, tanggalLahir, email, nomorHP, alamat, userId, password);
    }

    public Admin(String nama, String nickname, String userId, String password) {
        super(nama, nickname, userId, password);
    }
    
    
}

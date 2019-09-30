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
public class User {
    private String nama;
    private String nickname;
    private String nik;
    private String userId;
    private String password;
    private String nomorHP;
    private String email;
    private String jenisKelamin;
    private String alamat;
    private String tempatLahir;
    private String tanggalLahir;
    
    public User(String nama, String nickname, String userId, String password) {
        this.nama = nama;
        this.nickname = nickname;
        this.userId = userId;
        this.password = password;
    }

    public User(String nama, String nickname, String nik, String jenisKelamin, String tempatLahir, String tanggalLahir, String email, String nomorHP, String alamat, String userId, String password) {
        this.nama = nama;
        this.nickname = nickname;
        this.userId = userId;
        this.password = password;
        this.tempatLahir = tempatLahir;
        this.email = email;
        this.nomorHP = nomorHP;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.nik = nik;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public String getNickname() {
        return nickname;
    }

    public String getUserId() {
        return userId;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return jenisKelamin;
    }

    public String getPassword() {
        return password;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public boolean isUserId(String userId) {
        return this.userId.equals(userId);
    }
    
    public boolean isPassword(String password) {
        return this.password.equals(password);
    }

    public String getTmpLahir() {
        return tempatLahir;
    }

    public String getNik() {
        return nik;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

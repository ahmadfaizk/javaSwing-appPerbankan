package model;

import java.util.*;
/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class Database {
    
    private static Database instance;
    private List<Nasabah> listNasabah = new ArrayList<>();
    private List<Admin> listAdmin = new ArrayList<>();
    private int index;

    public int getIndexActiveUser() {
        return index;
    }

    public void setIndexActiveUser(int indexActiveUser) {
        this.index = indexActiveUser;
    }
    
    public Database() {
    }
    
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
            instance.getListNasabah().add(new Nasabah("User 1", "User", "01", "Laki-laki", "Nganjuk", "04 Agustus 2000", "user1@gmail.com", "0838453234", "Surabaya", "user1", "user1", 2103181047, "000000", Kartu.PLATINUM, 50000000));
            instance.getListNasabah().get(0).addTransaksi(Transaksi.SETORAN_AWAL, 50000000);
            instance.getListNasabah().add(new Nasabah("User 2", "User", "02", "Perempuan", "Jombang", "12 Maret 2000", "user2@gmail.com", "0815512386968", "Surabaya", "user2", "user2", 2103181036, "000000", Kartu.SILVER, 20000000));
            instance.getListNasabah().get(1).addTransaksi(Transaksi.SETORAN_AWAL, 20000000);
            instance.listAdmin.add(new Admin("Admin", "Admin", "admin", "admin"));
        }
        return instance;
    }

    public List<Nasabah> getListNasabah() {
        return listNasabah;
    }
    
    public Nasabah getNasabah(int index) {
        return listNasabah.get(index);
    }
    
    public Nasabah getNasabah() {
        return listNasabah.get(index);
    }
    
    public Admin getAdmin() {
        return listAdmin.get(index);
    }
    
    public Admin getAdmin(int index) {
        return listAdmin.get(index);
    }
    
    public int getJumlahNasabah() {
        return listNasabah.size();
    }
    
    public int getJumlahAdmin() {
        return listAdmin.size();
    }
}

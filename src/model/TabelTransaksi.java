/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class TabelTransaksi extends AbstractTableModel {
    
    private List<Transaksi> transaksi;

    public TabelTransaksi(List<Transaksi> transaksi) {
        this.transaksi = transaksi;
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0: return
                    transaksi.get(row).getDate();
            case 1: return
                    transaksi.get(row).getKode();
            case 2: 
                if (transaksi.get(row).getKode()<50) {
                    return transaksi.get(row).getNominal();
                }
                else
                    return "-";
            case 3:
                if (transaksi.get(row).getKode()>50) {
                    return transaksi.get(row).getNominal();
                }
                else
                    return "-";
            case 4:
                return transaksi.get(row).getSaldo();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Tanggal";
            case 1: return "Kode";
            case 2: return "Debet";
            case 3: return "Kredit";
            case 4: return "Saldo";
            default: return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return transaksi.size();
    }
    
    
}

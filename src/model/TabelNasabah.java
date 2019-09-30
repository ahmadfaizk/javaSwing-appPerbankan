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
public class TabelNasabah extends AbstractTableModel {

    private List<Nasabah> nasabah;

    public TabelNasabah(List<Nasabah> nasabah) {
        this.nasabah = nasabah;
    }
    
    @Override
    public int getRowCount() {
        return nasabah.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "No.";
            case 1:
                return "Nama";
            case 2:
                return "No. Rekening";
            case 3:
                return "No. HP";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column) {
            case 0:
                return (row+1);
            case 1:
                return nasabah.get(row).getNama();
            case 2:
                return nasabah.get(row).getRekening();
            case 3:
                return nasabah.get(row).getNomorHP();
            default:
                return null;
        }
    }
    
}

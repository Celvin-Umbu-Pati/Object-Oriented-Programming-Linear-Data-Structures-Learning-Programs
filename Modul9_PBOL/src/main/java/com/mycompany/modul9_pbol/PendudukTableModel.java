/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9_pbol;

/**
 *
 * @author Celvin Pati
 */
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PendudukTableModel extends AbstractTableModel {
    
    private List<Penduduk> daftarPenduduk;
    
    public PendudukTableModel(List<Penduduk> dp) {
        this.daftarPenduduk = dp;
    }
    @Override
    public int getRowCount() {
        return daftarPenduduk.size();
    }
    @Override
    public int getColumnCount() {
        return 7;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Penduduk p = daftarPenduduk.get(rowIndex);
        switch(columnIndex){
            case 0: return p.getNik();
            case 1: return p.getNama();
            case 2: return p.getJenisKelamin();
            case 3: return p.getTanggalLahir();
            case 4: return p.getNoHp();
            case 5: return p.getAlamat();
            case 6: return p.getId();
            default: return "";
        }
    }
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "NIK";
            case 1: return "Nama";
            case 2: return "Jenis Kelamin";
            case 3: return "Tanggal Lahir";
            case 4: return "No HP";
            case 5: return "Alamat";
            case 6: return "ID";
            default: return "";
        }
    }
}

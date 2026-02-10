/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author celvin paty
 */
public class MahasiswaTableModel extends AbstractTableModel {

    private List<Mahasiswa> daftarMahasiswa = new ArrayList();

    public MahasiswaTableModel(List<Mahasiswa> mhs) {
        this.daftarMahasiswa = mhs;
    }

    @Override
    public int getRowCount() {
        return daftarMahasiswa.size();
    }

    @Override
    public int getColumnCount() {
        return 2;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mahasiswa mhs = daftarMahasiswa.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mhs.getNim();
            case 1:
                return mhs.getNama();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIM";
            case 1:
                return "Nama";
            default:
                return "";
        }
    }
}

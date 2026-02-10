/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9_pbol;


import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JdbcOracleExample {
    // Ganti dengan detail database Anda
    static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    static final String USERNAME = "hr";
    static final String PASSWORD = "mhs245314033";
    
    static Connection connection;
    static Statement statement;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("====================");
        
        try {
            System.out.println("Mencoba membuat koneksi ke database...");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Koneksi ke database berhasil terbentuk");
            
            // Membuat tabel jika belum ada
            createTable();
            
            // Menampilkan menu
            showMenu();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }

    static void createTable() throws SQLException {
        statement = connection.createStatement();
        String createTableSQL = "CREATE TABLE latihan_jdbc ("
                + "id NUMBER PRIMARY KEY, "
                + "nama VARCHAR2(50), "
                + "alamat VARCHAR2(100))";
        try {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            if (e.getErrorCode() == 955) { // ORA-00955: name already used
                System.out.println("Info: ORA-00955: name is already used by an existing object");
            } else {
                throw e;
            }
        }
    }

    static void showMenu() throws SQLException {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Isi Tabel");
            System.out.println("2. Tambah Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu = ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    viewData();
                    break;
                case 2:
                    insertData();
                    break;
                case 3:
                    deleteData();
                    break;
                case 4:
                    updateData();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void viewData() throws SQLException {
        String query = "SELECT * FROM latihan_jdbc";
        ResultSet rs = statement.executeQuery(query);
        
        System.out.println("\nData dalam Tabel:");
        System.out.println("ID\tNama\tAlamat");
        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + "\t" +
                rs.getString("nama") + "\t" +
                rs.getString("alamat")
            );
        }
        rs.close();
    }

    static void insertData() throws SQLException {
        System.out.print("Masukkan ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        
        String sql = "INSERT INTO latihan_jdbc VALUES (?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.setString(2, nama);
        pstmt.setString(3, alamat);
        
        pstmt.executeUpdate();
        System.out.println("Data berhasil ditambahkan!");
        pstmt.close();
    }

    static void deleteData() throws SQLException {
        System.out.print("Masukkan ID yang akan dihapus: ");
        int id = scanner.nextInt();
        
        String sql = "DELETE FROM latihan_jdbc WHERE id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, id);
        
        int affectedRows = pstmt.executeUpdate();
        if (affectedRows > 0) {
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Data dengan ID tersebut tidak ditemukan!");
        }
        pstmt.close();
    }

    static void updateData() throws SQLException {
        System.out.print("Masukkan ID yang akan diupdate: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Nama Baru: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Alamat Baru: ");
        String alamat = scanner.nextLine();
        
        String sql = "UPDATE latihan_jdbc SET nama = ?, alamat = ? WHERE id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, nama);
        pstmt.setString(2, alamat);
        pstmt.setInt(3, id);
        
        int affectedRows = pstmt.executeUpdate();
        if (affectedRows > 0) {
            System.out.println("Data berhasil diupdate!");
        } else {
            System.out.println("Data dengan ID tersebut tidak ditemukan!");
        }
        pstmt.close();
    }

    static void closeResources() {
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Celvin Pati
 */


public class MahasiswaDAO {

    // INSERT
    public static boolean insertMahasiswa(Mahasiswa m) {
        String sql = "INSERT INTO mahasiswa (nim, nama, ipk) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getNim());
            ps.setString(2, m.getNama());
            ps.setDouble(3, m.getIpk());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error insert: " + e.getMessage());
            return false;
        }
    }

    // UPDATE
    public static boolean updateMahasiswa(Mahasiswa m) {
        String sql = "UPDATE mahasiswa SET nama=?, ipk=? WHERE nim=?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getNama());
            ps.setDouble(2, m.getIpk());
            ps.setString(3, m.getNim());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error update: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public static boolean deleteMahasiswa(String nim) {
        String sql = "DELETE FROM mahasiswa WHERE nim=?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nim);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error delete: " + e.getMessage());
            return false;
        }
    }

    // GET ALL
    public static List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa ORDER BY nim";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                        rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getDouble("ipk")
                );
                list.add(m);
            }

        } catch (Exception e) {
            System.out.println("Error get all: " + e.getMessage());
        }

        return list;
    }
}

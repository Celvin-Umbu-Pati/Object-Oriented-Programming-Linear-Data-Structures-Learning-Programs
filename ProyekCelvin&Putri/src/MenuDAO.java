/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuDAO {

    public static List<Menu> getAllMenu() {
        List<Menu> list = new ArrayList<>();

        String sql = "SELECT id, nama, harga, jenis FROM menu ORDER BY id";

        try {
            PreparedStatement ps = DatabaseConnection.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Menu m = new Menu(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getDouble("harga"),
                        rs.getString("jenis")
                );
                list.add(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static Menu getMenuById(int id) {
        Menu menu = null;

        String sql = "SELECT id, nama, harga, jenis FROM menu WHERE id = ?";

        try {
            PreparedStatement ps = DatabaseConnection.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                menu = new Menu(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getDouble("harga"),
                        rs.getString("jenis")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return menu;
    }
}

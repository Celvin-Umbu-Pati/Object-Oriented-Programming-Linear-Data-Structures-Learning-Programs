/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class EmployeeDAO {

    public static DefaultTableModel getEmployeesByDepartment(String deptName) {
        DefaultTableModel model = new DefaultTableModel(
                new String[]{"ID", "First Name", "Last Name", "Dept ID"}, 0);

        String sql =
                "SELECT employee_id, first_name, last_name, e.department_id " +
                "FROM employees e JOIN departments d ON e.department_id = d.department_id " +
                "WHERE LOWER(d.department_name) = LOWER(?)";

        try {
            PreparedStatement ps = DatabaseConnection.conn.prepareStatement(sql);
            ps.setString(1, deptName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return model;
    }
}

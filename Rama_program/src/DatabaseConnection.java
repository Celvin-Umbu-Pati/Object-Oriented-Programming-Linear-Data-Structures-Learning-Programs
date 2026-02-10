/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection conn = null;
    public static String username;
    public static String password;

    public static boolean connect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";


            conn = DriverManager.getConnection(url, username, password);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

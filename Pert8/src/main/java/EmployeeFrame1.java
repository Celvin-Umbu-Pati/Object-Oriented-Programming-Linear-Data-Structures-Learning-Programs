
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class EmployeeFrame1 extends JFrame {

    private JLabel lblDept;
    private JTextField txtDept;
    private JButton btnCari;
    private JTable tblEmp;
    private JScrollPane scrollTable;

    public EmployeeFrame1() {
        setTitle("Employee Browser");
        setSize(600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblDept = new JLabel("Departemen:");
        lblDept.setBounds(20, 20, 120, 25);
        add(lblDept);

        txtDept = new JTextField();
        txtDept.setBounds(130, 20, 200, 25);
        add(txtDept);

        btnCari = new JButton("Cari");
        btnCari.setBounds(350, 20, 100, 25);
        add(btnCari);

        // Tabel dummy untuk melihat GUI
        tblEmp = new JTable(
            new Object[][] {
                {"25348", "Matthew", "Smith", "3"},
                {"10102", "Ann", "Jones", "3"},
                {"18316", "John", "Barrimore", "1"}
            },
            new String[] {"ID", "First Name", "Last Name", "Dept ID"}
        );

        scrollTable = new JScrollPane(tblEmp);
        scrollTable.setBounds(20, 70, 540, 250);
        add(scrollTable);
    }

    public static void main(String[] args) {
        new EmployeeFrame().setVisible(true);
    }
}

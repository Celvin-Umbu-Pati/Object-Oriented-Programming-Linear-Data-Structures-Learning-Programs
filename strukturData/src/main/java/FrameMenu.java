/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import javax.swing.*;

public class FrameMenu extends JFrame {
    public FrameMenu() {
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Demo Menu");

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // Menu "File"
        JMenu fileMenu = new JMenu("File");

        // Item "Open"
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        // Submenu "Save"
        JMenu saveMenu = new JMenu("Save");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem saveAsItem = new JMenuItem("Save as");
        saveMenu.add(saveItem);
        saveMenu.add(saveAsItem);
        fileMenu.add(saveMenu);
        fileMenu.add(new JSeparator()); // garis setelah Save

        // Submenu "Export"
        JMenu exportMenu = new JMenu("Export");

        // Submenu "Document"
        JMenu documentMenu = new JMenu("Document");
        JMenuItem docItem = new JMenuItem(".doc");
        JMenuItem docxItem = new JMenuItem(".docx");
        JMenuItem docxxItem = new JMenuItem(".docxx");
        documentMenu.add(docItem);
        documentMenu.add(docxItem);
        documentMenu.add(docxxItem);
        exportMenu.add(documentMenu);
        exportMenu.add(new JSeparator()); // garis setelah Document

        // Tambah format lain
        JMenuItem pdfItem = new JMenuItem(".pdf");
        JMenuItem xmlItem = new JMenuItem(".xml");
        exportMenu.add(pdfItem);
        exportMenu.add(xmlItem);

        fileMenu.add(exportMenu);
        fileMenu.add(new JSeparator()); // garis setelah Export

        // Item "Exit"
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);

        // Tambahkan File ke MenuBar
        menuBar.add(fileMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameMenu();
    }
}


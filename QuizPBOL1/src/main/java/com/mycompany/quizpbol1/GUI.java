/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quizpbol1;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.*;

public class GUI {

    public JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenu saveMenu = new JMenu("Save");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem saveAsItem = new JMenuItem("Save as");
        saveMenu.add(saveItem);
        saveMenu.add(saveAsItem);
        saveMenu.add(new JSeparator());

        JMenu exportMenu = new JMenu("Export");

        JMenu documentMenu = new JMenu("Document");
        JMenuItem docItem = new JMenuItem(".doc");
        JMenuItem docxItem = new JMenuItem(".docx");
        JMenuItem docxxItem = new JMenuItem(".docxx");
        documentMenu.add(docItem);
        documentMenu.add(docxItem);
        documentMenu.add(docxxItem);
        exportMenu.add(documentMenu);
        exportMenu.add(new JSeparator());

        JMenuItem pdfItem = new JMenuItem(".pdf");
        JMenuItem xmlItem = new JMenuItem(".xml");
        exportMenu.add(pdfItem);
        exportMenu.add(xmlItem);

        saveMenu.add(exportMenu);
        saveMenu.add(new JSeparator());

        fileMenu.add(saveMenu);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        return menuBar;
    }  
}

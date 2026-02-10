/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author tatik
 */
public class JFrameMenu extends JFrame{

    public JFrameMenu()  {
        Container contentPane;
        //set the frame properties
        setTitle     ("JFrameMenu");
        setSize      (600,400);
        setResizable (false);
        setLocation  (10,10);
        
        contentPane = getContentPane( );
        contentPane.setBackground(Color.cyan);
        
//        JLabel response = new JLabel("Hello, this is your menu tester." );
//        response.setSize(250, 50);
//        contentPane.add(response);
        
        JMenuBar menuBar=new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenuItem item1 = new JMenuItem("Baru");
        JMenuItem item2= new JMenuItem("Simpan");
                
        fileMenu.add(item1);
        fileMenu.add(item2);
        
        JMenu fileMenu2 = new JMenu("Edit");
        JMenuItem item21 = new JMenuItem("Cut");
        JMenuItem item22= new JMenuItem("Salin");
                
        fileMenu2.add(item21);
        fileMenu2.add(item22);
        
        menuBar.add(fileMenu);
        menuBar.add(fileMenu2);
        this.setJMenuBar(menuBar);
        
    }
    public static void main(String[] args) {
        JFrameMenu jfm=new JFrameMenu();
        jfm.setVisible(true);
    }
}

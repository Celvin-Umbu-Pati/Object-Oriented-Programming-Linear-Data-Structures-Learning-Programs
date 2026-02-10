package gui;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 14 Sample Program: A simple subclass of JFrame
                              that changes the background
                              color to white.

    File: Ch14JFrameSubclass2.java

*/

import javax.swing.*;
import java.awt.*;

/**
 * A sample frame to illustrate the inheritance mechanism of Java.
 */
class JFrameSubclass2 extends JFrame {
    private static final int FRAME_WIDTH    = 600;
    private static final int FRAME_HEIGHT   = 400;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 50;

    public JFrameSubclass2( ) {
        //set the frame default properties
        setTitle     ( "Background JFrame Subclass" );
        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
        
//        changeBkColor( );
    }
public static void main(String[] args) {
        JFrameSubclass2 jf=new JFrameSubclass2();
        jf.setVisible(true);
    }
    /**
     * change the backround color to white
     */
//    private void changeBkColor() {
//        Container contentPane = this.getContentPane();
//        contentPane.setBackground(Color.GREEN);
//   }
}
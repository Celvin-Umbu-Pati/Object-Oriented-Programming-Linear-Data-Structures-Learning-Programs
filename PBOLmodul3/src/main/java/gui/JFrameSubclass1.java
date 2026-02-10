package gui;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 14 Sample Program: A simple subclass of JFrame

    File: Ch14JFrameSubclass1.java

*/

import javax.swing.*;

/**
 * A sample frame to illustrate the inheritance mechanism of Java.
 */
class JFrameSubclass1 extends JFrame {
    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public JFrameSubclass1( ) {
        //set the frame default properties
        
        setTitle     ( "PBO II" );
        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );

        setDefaultCloseOperation( EXIT_ON_CLOSE );

   }
public static void main(String[] args) {
        JFrameSubclass1 jf=new JFrameSubclass1();
        jf.setVisible(true);
    }
}
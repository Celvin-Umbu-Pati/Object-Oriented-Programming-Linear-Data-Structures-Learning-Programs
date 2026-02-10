package gui;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 14 Sample Program: Illustrates the use of JComboBox

    File: Ch14JComboBoxSample.java

 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Ch14JRadioButton class
 *
 * <p>
 * A sample frame to illustrate the use of JComboBox.
 */
class Ch14JComboBoxSample extends JFrame {

//----------------------------------
//    Data Members
//----------------------------------
    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH = 300;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT = 200;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;

    /**
     * A combo box of programming languages
     */
    private JComboBox comboBox;

//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Ch14JComboBoxSample frame = new Ch14JComboBoxSample();
        frame.setVisible(true);
    }

//----------------------------------
//    Constructors
//----------------------------------
    /**
     * Default constructor
     */
    public Ch14JComboBoxSample() {
        Container contentPane;
        JPanel comboPanel, okPanel;

        JButton okButton;
        String[] comboBoxItem = {"Java", "C++", "Smalltalk", "Ada"};

        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14JComboBoxSample");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        //create and place a combo box
        comboPanel = new JPanel(new FlowLayout());
        comboPanel.setBorder(
                BorderFactory.createTitledBorder("Pick your favorite"));

        comboBox = new JComboBox(comboBoxItem);
        comboPanel.add(comboBox);

        //create and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okPanel.add(okButton);

        contentPane.add(comboPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}

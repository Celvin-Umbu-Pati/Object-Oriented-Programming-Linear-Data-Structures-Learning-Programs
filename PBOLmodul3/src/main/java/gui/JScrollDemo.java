// JScrollDemo (p. 587)
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JScrollDemo extends JFrame
{
	JPanel panel = new JPanel();
	JScrollPane scroll = new JScrollPane( panel,
		ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS );
	JLabel label = new JLabel( "Event Handlers Incorporated" );
	Font bigFont = new Font( "Arial", Font.PLAIN, 720 );
	
	public JScrollDemo()
	{
		super( "JScrollDemo" );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		label.setFont( bigFont );
		panel.add( label );
		setContentPane( scroll );
	}
	
	public static void main( String [] args )
	{
		JFrame aFrame = new JScrollDemo();
		aFrame.setSize( 180, 100 );
		aFrame.setVisible( true );
	}
}
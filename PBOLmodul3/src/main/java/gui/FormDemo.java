// FormDemo (p. 580)
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormDemo extends JFrame
{
	JPanel panel = new JPanel();
	JLabel lblBeverage = new JLabel( "What would you like to drink?" );
	Font fntItalics = new Font( "Arial", Font.ITALIC, 20 );
	JLabel lblBeverages = new JLabel( "" );
	
	JCheckBox box1 = new JCheckBox( "Coffee" );						
	JCheckBox box2 = new JCheckBox( "Cola" );		
	JCheckBox box3 = new JCheckBox( "Milk" );		
	JCheckBox box4 = new JCheckBox( "Water" );							
	
	JLabel lblStatus = new JLabel( "Status:" );	
	ButtonGroup aGroup = new ButtonGroup();
	JRadioButton radioFull = new JRadioButton( "Full Time" );
	JRadioButton radioPart = new JRadioButton( "Part Time" );	
	JLabel lblStatusResult = new JLabel( "" );
	
	JLabel lblMajor = new JLabel( "Select a major: " );
	JComboBox majorChoice = new JComboBox();

	JLabel lblMinor = new JLabel( "Select a minor: " );
	String [] minorArray = { "English", "Math", "Sociology" };		
	JComboBox minorChoice = new JComboBox( minorArray );
	
	public FormDemo()
	{
		super( "Form Demo" );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// add label
		lblBeverage.setFont( fntItalics );
		panel.add( lblBeverage );

		box1.setSelected( true );
		
			
		
		//  add checkbox
		panel.add( box1 );
		panel.add( box2 );
		panel.add( box3 );
		panel.add( box4 );						

		// add label
		lblStatus.setFont( fntItalics );
		panel.add( lblStatus );
		
		// add radio buttons to group
		aGroup.add( radioFull );
		aGroup.add( radioPart );		
		
									
		
		panel.add( radioFull );		
		panel.add( radioPart );				
		
		// add group
		//panel.add( aGroup );
		
		// add combobox label
		lblMajor.setFont( fntItalics );		
		panel.add( lblMajor );		
		
		// add items to combobox
		majorChoice.addItem( "English" );
		majorChoice.addItem( "Math" );
		majorChoice.addItem( "Sociology" );			
		panel.add( majorChoice );

		// add combobox label
		lblMinor.setFont( fntItalics );
		panel.add( lblMinor );
		panel.add( minorChoice );

		// add beverages and status result
		panel.add( lblBeverages );
		panel.add( lblStatusResult );
		
		setContentPane( panel );
	}
	
	public static void main( String [] args )
	{
		JFrame aFrame = new FormDemo();
		aFrame.setSize( 300, 250 );
		aFrame.setVisible( true );
	}
}

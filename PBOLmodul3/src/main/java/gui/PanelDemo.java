package gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
public class PanelDemo 
{
    
    static JFrame aWindow=new JFrame();
    public static void main(String [] args)
    {
        JButton next, prev, first;
        JList list1;
             
        Container content = aWindow.getContentPane(); // Get the content pane
        aWindow.setSize(300,200);
                
        next = new JButton("Next >>");
        prev = new JButton("<< Previous");
        first = new JButton("First");
        JPanel southPanel = new JPanel();
        southPanel.add(prev);
        southPanel.add(first);
        southPanel.add(next);
        content.add(southPanel, BorderLayout.SOUTH);
        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("Make a selection"));
        content.add(northPanel, BorderLayout.NORTH);
        
        String labels[] = { "Chardonnay", "Sauvignon", "Riesling", "Cabernet", "Zinfandel",
"Merlot", "Pinot Noir", "Sauvignon Blanc", "Syrah", "Gewürztraminer"};
        list1 = new JList(labels);
        content.add(list1, BorderLayout.CENTER);
        
        aWindow.setVisible(true);
    }
}
package pr0607;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FormNew 
{
	
	JFrame frame;
	JTextField tx1, tx2, tx3, tx4;
	JButton btn;
	JRadioButton rb1, rb2;
	
	public FormNew()
	{
		frame = new JFrame();
		
		tx1 = new JTextField("fname");
		tx1.setBounds(157, 33, 121, 20);
		
		tx2 = new JTextField("lname ");
		tx2.setBounds(157, 82, 121, 20);
		
		tx3 = new JTextField("e-mail");
		tx3.setBounds(157, 136, 121, 20);
		
//		tx4 = new JTextField();
//		tx4.setBounds(157, 196, 121, 20);
		
		btn = new JButton("Submit");
		btn.setBounds(170, 237, 89, 23);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(155, 177, 55, 23);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(220, 177, 70, 23);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
			
		frame.add(rb1);
		frame.add(rb2);
		frame.add(btn);
		frame.add(tx1);
		frame.add(tx2);
		frame.add(tx3);
		//frame.add(tx4);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
		
	
	public static void main(String[] args) 
	{
		
		new FormNew();
				
	}
	
}

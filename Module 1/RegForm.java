package pr2806RegiForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.module.ModuleDescriptor.Builder;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegForm extends WindowAdapter
{
	JFrame frame;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JTextField tx1, tx2, tx3;
	JRadioButton rb1, rb2;
	JPasswordField pass;
	JPasswordField cpass;
	JComboBox<String> cb, cb2;
	String[] Courses = {"PHP","JAVA",".NET","FLUTTER"};
	String[] Branches = {"RAJKOT","BARODA","AHEMDABAD"};
	JButton btn;
	
	
	public RegForm() 
	{
		frame = new JFrame();
		l1 = new JLabel("Register a new Student");
		l1.setBounds(145, 11, 150, 44);
		l2 = new JLabel("Name");
		l2.setBounds(145, 54, 46, 14);
		l3 = new JLabel("Gender");
		l3.setBounds(145, 94, 46, 14);
		l4 = new JLabel("Mail Id");
		l4.setBounds(145, 144, 46, 14);
		l5 = new JLabel("Mobile No.");
		l5.setBounds(145, 200, 60, 14);
		l6 = new JLabel("Password");
		l6.setBounds(145, 250, 60, 14);
		l7 = new JLabel("Re Password");
		l7.setBounds(145, 305, 80, 14);
		l8 = new JLabel("Courses");
		l8.setBounds(145, 355, 80, 14);
		l9 = new JLabel("Branches");
		l9.setBounds(145, 405, 80, 14);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(230, 93, 65, 23);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(300, 93, 75, 23);
		
		cb = new JComboBox<String>(Courses);
		cb.setBounds(230, 350, 150, 22);
		
		cb2 = new JComboBox<String>(Branches);
		cb2.setBounds(230, 400, 150, 22);
		
		btn = new JButton("Submit");
		btn.setBounds(250, 450, 89, 23);
		
				
		
		//ahi banne button mathi ek button select thay te mate aa object banavo
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		tx1 = new JTextField();
		tx1.setBounds(230, 54, 150, 20);
		
		tx2 = new JTextField();
		tx2.setBounds(230, 144, 150, 20);
		
		tx3 = new JTextField();
		tx3.setBounds(230, 200, 150, 20);
		
		pass = new JPasswordField();
		pass.setBounds(230, 250, 150, 20);
		
		cpass = new JPasswordField();
		cpass.setBounds(230, 300, 150, 20);
		
		frame.addWindowListener(this);
		
		
		frame.add(btn);
		frame.add(cb2);
		frame.add(l9);
		frame.add(l8);
		frame.add(cb);
		frame.add(cpass);
		frame.add(l7);
		frame.add(l6);
		frame.add(pass);
		frame.add(tx3);
		frame.add(l5);
		frame.add(tx2);
		frame.add(l4);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(l3);
		frame.add(l2);
		frame.add(tx1);
		frame.add(l1);
		frame.setSize(500, 550);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		//super.windowClosing(e);
		int a = JOptionPane.showConfirmDialog(frame, "Are You Sure You Want To Exit?");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		if(a==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(a==JOptionPane.NO_OPTION)
		{
			
		}
		if(a==JOptionPane.CANCEL_OPTION)
		{
			
		}
	}
	public static void main(String[] args) 
	{
		new RegForm();
	}

}

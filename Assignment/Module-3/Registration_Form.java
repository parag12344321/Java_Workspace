package Jdbc;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.ResultSet;

public class Registration_Form implements ActionListener
{
	JFrame mainframe;
	JTextField jid, jname, jaddress, jcontact;
	JLabel jlid, jlname, jladdress, jlcontact, register, gender;
	JRadioButton jrmale, jrfemale;
	JButton jbexit, jbregister, jbdelete, jbupdate, jbreset, jbrefresh;
	
	JTable jt;
	JScrollPane jscroll;
	DefaultTableModel model;
	
	
	public Registration_Form() 
	{
		// TODO Auto-generated constructor stub
		// text field 
		mainframe = new JFrame("Registration Form");
		jid = new JTextField(15);
		jid.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jid.setBounds(130, 49, 167, 34);
		jname = new JTextField(15);
		jname.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jname.setBounds(130, 87, 167, 34);
		jaddress = new JTextField(15);
		jaddress.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jaddress.setBounds(130, 175, 167, 34);
		jcontact = new JTextField(15);
		jcontact.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jcontact.setBounds(130, 215, 167, 34);
		
		// label 
		jlid = new JLabel("ID");
		jlid.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jlid.setBounds(35, 58, 60, 16);
		jlname = new JLabel("Name");
		jlname.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jlname.setBounds(35, 96, 60, 16);
		jladdress = new JLabel("Address");
		jladdress.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jladdress.setBounds(35, 184, 60, 16);
		jlcontact = new JLabel("Contact");
		jlcontact.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jlcontact.setBounds(35, 225, 60, 16);
		register = new JLabel("Registration Form");
		register.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		register.setBounds(61, 13, 157, 23);
		gender = new JLabel("Gender");
		gender.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		gender.setBounds(35, 139, 64, 25);
		
		// Radio button
		jrmale = new JRadioButton("Male");
		jrmale.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jrmale.setBounds(125, 139, 70, 25);
		jrfemale = new JRadioButton("Female");
		jrfemale.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jrfemale.setBounds(200, 139, 80, 25);
		
		// All button 
		jbexit = new JButton("Exit");
		jbexit.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jbexit.setBounds(35, 277, 107, 34);
		jbregister = new JButton("Register");
		jbregister.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jbregister.setBounds(150, 277, 120, 34);
		jbdelete =  new JButton("Delete");
		jbdelete.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jbdelete.setBounds(35, 317, 107, 34);
		jbupdate =  new JButton("Update");
		jbupdate.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jbupdate.setBounds(150, 317, 120, 34);
		
		jbreset = new JButton("Reset");
		jbreset.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jbreset.setBounds(87, 356, 120, 34);
		jbrefresh = new JButton("Refresh Table");
		jbrefresh.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jbrefresh.setBounds(550, 403, 300, 34);
		
		//mainframe.getContentPane().add(jscroll);
		
		// jtable and scrollbar setting -- this method is created in viewDataTable 
		String column[] = {"S.No", "ID", "Name", "Gender", "Address", "Contact"};
		model = new DefaultTableModel(column,0);
		jt = new JTable(model);
		//jt.setModel(new DefaultTableModel());
		jt.setBounds(350, 13, 650, 377);	
		jt.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));
		
		jt.repaint();
		jscroll = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jscroll.setBounds(350, 13, 650, 377);
		
		// Frame setting
		mainframe.setSize(1090, 600);
		mainframe.setLayout(null);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Adding detail in frame
		mainframe.add(register);
		mainframe.add(jlid);
		mainframe.add(jlname);
		mainframe.add(jladdress);
		mainframe.add(jcontact);
		mainframe.add(gender);
		mainframe.add(jaddress);
		mainframe.add(jbdelete);
		mainframe.add(jbexit);
		mainframe.add(jbrefresh);
		mainframe.add(jbregister);
		mainframe.add(jbreset);
		mainframe.add(jbupdate);
		mainframe.add(jid);
		mainframe.add(jname);
		mainframe.add(jrmale);
		mainframe.add(jrfemale);
		mainframe.add(jlcontact);
		//mainframe.add(jt);
		mainframe.add(jscroll);
		
	   // radio button group
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrmale);
		bg.add(jrfemale);
		
		jbregister.addActionListener(this);
		jbexit.addActionListener(this);
		jbdelete.addActionListener(this);
		jbreset.addActionListener(this);
		jbupdate.addActionListener(this);
		jbrefresh.addActionListener(this);
	}
	
	    // SQL dabase declaration
		String db ="registration_form";
		String host="jdbc:mysql://localhost:3306/";
		String url = host+db;
	
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			if(e.getSource() == jbregister)
			{
				insertData();
			}
			if(e.getSource() == jbexit)
			{
				mainframe.dispose();
			}
			if(e.getSource() == jbdelete)
			{
				deletData();
			}
			if(e.getSource() == jbreset)
			{
				jid.setText(null);
				jname.setText(null);
				jrfemale.setSelected(false);
				jrmale.setSelected(false);
				jaddress.setText(null);
				jcontact.setText(null);
			}
			if(e.getSource() == jbupdate)
			{
				updateData();
			}
			if(e.getSource() == jbrefresh)
			{
				viewDataTable();
			}
		}	
	
	
		private void updateData()
			{
				// TODO Auto-generated method stub
			try 
			{
				int instno;
				int id = Integer.parseInt(jid.getText());
				String nam = jname.getText();
				
				String gen;
				if(jrmale.isSelected())
				{
					gen = jrmale.getText();
				}
				else
				{
					gen = jrfemale.getText();
				}
				
				String add = jaddress.getText();
				long cont = Long.parseLong(jcontact.getText());
				String sqlupdate = "update registration set ID= "+id+",Name= '"+nam+"',Gender= '"+gen+"',Address='"+add+"',Contact= "+cont+"";
				
				Class.forName("com.mysql.jdbc.Driver");				
				Connection con = DriverManager.getConnection(url,"root","");
				
				Statement stmt = con.createStatement();
				instno = stmt.executeUpdate(sqlupdate);
				
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				//e.printStackTrace()
				System.out.println(e);
			}
			finally
			{
				JOptionPane.showMessageDialog(jbupdate, "Update Successfully");
			}
			
			}
		private void deletData() 
			{
				// TODO Auto-generated method stub
			int instno;
			int id = Integer.parseInt(jid.getText());
			String nam = jname.getText();			
			String sqldelete = "delete from registration where id='"+id+"'";
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, "root","");
				
				Statement stmt = con.createStatement();
				instno = stmt.executeUpdate(sqldelete);
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
			finally
			{
				JOptionPane.showMessageDialog(jbdelete, "Deleted Successfully");
			}
			}
			
			
		private void insertData()
			{
			// TODO Auto-generated method stub
			try 
			{
				int instno;
				int id = Integer.parseInt(jid.getText());
				String nam = jname.getText();
				
				String gen;
				if(jrmale.isSelected())
				{
					gen = jrmale.getText();
				}
				else
				{
					gen = jrfemale.getText();
				}
				
				String add = jaddress.getText();
				long cont = Long.parseLong(jcontact.getText());
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				
				Statement stmt = con.createStatement();
				String sqlinsert = "insert into registration value(null, '" + id + "','" + nam + "', '" + gen + "','" + add + "','" + cont +"')";
				instno = stmt.executeUpdate(sqlinsert);
				
				
			  //Connection con = DriverManager.getConnection(url,"root","");
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
			finally
			{
				JOptionPane.showMessageDialog(jbregister, "Registered Successfully");
			}
			
			
			
		}
	//private JScrollPane JScrollPane(JTable jt2, int verticalScrollbarAsNeeded, int horizontalScrollbarAsNeeded) {
		// TODO Auto-generated method stub
		//return null;
	//}


		public void viewDataTable()
		{
				
			String sqlviewdata = "select * from registration";
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, "root", "");
				Statement stmt = con.createStatement();
				ResultSet rs = (ResultSet) stmt.executeQuery(sqlviewdata);



				model.setRowCount(0);
							
				while(rs.next())
				{
					model.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6)});
								
				}
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}


	public static void main(String[] args)
	{
		
		new Registration_Form();
		
	}


	

}

package BankMangement;
import javax.swing.*;
import java.sql.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener

{
	JButton login,clear,signup;
	JTextField cardtextfield;
	JPasswordField pintextfield;



	Login()
	{
		setTitle("AUTOMATED TELLER MACHINE");
		//ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg"));
		//JLabel label=new JLabel(i1);
		//add(label);
		getContentPane().setBackground(Color.WHITE);
		JLabel text=new JLabel("Welcome To ATM");
		text.setBounds(200,40,400,40);
		text.setFont(new Font("Osward",Font.BOLD,38));
		add(text);
		
		JLabel cardno=new JLabel("Card No");
		cardno.setFont(new Font("Osward",Font.BOLD,20));
		cardno.setBounds(120,150,150,30);
		add(cardno);
		
	     cardtextfield=new JTextField();
		cardtextfield.setBounds(250,150,250,30);
		cardtextfield.setFont(new Font("Arial",Font.BOLD,14));
		add(cardtextfield);
		
		JLabel pin=new JLabel("PIN:");
		pin.setFont(new Font("Osward",Font.BOLD,20));
		pin.setBounds(120,220,400,40);
		add(pin);
	     pintextfield= new JPasswordField();
		pintextfield.setBounds(250,220,250,30);
		pintextfield.setFont(new Font("Arial",Font.BOLD,14));
		add(pintextfield);
		
		 login =new JButton("SIGN IN");
		login.setBounds(250,300,100,30);
		login.setBackground(Color.BLACK);
		 login.setForeground(Color.WHITE);
		 login.addActionListener(this);  
	
		add(login);
		
		 clear =new JButton("CLEAR");
		clear.setBounds(400,300,100,30);
		clear.setBackground(Color.BLACK);
		 clear.setForeground(Color.WHITE);
		 clear.addActionListener(this);  
		add(clear);
		
		 signup=new JButton("SIGNUP");
		signup.setBounds(325,350,100,30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);  
		add(signup);
		
		setSize(800,480);
		setLayout(null);
		setVisible(true);
		setLocation(350,150);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==clear)
		{
			cardtextfield.setText("");
			pintextfield.setText("");
		}
		else if(ae.getSource()==login)
		{
			Conn conn=new Conn();
			String cardnumber=cardtextfield.getText();
			String pinnumber=pintextfield.getText();
			
			String query="select*from login where cardnumber='"+cardnumber+"'  and pin ='"+pinnumber+"'";
			try
			{
				ResultSet rs=conn.s.executeQuery(query);
				if(rs.next())
				{
					setVisible(false);
					new Transactions(query).setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
				}
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
		else if(ae.getSource()==signup)
		{
			setVisible(false);
			new SignupOne().setVisible(true);	
		}
		
		
	}

	public static void main(String[] args)
	{
		new Login();
	

	}

}

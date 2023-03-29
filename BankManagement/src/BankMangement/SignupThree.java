package BankMangement;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public  class SignupThree extends JFrame implements ActionListener
{
	JLabel l1,type,card,number,pin,pinnumber,carddetils,pindetils,servic;
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	ButtonGroup Accounts;
	JTextField cardtext;
	String formno;
	
	JButton submit,cancel;
	SignupThree(String formno)
	{
		this.formno=formno;
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
		setLayout(null);
		 l1=new JLabel("Page 3: Account Details");
		l1.setBounds(280,40,400,40);
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		add(l1);
		
		type=new JLabel("Account Type");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBounds(100,140,200,30);
		add(type);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleways",Font.BOLD,16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100,180,180,20);
		add(r1);
		
		r2=new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBounds(350,180,250,20);
		r2.setBackground(Color.WHITE);
		add(r2);
		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBounds(100,220,180,20);
		r3.setBackground(Color.WHITE);
		add(r3);
		r4=new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBounds(350,220,250,20);
		r4.setBackground(Color.WHITE);
		add(r4);
		
		Accounts=new ButtonGroup();
		Accounts.add(r1);
		Accounts.add(r2);
		Accounts.add(r3);
		Accounts.add(r4);
		
		card=new JLabel("Card Number");
		card.setFont(new Font("Raleway",Font.BOLD,22));
		card.setBounds(100,270,200,22);
		add(card);
		
		carddetils=new JLabel("(Your 16 Digit Card Number)");
		carddetils.setFont(new Font("Raleway",Font.BOLD,12));
		carddetils.setBounds(100,300,200,15);
		add(carddetils);
		
		/*cardtext=new JTextField();
		cardtext.setFont(new Font("Raleway",Font.BOLD,14));
		cardtext.setBounds(300,270,200,30);
		add(cardtext);*/
		
		number=new JLabel("XXXX-XXXX-XXXX-4104");
		number.setFont(new Font("Raleway",Font.BOLD,22));
		number.setBounds(300,270,300,30);
		add(number);
		
		pin=new JLabel("PIN:");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBounds(100,330,200,22);
		add(pin);
		pindetils=new JLabel("(Your 4 digit pin)");
		pindetils.setFont(new Font("Raleway",Font.BOLD,12));
		pindetils.setBounds(100,360,200,15);
		add(pindetils);
		pinnumber=new JLabel("XXXX");
		pinnumber.setFont(new Font("Raleway",Font.BOLD,22));
		pinnumber.setBounds(300,320,200,22);
		add(pinnumber);
		
		servic=new JLabel("Services Required");
		servic.setFont(new Font("Raleway",Font.BOLD,22));
		servic.setBounds(100,400,200,22);
		add(servic);
		
		c1=new JCheckBox("ATM Card");
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBackground(Color.WHITE);
		c1.setBounds(100,450,200,22);
		add(c1);
		
		c2=new JCheckBox("Internet Banking");
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBackground(Color.WHITE);
		c2.setBounds(350,450,200,22);
		add(c2);
		
		c3=new JCheckBox("Mobile Banking");
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100,500,200,22);
		c3.setBackground(Color.WHITE);
		add(c3);
		
		c4=new JCheckBox("Email & SMS Alrets");
		c4.setBackground(Color.WHITE);
		c4.setBounds(350,500,200,20);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		add(c4);
		
		c5=new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setBounds(100,550,200,20);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		add(c5);
		
		c6=new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setBounds(350,550,200,20);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		add(c6);
		
		c7=new JCheckBox("I Here declares that the above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.WHITE);
		c7.setBounds(100,620,600,20);
		c7.setFont(new Font("Raleway",Font.BOLD,12));
		add(c7);
		
		submit=new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway",Font.BOLD,20));
		submit.setBounds(200,650,150,35);
		submit.addActionListener(this);
		add(submit);
		
		cancel=new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway",Font.BOLD,20));
		cancel.setBounds(400,650,150,35);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);	
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== submit)
		{
			String accountType=null;
			
				if(r1.isSelected())
				{
					accountType="Saving Account";
				}
				else if(r2.isSelected())
				{
					accountType="Fixed Deposit Account";
				}
				else if(r3.isSelected())
				{
					accountType="Current Account";
				}
				else if(r4.isSelected())
				{
					accountType="Recurring Deposit Account";
				}
				Random random=new Random();
				String cardnumber=""+Math.abs((random.nextLong() % 9000000L)+504093600000L);
				
				String pinnumber=""+Math.abs((random.nextLong() % 9000L)+100L);
				
				String facility="";
				if(c1.isSelected())
				{
					facility=facility+"ATM card";
				}
				else if(c2.isSelected())
				{
					facility=facility+"Internet Banking";
				}
				else if(c3.isSelected())
				{
					facility=facility+"Moblile Banking";
				}
				else if(c4.isSelected())
				{
					facility=facility+"Email & SMS Alrets";
				}
				else if(c4.isSelected())
				{
					facility=facility+"Cheque Book";
				}
				else if(c4.isSelected())
				{
					facility=facility+"E-Statement";
				}
				try
				{
					if(accountType.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Acccount type is required");
					}
					else
					{
						Conn conn=new Conn();
						
						String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
						String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
						conn.s.executeUpdate(query1);
						conn.s.executeUpdate(query2);
						
						JOptionPane.showMessageDialog(null,"Card Number:" +cardnumber+ "\n pin: " +pinnumber);
					}
					
				}
				catch(Exception e1)
				{
					System.out.print(e1);
				}
				
				
			
		}
		else if(e.getSource()==cancel)
		{
			
		}
		
	}
	public static void main(String args[])
	{
		new SignupThree("");
	}

		
}


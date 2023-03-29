package BankMangement;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Transactions extends JFrame implements ActionListener
{
	JButton deposit, withdraw,pinchange, fastcash ,ministatement, balanceenquiry, exit;
	JLabel text;
	String pinnumber;
	Transactions(String pinnumber)
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		/*ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);*/
		 text=new JLabel("Please select your Transactions");
		text.setBounds(210,300,700,35);
		text.setFont(new Font("System",Font.BOLD,16));
		add(text);
		setSize(900,900);
		setLocation(300,0);
		
		 deposit=new JButton("Deposit");
		deposit.setBounds(170,415,150,30);
		deposit.setBackground(Color.BLACK);
		deposit.setForeground(Color.WHITE);
		deposit.addActionListener(this);
		add(deposit);
		
		 withdraw=new JButton("Cash Withdraw");
		withdraw.setBounds(355,415,150,30);
		withdraw.setBackground(Color.BLACK);
		withdraw.setForeground(Color.WHITE);
		withdraw.addActionListener(this);
		add(withdraw);
		
	    fastcash=new JButton("Fast Cash");
		fastcash.setBounds(170,450,150,30);
		fastcash.setBackground(Color.BLACK);
		fastcash.setForeground(Color.WHITE);
		fastcash.addActionListener(this);
		add(fastcash);
		
		 ministatement=new JButton("Mini Statement");
		ministatement.setBounds(355,450,150,30);
		ministatement.setBackground(Color.BLACK);
		ministatement.setForeground(Color.WHITE);
		ministatement.addActionListener(this);
		add(ministatement);
		
	    pinchange=new JButton("PIN Change");
		pinchange.setBounds(170,485,150,30);
		pinchange.setBackground(Color.BLACK);
		pinchange.setForeground(Color.WHITE);
		pinchange.addActionListener(this);
		add(pinchange);
		
		 balanceenquiry=new JButton("Balance Enquiry");
		balanceenquiry.setBounds(355,485,150,30);
		balanceenquiry.setBackground(Color.BLACK);
		balanceenquiry.setForeground(Color.WHITE);
		balanceenquiry.addActionListener(this);
		add(balanceenquiry);
		
		 exit=new JButton("Exit");
		exit.setBounds(355,520,150,30);
		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.WHITE);
		exit.addActionListener(this);
		add(exit);
		
		
		
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == exit)
		{
			System.exit(0);
		}
		else if(ae.getSource()== deposit)
		{
			setVisible(false);
			new Deposite(pinnumber).setVisible(true);
		}
		else if(ae.getSource()== withdraw)
		{
			setVisible(false);
			new Withdraw(pinnumber).setVisible(true);
		}
		
	}

	public static void main(String[] args) 
	{
		new Transactions("");
		

	}

}

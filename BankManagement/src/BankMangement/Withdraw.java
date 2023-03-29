package BankMangement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Withdraw extends JFrame implements ActionListener 
{
	JButton withdraw,back;
	JLabel text;
	JTextField amount;
	String pinnumber;
	Withdraw(String pinnumber)
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		/*ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);*/
		
		JLabel text =new JLabel("Enter the amount you want Withdraw");
		text.setFont(new Font("System",Font.BOLD,16));
		text.setBounds(170,300,400,20);
		add(text);
		
		 amount=new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(170,350,320,30);
		add(amount);
		
	 withdraw=new JButton("Withdraw");
	 withdraw.setBounds(355,485,150,30);
	 withdraw.setFont(new Font("System",Font.BOLD,16));
	 withdraw.setBackground(Color.BLACK);
	 withdraw.setForeground(Color.WHITE);
	 withdraw.addActionListener(this);
		add(withdraw);
		
	 back=new JButton("Back");
		back.setBounds(355,520,150,30);
		back.setFont(new Font("System",Font.BOLD,16));
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()== withdraw)
		{
			String number=amount.getText();
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter the valid amount");
			}
			else 
			{
				try
				{
					Conn conn=new Conn();
					String query="insert into bank values('"+pinnumber+"','withdraw','"+number+"')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"rs "+number+"Withdraw Successfully");
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
					
				}
				catch(Exception e)
				{
					System.out.print(e);
				}
			
			}
		}
		else if(ae.getSource()== back)
		{
			setVisible(false);
			
			new Transactions(pinnumber).setVisible(true);
			
			
		}
		
	}

	public static void main(String[] args) 
	{
		new Withdraw("");

	}

}

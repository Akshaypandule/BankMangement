package BankMangement;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener
{
	Long random;
	JTextField nametextfield,fathertextField,emailtext,addresstext,citytext,statetext,
	pincodetext,dobtextfield;
	JButton next;
	JRadioButton male,female,other,married,unmarried;
	ButtonGroup gendergroup,marriedstatus;
	
	SignupOne()
	{
		Random run=new Random();
		random=Math.abs((run.nextLong() % 9000L)+1000L);
		getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(350,101);
		setVisible(true);
		setLayout(null);
		
		JLabel formno= new JLabel("Application form No "+random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel personaldetails=new JLabel("Page 1:Personal details");
		personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
		personaldetails.setBounds(290,80,400,30);
		add(personaldetails);
		
		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,40);
		add(name);
		
	    nametextfield=new JTextField();
		nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
		nametextfield.setBounds(300,140,400,30);
		add(nametextfield);
		
	     JLabel Fname=new JLabel("Father name");
		Fname.setFont((new Font("Raleway",Font.BOLD,20)));
		Fname.setBounds(100,190,200,30);
		add(Fname);
		
		 fathertextField=new JTextField();
		fathertextField.setFont(new Font("Raleway",Font.BOLD,14));
		fathertextField.setBounds(300,190,400,30);
		add(fathertextField);
		
		JLabel dob=new JLabel("Date of Birth");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		JLabel gender =new JLabel("Gender");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		 male=new JRadioButton("Male");
		male.setFont(new Font("Raleway",Font.BOLD,14));
		male.setBounds(300,290,75,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		female=new JRadioButton("Female");
		female.setFont(new Font("Raleway",Font.BOLD,14));
		female.setBounds(410,290,100,30);
	    female.setBackground(Color.WHITE);
		add(female);
		
		 other=new JRadioButton("Other");
		other.setFont(new Font("Raleway",Font.BOLD,14));
		other.setBounds(510,290,100,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		 gendergroup=new ButtonGroup();
		gendergroup.add(female);
		gendergroup.add(male);
		gendergroup.add(other);
		
		JLabel email=new JLabel("Email address");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		
		emailtext=new JTextField();
		emailtext.setFont(new Font("Raleway",Font.BOLD,14));
		emailtext.setBounds(300,340,400,30);
		add(emailtext);
		
		JLabel marital=new JLabel("Marital status");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		married=new JRadioButton("Married");
		married.setFont(new Font("Raleway",Font.BOLD,14));
		married.setBounds(300,390,90,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		unmarried=new JRadioButton("Unmarried");
		unmarried.setFont(new Font("Raleway",Font.BOLD,14));
		unmarried.setBounds(410,390,105,30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		 marriedstatus=new ButtonGroup();
		marriedstatus.add(unmarried);
		marriedstatus.add(married);
		
		JLabel address=new JLabel("Address");
		address.setFont(new Font("Raleway",Font.BOLD,20));
		address.setBounds(100,440,200,30);
		add(address);
		
		addresstext=new JTextField();
		addresstext.setFont(new Font("Raleway",Font.BOLD,14));
		addresstext.setBounds(300,440,400,30);
		add(addresstext);

		JLabel city=new JLabel("City");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		 citytext=new JTextField();
		citytext.setFont(new Font("Raleway",Font.BOLD,14));
		citytext.setBounds(300,490,400,30);
		add(citytext);
		
		
		JLabel state=new JLabel("State");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		 statetext=new JTextField();
		statetext.setFont(new Font("Raleway",Font.BOLD,14));
		statetext.setBounds(300,540,400,30);
		add(statetext);
		
		
		JLabel pincode=new JLabel("Pin Code");
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		 pincodetext=new JTextField();
		pincodetext.setFont(new Font("Raleway",Font.BOLD,14));
		pincodetext.setBounds(300,590,400,30);
		add(pincodetext);
		
		 next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,20));
		next.setBounds(620,650,80,30);
		next.addActionListener(this);
		
		add(next);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		String formno=""+ random; //long
		String name=nametextfield.getText();
		String Fname=fathertextField.getText();
		
		String gender=null;
		if(male.isSelected()) 
		{
			gender="Male";
			
		}
		else if(female.isSelected())
		{
		
			gender="Female";
		}
		else if(other.isSelected())
		{
			gender="Other";
		}
		String email=emailtext.getText();
		String marital=null;
		if(married.isSelected())
		{
			marital="Married";
		}
		else if(unmarried.isSelected())
		{
			marital="Unmarried";
		}
		String address=addresstext.getText();
		String city=citytext.getText();
		String state=statetext.getText();
		String pincode=pincodetext.getText();
		
		
		try
		{
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Name is required");
			}
			else {
				Conn c=new Conn();
				String query="insert into signup values('"+formno+"', '"+name+"', '"+Fname+"',"
						+ " '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', "
								+ "'"+state+"', '"+pincode+"')";
				 c.s.executeUpdate(query);
				 
				 setVisible(false);
				 new SignupTwo(formno).setVisible(true);
			}
			
		}
		catch(Exception e)
		{
			System.out.print(e);
		}		
	}
	
	
	public static void main(String args[])
	{
		new SignupOne();
	}

	

}

package BankMangement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SignupTwo extends JFrame implements ActionListener
{
	Long random;
	JLabel religion,category,income,education,occupation,pancard,adharnumber,senior,EAccount;
	JComboBox religions,Comcategory,Comincome,Comeducation,Comoccupation;
	JTextField pantext,adhartext;
	JRadioButton Yes,No,Eyes,Eno;
	ButtonGroup seniorgroup,EAccountgroup;
	String formno;
	JButton next;
	SignupTwo(String formno)
	{
		this.formno=formno;
		
		setLayout(null);
		setVisible(true);
		setSize(800,850);
		setLocation(350,101);
		
		setTitle("NEW APPLICATION FORM PAGE 2");
		
		JLabel additionaldetails=new JLabel("Page 2: Additional Details");
		additionaldetails.setFont(new Font("Raleway",Font.BOLD,38));
		additionaldetails.setBounds(140,20,600,60);
		add(additionaldetails);
		
		religion=new JLabel("Religion");
		religion.setFont(new Font("Raleway",Font.BOLD,20));
		religion.setBounds(100,140,100,40);
		add(religion);
		
		String valreligions[]= {"Hindu","Muslim","Sikh","Christian","Other"};
	
		religions=new JComboBox (valreligions);
		religions.setBounds(300,140,200,30);
		religions.setBackground(Color.WHITE);
		add(religions);
		
		category=new JLabel("Category");
		category.setFont(new Font("Raleway",Font.BOLD,20));
		category.setBounds(100,190,400,40);
		add(category);
		
		String valcategory[]= {"General","OBC","SC","ST"};
		
		Comcategory=new JComboBox(valcategory);
		Comcategory.setBounds(300,190,200,30);
		Comcategory.setBackground(Color.WHITE);
		add(Comcategory);
		
		
		income=new JLabel("Income");
		income.setFont(new Font("Raleway",Font.BOLD,20));
		income.setBounds(100,240,400,40);
		add(income);
		String valuecomincome[]= {"Null","1-100000","100001-250000","250001-Above"};
		Comincome=new JComboBox(valuecomincome);
		Comincome.setBounds(300,240,200,30);
		Comincome.setBackground(Color.WHITE);
		add(Comincome);
		
		education=new JLabel("Education");
		education.setFont(new Font("Raleway",Font.BOLD,20));
		education.setBounds(100,290,400,40);
		add(education);
		
		String valuecomeducation[]= {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
		Comeducation=new JComboBox(valuecomeducation);
		Comeducation.setBounds(300,290,200,30);
		Comeducation.setBackground(Color.WHITE);
		add(Comeducation);
		
		occupation=new JLabel("Occupation");
		occupation.setBounds(100,340,400,40);
		occupation.setFont(new Font("Raleway",Font.BOLD,20));
		add(occupation);
		
		String valuecomoccupations[]= {"Salaried","Self-Employed","Bussiness","Farmer","Students","Un-Employed"};
		Comoccupation=new JComboBox(valuecomoccupations);
		Comoccupation.setBounds(300,340,200,30);
		Comoccupation.setBackground(Color.WHITE);
		add(Comoccupation);
		
		pancard=new JLabel("PanCard-No");
		pancard.setFont(new Font("Raleway",Font.BOLD,20));
		pancard.setBounds(100,390,400,40);
		add(pancard);
		
		pantext=new JTextField();
		pantext.setFont(new Font("Raleway",Font.BOLD,14));
		pantext.setBounds(300,390,200,30);
		add(pantext);
		
		adharnumber=new JLabel("Adhar Number");	
		adharnumber.setFont(new Font("Raleway",Font.BOLD,20));
		adharnumber.setBounds(100,440,400,40);
		add(adharnumber);
		
		adhartext=new JTextField();
		adhartext.setFont(new Font("Raleway",Font.BOLD,14));
		adhartext.setBounds(300,440,200,30);
		add(adhartext);
		
		senior=new JLabel("Senior Citizen");
		senior.setFont(new Font("Raleway",Font.BOLD,20));
		senior.setBounds(100,490,400,40);
		add(senior);
		
		Yes=new JRadioButton("Yes");
		Yes.setBounds(300,490,75,30);
		Yes.setFont(new Font("Raleway",Font.BOLD,14));
		add(Yes);
		
		No=new JRadioButton("No");
		No.setBounds(400,490,100,30);
		No.setFont(new Font("Raleway",Font.BOLD,14));
		add(No);
		
		seniorgroup=new ButtonGroup();
		seniorgroup.add(Yes);
		seniorgroup.add(No);
		
		EAccount=new JLabel("Existing Account");
		EAccount.setFont(new Font("Raleway",Font.BOLD,20));
		EAccount.setBounds(100,540,400,40);
		add(EAccount);
		
		Eyes=new JRadioButton("Yes");
		Eyes.setFont(new Font("Raleway",Font.BOLD,14));
		Eyes.setBounds(300,540,85,30);
		add(Eyes);
		
		Eno=new JRadioButton("No");
		Eno.setBounds(400,540,85,30);
		Eno.setFont(new Font("Raleway",Font.BOLD,14));
		add(Eno);
		
		EAccountgroup=new ButtonGroup();
		EAccountgroup.add(Eyes);
		EAccountgroup.add(Eno);	
		
		next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,20));
		next.setBounds(580,600,80,30);
		next.addActionListener(this);
		add(next);
	
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String formno=""+ random; 
		String sreligion=(String)religions.getSelectedItem();
		String scategory=(String)Comcategory.getSelectedItem();
		String sincome=(String)Comincome.getSelectedItem();
		String seducation=(String)Comeducation.getSelectedItem();
		String soccupation=(String)Comoccupation.getSelectedItem();
		String spancard=pantext.getText();
		String sadhar=adhartext.getText();
		String ssenior=null;
		
		if(Yes.isSelected())
		{
			ssenior="Yes";
			
		}
		else if(No.isSelected())
		{
			ssenior="No";
		}
		String sEAccount=null;
		if(Yes.isSelected())
		{
			sEAccount="Yes";
		}
		else if(No.isSelected())
		{
			sEAccount="No";
		}
		
		try 
		{
			Conn c=new Conn();
			String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"','"+soccupation+"','"+spancard+"','"+sadhar+"','"+ssenior+"','"+sEAccount+"')";
			c.s.executeUpdate(query);
			
			setVisible(false);
			 new SignupThree(formno).setVisible(true);
		
	    }	
		catch(Exception e)
		{
			System.out.print(e);
		}		
	}
	
	public static void main(String args[])
	{
		new SignupTwo("");
	}

	
	}




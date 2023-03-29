package BankMangement;
import java.sql.*;
public class Conn 
{
	// CReate Connection..
	Connection c;
	Statement s;
	public Conn()
	{
		try
		{
			c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","1234");
			s=c.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

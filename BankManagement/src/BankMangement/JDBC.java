package BankMangement;

public class JDBC 
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		
		System.out.println("Driver load sucessfully");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}

}

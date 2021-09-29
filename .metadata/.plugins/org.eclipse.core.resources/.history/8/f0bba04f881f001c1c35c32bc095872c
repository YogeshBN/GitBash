package myproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.lang.Class;

public class Jdbcdemo 
{
	public static void main(String[] args) throws Exception
	{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//DriverManager  is a class
		//Statement,ResultSet,Connection are interfaces
		//1521 is the default port number for ORACLE database

		//XE is the name of the database
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","c##yogi","oracle");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Emp1");//ResultSet means rows and columns
		while(rs.next())//iterate the records one by one!
		{		
			//EITHER COLUMN NAME OR COLUMN POSITION INDEX 1,2,3....
			int a=rs.getInt("Eno");//column name
			String b=rs.getString(2);
			float c=rs.getFloat("salary");
			String d=rs.getString("dept");
			System.out.println(a+ " "+b + " "+c + " "+d );
		}
		rs.close();
		con.close();//release DB connection
	}
}

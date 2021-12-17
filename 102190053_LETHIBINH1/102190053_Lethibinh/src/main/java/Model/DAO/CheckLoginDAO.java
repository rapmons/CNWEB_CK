package Model.DAO;
import java.util.ArrayList;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.ResultSet;

public class CheckLoginDAO {
	public boolean isExistUser (String userName, String password) { 
		 int size =0;
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/Test999";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from account where username='"+userName+"' and password = '"+password+"' ;";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					size++;	
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}	

			if(size > 0){			  
				return true;
			} else {
				return false;
			}
	}

}
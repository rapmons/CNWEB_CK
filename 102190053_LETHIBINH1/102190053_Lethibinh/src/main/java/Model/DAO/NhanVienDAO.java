package Model.DAO;
import java.util.ArrayList;

import javax.xml.crypto.dsig.dom.DOMValidateContext;

import java.sql.DriverManager;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.ResultSet;

import Model.BEAN.VacXin;

public class NhanVienDAO {
	
	
		
	
	public ArrayList<VacXin> getNVList () {
		ArrayList<VacXin> result = new ArrayList<VacXin> (); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/Test999";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from VACXIN;";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					VacXin nv = new VacXin(); 
					String mavc = rs.getString("MaVacXin");
					String tenvc = rs.getString("TenVacXin");
					String somui = rs.getString("SoMui");
					String gia = rs.getString("GiaVacXin");
					String sx = rs.getString("TenHangsx");


					nv.setmvc(mavc);
					nv.setten(tenvc);
					nv.setmui(somui);
					nv.setgia(gia);
					nv.sethag(sx);
					result.add(nv);
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}
		 
		return result;
	}
	public ArrayList<VacXin> getNVPB (String IDPB) {
		ArrayList<VacXin> result = new ArrayList<VacXin> (); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/Test999";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from VACXIN where TenVacXin='"+IDPB+"';";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					VacXin nv = new VacXin (); 
					String tenvc = rs.getString("TenVacXin");
					String somui = rs.getString("SoMui");
					String gia = rs.getString("GiaVacXin");
					String sx = rs.getString("TenHangsx");

					nv.setmvc(IDPB);
					nv.setten(tenvc);
					nv.setmui(somui);
					nv.setgia(gia);
					nv.sethag(sx);
					result.add(nv);
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}
		 
		return result;
	}
	
	public void insertNV(String mavc, String tenvc, String somui, String gia,String sx,String mota)
	{
		
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/Test999";
			Connection con = (Connection)DriverManager.getConnection(url, "root", "");
	        String sql ="insert VACXIN set MaVacXin='"+mavc+"', TenVacxin='"+tenvc+"' , SoMui='"+somui+"', Mota='"+mota+"', GiaVacXin='"+gia+"', TenHangSX='"+sx+"', ;";
	        Statement stmt = (Statement)con.createStatement();
	        stmt.executeUpdate(sql);
	        
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public ArrayList<VacXin> getNVByID (String id) {
		ArrayList<VacXin> result = new ArrayList<VacXin>(); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/Test999";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from VACXIN where MaVacXin='"+id+"';";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					VacXin nv = new VacXin (); 
					String tenvc = rs.getString("TenVacXin");
					String somui = rs.getString("SoMui");
					String gia = rs.getString("GiaVacXin");
					String sx = rs.getString("TenHangsx");

					nv.setmvc(id);
					nv.setten(tenvc);
					nv.setmui(somui);
					nv.setgia(gia);
					nv.sethag(sx);
					result.add(nv);
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}
		 
		return result;
	}
	
	
}
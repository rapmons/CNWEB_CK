package Model.BO;
import java.util.ArrayList;

import Model.BEAN.*;
import Model.DAO.*;
public class NhanVienBO { 
	NhanVienDAO nvDAO = new NhanVienDAO () ; 
	
	
	
	public ArrayList<VacXin> getNVList () {
		return nvDAO.getNVList();
	}
	
	public ArrayList<VacXin> getNVPB (String IDPB) {
		return nvDAO.getNVPB(IDPB);
	}
	public ArrayList<VacXin> getNVByID (String IDPB) {
		return nvDAO.getNVByID(IDPB);
	}
	
	public void insertNV(String mavc, String tenvc, String somui, String gia,String sx,String Mota){
		nvDAO.insertNV(mavc, tenvc, somui, gia,sx,Mota);
	}
	
	
	
	
}
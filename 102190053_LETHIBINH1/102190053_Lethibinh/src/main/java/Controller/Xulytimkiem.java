package Controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BEAN.VacXin;

import Model.BO.CheckLoginBO;
import Model.BO.NhanVienBO; 

@WebServlet ("/Xulytimkiem") 
public class Xulytimkiem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet (HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response); 
	}
	protected void doPost (HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		String destination = "/xemVC.jsp"; 
		String text = request.getParameter("text"); 
		String case1 = request.getParameter("radio_check"); 
		NhanVienBO nvBO = new NhanVienBO(); 
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/xemVC.jsp");
		ArrayList < VacXin > nvArray =null; System.out.println(case1);
		if(case1!=null) {
		 switch (case1) {
	         case "1":
	        	 
	        	 nvArray =nvBO.getNVByID(text);
	 	        request.setAttribute("nvArray", nvArray);
	 	        
	 	        dispatcher.forward(request, response);
	             break;
	         case "2":
	        	 
	        	 nvArray =nvBO.getNVPB(text);
	  	        request.setAttribute("nvArray", nvArray);
	  	      
	  	        dispatcher.forward(request, response);
	             break;
	        
	     }
		
		}
	}
}
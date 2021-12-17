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


import Model.BEAN.*;

import Model.BO.*;

@WebServlet("/")

public class web extends HttpServlet
{
	private static final long serialVersionUID=1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	String action = request.getServletPath();
    		try {
                switch (action) {
                	case "/CheckLoginServlet":
                		checklogin(request, response);
                		break;
                                  
                    case "/insert":
                        insertNV(request, response);
                        break;             
                    case "/listNV":
                    	listNV(request, response);
                    	break;
                    case "/TimNV":
                    	timNV(request, response);
                    	break;
                   
                    case "/listNVPB":
                    	listNVPB(request, response);
                    	break;
                    
                   
                   
                    case "/newVC":
                        VC(request, response);
                        break;
                    

                    default:
                        listNV(request, response);
                        break;
                
                }
    			
            } catch (SQLException ex) {
                throw new ServletException(ex);
            }
    
    }
    
    
    
    private void listNV(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {           NhanVienBO nv=new NhanVienBO(); 
    	        ArrayList < VacXin > nvArray =nv.getNVList();
    	        request.setAttribute("nvArray", nvArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("xemVC.jsp");
    	        dispatcher.forward(request, response);
    	    }  
    private void timNV(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {         
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("TimKiemNV.jsp");
    	        dispatcher.forward(request, response);
    	    } 
    
    
    
    private void VC(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {         
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("themVC.jsp");
    	        dispatcher.forward(request, response);
    	    } 
    
    
    
    private void listNVPB(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {           NhanVienBO nv=new NhanVienBO(); 
    			String id = (String)request.getParameter("id");
    	        ArrayList < VacXin > nvArray =nv.getNVPB(id);
    	        request.setAttribute("nvArray", nvArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("XemNV.jsp");
    	        dispatcher.forward(request, response);
    }
   
  
  

  
   

    private void insertNV(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        String mvc = request.getParameter("1");
        String ten = request.getParameter("2");
        String sm = request.getParameter("3");
        String mota = request.getParameter("4");
        String gia = request.getParameter("5");
        String hang= request.getParameter("6");
        NhanVienBO sv=new NhanVienBO();
        sv.insertNV( mvc,ten,sm,gia,hang,mota);
        response.sendRedirect("listNV");
    }
    

    
    private void checklogin (HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
    		String destination = null; 
    		String userName = request.getParameter("userName"); 
    		String password = request.getParameter ("password"); 
	
    		CheckLoginBO checkLoginBO = new CheckLoginBO(); 

    		if (checkLoginBO.isValidUser (userName, password)) { 

    			request.setAttribute("User", userName);
    			destination = "/index.jsp";				
    			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination); 
    			rd.forward (request, response); 
    		} else {
    			destination = "/login.jsp";
    			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
    			rd.forward (request, response);		
    		}
    	}
}
package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.Dao;
import dto.User;
@WebServlet("/saveuser")
@MultipartConfig(maxFileSize = 10*1024*1024)
public class SaveUser extends HttpServlet {
	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("userid"));
		String name=req.getParameter("username");
		String email=req.getParameter("useremail");
		long contact=Long.parseLong(req.getParameter("usercontact"));
		String password=req.getParameter("userpassword");
		
		Part imagePart=req.getPart("userimage");
	    byte[] imagebyte=imagePart.getInputStream().readAllBytes();
	    
	    User user=new User(id,name,email,contact,password,imagebyte);
	    
	  Dao dao=new Dao();
	  
		try {
			int res=dao.SaveUser(user);
			
			if(res>0) {
				resp.sendRedirect("Login.jsp");
					
			}else {
				resp.sendRedirect("signup.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

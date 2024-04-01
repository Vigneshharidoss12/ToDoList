package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import dto.User;
@WebServlet("/userlogin")

public class Login extends HttpServlet {

	@Override
	protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("useremail");
		String password = req.getParameter("userpassword");
		
		Dao dao = new Dao();
		
		try {User u=dao.findByEmail(email);
		if (u!=null) {
			//verify the password
			if (u.getUserpassword().equals(password)) {
				//login success
				HttpSession session=req.getSession();
				session.setAttribute("user", u);
				req.getRequestDispatcher("Home.jsp").include(req, resp);
			}
			else {
				req.setAttribute("message", "password wrong");
				req.getRequestDispatcher("Login.jsp").include(req, resp);
			}
		}
		else {
			req.setAttribute("message", "wrong email");
			req.getRequestDispatcher("Login.jsp").include(req, resp);
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

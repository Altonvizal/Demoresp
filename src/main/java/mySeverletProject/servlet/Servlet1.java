package mySeverletProject.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/servlet1")
public class Servlet1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		long contact = Long.parseLong(req.getParameter("contact"));
		String email = req.getParameter("email");
		
		req.setAttribute("contact", contact);
		req.setAttribute("email", email);
		
		RequestDispatcher rd=req.getRequestDispatcher("servlet2");
		rd.forward(req, res);
		
		
	}
	

}

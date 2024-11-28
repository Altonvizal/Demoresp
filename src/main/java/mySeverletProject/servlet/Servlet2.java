package mySeverletProject.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet2")
public class Servlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		long contact =(long)req.getAttribute("contact");
		String email= (String)req.getAttribute("email");
		
		res.getWriter().println(contact);
		res.getWriter().println(email);
	}

}

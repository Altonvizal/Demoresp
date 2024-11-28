package mySeverletProject.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HttpOne")
public class HttpOne extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long contact = Long.parseLong(req.getParameter("contact"));
		String email = req.getParameter("email");
		resp.getWriter().print(email+" "+contact+" ");
	}
	
	

}

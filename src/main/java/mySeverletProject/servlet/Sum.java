package mySeverletProject.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class Sum  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a= Integer.parseInt(req.getParameter("a"));
		int b= Integer.parseInt(req.getParameter("b"));
		
		int sum=a+b;
		req.setAttribute("sum",sum );
		req.getRequestDispatcher("sum.jsp").forward(req, resp);
	}
	

}

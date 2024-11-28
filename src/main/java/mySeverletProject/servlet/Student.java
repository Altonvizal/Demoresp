package mySeverletProject.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/student")
public class Student extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String  name= req.getParameter("name");
		String  email= req.getParameter("email");
		long contact=Long.parseLong(req.getParameter("contact"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school?user=root&password=root");
	
			String queryString ="insert into student value(?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(queryString);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setLong(4, contact);
			int a= pst.executeUpdate();
			con.close();
			res.getWriter().print(a+"Row inserted");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}

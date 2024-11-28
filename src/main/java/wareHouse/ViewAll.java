package wareHouse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view")
public class ViewAll extends HttpServlet {
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse?user=root&password=root");
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from product");
			req.setAttribute("product",rs);
			req.getRequestDispatcher("viewAll.jsp").forward(req, resp);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}

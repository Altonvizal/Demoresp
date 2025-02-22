package wareHouse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SaveServlet")
public class SaveServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String brand=req.getParameter("brand");
		double price=Double.parseDouble(req.getParameter("price"));
		double discount=Double.parseDouble(req.getParameter("discount"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse?user=root&password=root");
	
			String queryString ="insert into product value(?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(queryString);
			req.setAttribute("id", id);
			req.setAttribute("brand",  brand);
			req.setAttribute("price",  price);
			req.setAttribute("discount",  discount);
			req.getRequestDispatcher("addproduct.jsp").forward(req, resp);
			pst.setInt(1, id);
			pst.setString(2, brand);
			pst.setDouble(3, price);
			pst.setDouble(4, discount);
			int a= pst.executeUpdate();
			con.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     //                                                                                                                                                                                                                                        vv
			resp.getWriter().print(a+"Row inserted");
			
		}
		catch (Exception e) {
					e.printStackTrace();
				}		
	}
	

}

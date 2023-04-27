package edu.qsp.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.qsp.student.dao.EmployeeDao;
import edu.qsp.student.dto.Employee;

@WebServlet("/loginpage")
public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		EmployeeDao dao=new EmployeeDao();
		Employee e=dao.getEmployeeByEmail(email);
		if(e!=null) {
			if(e.getPassword().equals(pass)) {
//				RequestDispatcher reqdis=req.getRequestDispatcher("LoginPage.html");
//				reqdis.forward(req, resp);
				String name=e.getName();
				String html="<html>\r\n"
						+ "<head>\r\n"
						+ "<meta charset=\"ISO-8859-1\">\r\n"
						+ "<title>Login Page</title>\r\n"
						+"<link rel=\"stylesheet\" href=\"FrontPage.css\">"
						+ "</head>\r\n"
						+ "<body>\r\n"
						+"<h1>Welcome "+name+"!!</h1>"
						+ "<form action=\"FrontPage.html\">\r\n"
						+ "<table>\r\n"
						+ "<thead>"
						+ "	<tr><th>\r\n"
						+ "		<td colspan=\"2\">"+"<h1>Details</h1>"+"<br>"
						+ "		<br></td>"
						+ "		\r\n"
						+ "	</th></tr>\r\n"
						
						+ "	<tr><th>\r\n"
						+ "		<td>name : </td>"
						+ "		<td>"+name+"<br>"
						+ "		<br></td>"
						+ "		\r\n"
						+ "	</th></tr>\r\n"
						+ "	<tr><th>\r\n"
						+ "		<td>Salary : </td>\r\n"
						+ "		<td>"+e.getSalary()+"<br>\r\n"
						+ "		<br></td>\r\n"
						+ "		\r\n"
						+ "	</th></tr>\r\n"
						+ "	<tr><th>\r\n"
						+ "		<td>email : </td>\r\n"
						+ "		<td>"+e.getEmail()+"<br>\r\n"
						+ "		<br></td>\r\n"
						+ "		\r\n"
						+ "	</th></tr>\r\n"
						+ "	<tr><th>\r\n"
						+ "		<td>password : </td>\r\n"
						+ "		<td>"+e.getPassword()+"<br>\r\n"
						+ "		<br></td>\r\n"
						+ "		\r\n"
						+ "	</th></tr>\r\n"
						+ "	<tr><th>\r\n"
						+ "		<td colspan=\"2\"><button>Home</button></td>\r\n"
						+"</th></tr>"
						+"<tr><th>"
						+ "		<td><br>\r\n"
						+ "		<br></td>\r\n"
						+ "		\r\n"
						+ "	</th></tr>\r\n"
						+"</thead>"
						+ "</table>\r\n"
						+"</form>"
						+ "</body>\r\n"
						+ "</html>";
						
				resp.getWriter().print(html);		
						
			}
			else {
				resp.getWriter().print("<h1>Password is Incorrect<hr></h1>");
				RequestDispatcher reqdis=req.getRequestDispatcher("Login.html");
				reqdis.include(req, resp);
			}
		}
		else {
			resp.getWriter().print("<h1>Email is not found<hr></h1>");
			
			RequestDispatcher reqdis=req.getRequestDispatcher("Login.html");
			reqdis.include(req, resp);
		}
	}

}

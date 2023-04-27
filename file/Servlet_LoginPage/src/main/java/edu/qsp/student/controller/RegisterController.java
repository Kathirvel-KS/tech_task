package edu.qsp.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("<html>"
				+ "<head>"
				+"<title>Registration</title>"
				+"<link rel=\"styleSheet\" href=\"FrontPage.css\">"
				+"</head>"
				+"<body><form action=\"registered\" method=\"post\">\r\n"
				+ "		<table>\r\n"
				+ "			<thead>\r\n"
				+ "				<tr>\r\n"
				+ "					<th><br><br>Registration Page<br><br></th>\r\n"
				+ "				</tr>\r\n"
				+ "			</thead>\r\n"
				+ "			<tbody>\r\n"
				+ "				<tr>\r\n"
				+ "					<td>"
				+"<label>Enter the Name :</label><input type=\"text\" name=\"name\">"
				+"<br><br></td>\r\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td><label>Enter the Salary :</label><input type=\"number\" name=\"salary\"><br><br></td>\r\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td><label>Enter the Email :</label><input type=\"email\" name=\"email\"><br><br></td>\r\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td><label>Enter the Password :</label><input type=\"password\" name=\"pass\"><br><br></td>\r\n"
				+ "				</tr>\r\n"
				
				+ "				<tr>\r\n"
				+ "					<td><button type=\"submit\">Submit</button><br><br></td>\r\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "				<td><br><br><br><br></td>\r\n"
				+ "				</tr>\r\n"
				+ "			</tbody>\r\n"
				+ "			\r\n"
				+ "		\r\n"
				+ "		</table>\r\n"
				+ "	</form>"+"</html>");
		
		
		
	}

}

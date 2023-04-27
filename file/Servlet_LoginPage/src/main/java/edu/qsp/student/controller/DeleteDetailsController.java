package edu.qsp.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletedetails")
public class DeleteDetailsController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String html="<html><head><title>Delete</title><link rel=\"stylesheet\" href=\"FrontPage.css\">"
				+"</head><body>"
				+"<form action=\"deleted\" method=\"get\">\r\n"
				+ "		<table>\r\n"
				+ "			<thead>\r\n"
				+ "				<tr>\r\n"
				+ "					<th><br><br>Delete Account<br><br></th>\r\n"
				+ "				</tr>\r\n"
				+ "			</thead>\r\n"
				+ "			<tbody>\r\n"
				+ "				<tr>\r\n"
				+ "					<td>\r\n"
				+ "					<label>Enter the Email :</label><input type=\"email\" name=\"email\">\r\n"
				+ "					<br><br></td>\r\n"
				+ "					\r\n"
				+ "				</tr>"
				+ "				<tr>\r\n"
				+ "					<td>\r\n"
				+ "					<label>Enter the Password :</label><input type=\"password\" name=\"pass\">\r\n"
				+ "					<br><br></td>\r\n"
				+ "					\r\n"
				+ "				</tr>"
				+"				<tr>\r\n"
				+ "					<td>\r\n"
				+ "					<input type=\"submit\">\r\n"
				+ "					<br><br></td>\r\n"
				+ "					\r\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "				<td><br><br><br><br></td>\r\n"
				+ "				</tr>\r\n"
				+ "			</tbody>\r\n"
				+ "		</table>\r\n"
				+ "	</form>"
				+"</body></html>";
		resp.getWriter().print(html);
	}
	
}

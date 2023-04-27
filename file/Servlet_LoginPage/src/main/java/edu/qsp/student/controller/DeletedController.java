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

@WebServlet("/deleted")
public class DeletedController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		EmployeeDao dao=new EmployeeDao();
		Employee emp=dao.getEmployeeByEmail(email);
		
		if(emp!=null) {
			if(emp.getPassword().equals(pass)) {
//				RequestDispatcher reqdis=req.getRequestDispatcher("LoginPage.html");
//				reqdis.forward(req, resp);
				dao.deleteByEmail(emp);
				String html="<html>"
						+ "<head>"
						+"<title>Delete</title>"
						+"<link rel=\"styleSheet\" href=\"FrontPage.css\">"
						+"</head>"
						+"<body><form action=\"LoginPage.html\">"
						+"<table>"
						+"<thead><th><h1>Deleted Successfully!!!<br><br><br><br><br><br><br></h1></th></thead>"
						+"<tbody><tr><td><input type=\"submit\"></td></tr></tbody>"
						+"</table></form>"
						+"</body>"
						+"</html";
				resp.getWriter().print(html);

			}else {
				resp.getWriter().print("<html>"
						+ "<head>"
						+ "<title>Delete</title>"
						+ "<link rel=\"styleSheet\" href=\"FrontPage.css\">"
						+ "</head><body><h1>Password is Incorrect. So Delete operation failed<hr></h1></body>");
//				RequestDispatcher reqdis=req.getRequestDispatcher("/deletedetails");
//				reqdis.include(req, resp);
			}
		}
		else {
			resp.getWriter().print("<html>\"\r\n"
					+ "<head>"
					+ "<title>Delete</title>"
					+ "<link rel=\\\"styleSheet\" href=\"FrontPage.css\">"
					+ "</head><body><h1>Email is not found. So Delete operation failed<hr></h1></body>");

//			RequestDispatcher reqdis=req.getRequestDispatcher("/deletedetails");
//			reqdis.include(req, resp);
		}
	}

	
}

package edu.qsp.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.qsp.student.dao.EmployeeDao;
import edu.qsp.student.dto.Employee;

@WebServlet("/alldetails")
public class AllDetailsController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDao dao=new EmployeeDao();
		List<Employee> list=dao.getAllEmployees();
		
		
		String html="<Html><head>"+"<title>All Details</title>"
				+"<link rel=\"stylesheet\" href=\"FrontPage.css\">"
				+"</head>"
				+ "<body>"
				+ "	<form action=\"#\" method=\"post\">"
				+"<table>"
				+ "			<thead>"
				+ "				<tr>"
				+ "					<th>Name</th>"
				+ "					<th>Salary</th>"
				+ "					<th>Email</th>"
				+ "					<th>Password</th>"
				+ "				</tr>"
				+ "			</thead>"
				+"<tbody>";
		
		for (Employee emp : list) {
			String pass2=dao.encodedPassword(emp.getPassword());
			html+= "<tr>"
				+ "		<td>"+emp.getName()+"</td>"
				+ "		<td>"+emp.getSalary()+"</td>"
				+ "		<td>"+emp.getEmail()+"</td>"
				+ "		<td>"+pass2+"</td>"
				+ "	</tr>";
				
		}
		html+="</tbody></html>";
		resp.getWriter().print(html);
	}
	
}

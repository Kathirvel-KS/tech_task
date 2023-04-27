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

@WebServlet("/registered")
public class RegisteredController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		double sal=Double.parseDouble(req.getParameter("salary"));
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		Employee e=new Employee();
		e.setName(name);
		e.setSalary(sal);
		e.setEmail(email);
		e.setPassword(pass);
		
		EmployeeDao dao=new EmployeeDao();
		dao.registerEmployee(e);
		
		
		RequestDispatcher reqdis=req .getRequestDispatcher("Registered.html");
		reqdis.forward(req, resp);
	}

}

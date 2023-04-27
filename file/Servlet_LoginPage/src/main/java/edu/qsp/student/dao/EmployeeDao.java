package edu.qsp.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.qsp.student.dto.Employee;

public class EmployeeDao {
	public void registerEmployee(Employee e) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(e);
		et.commit();
	}
	public Employee getEmployeeByEmail(String email) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query query =em.createQuery("Select e from Employee e where email=?1");
		query.setParameter(1, email);
		Employee e1;
		try {
		e1= (Employee)query.getSingleResult();
		}catch (Exception e) {
			return null;
		}
		return e1;
	}
	
	public List<Employee> getAllEmployees(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query query =em.createQuery("Select e from Employee e");
		return query.getResultList();
		
	}
	
	public String encodedPassword(String pass) {
		String pass2="";
		for(int i=0;i<pass.length();i++) {
			pass2+="*";
		}
		return pass2;
	}
	
	public void deleteByEmail(Employee emp) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Employee employee = em.merge(emp);
		em.remove(employee);
		et.commit();
	}
}

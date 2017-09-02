package com.cg.rbs.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.cg.rbs.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	
	//private SessionFactory sessionFactory;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public String addEmployee(Employee employee) {
		System.out.println("Before insertion in DB");
		try {
			// sessionFactory.getCurrentSession().saveOrUpdate(employee);
			entityManager.persist(employee);
			return "Employee added succesfully";
		} catch (Exception e) {
			System.out.println(e.toString());
			return "Exception occured";
		}
	}

	@SuppressWarnings("unchecked")

	public List<Employee> listEmployee() {
		//return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
		return null;
	}

	@Override
	public void deleteEmployee(Employee employee, int id) {
		try {
//			Session session = sessionFactory.getCurrentSession();
//			Transaction tr = session.beginTransaction();
//			Employee newEmployee = (Employee) session.load(Employee.class, id);
//			session.delete(newEmployee);
//			tr.commit();
//			session.flush();
		} catch (Exception e) {
			System.out.println("exception in delete Employee" + e.toString());
		}
	}

	@Override
	public List<Employee> getEmployee(int id) {
//		List<Employee> employeeList = new ArrayList<Employee>();
//		employeeList.add((Employee) sessionFactory.getCurrentSession().get(Employee.class, id));
//		return employeeList;
		return null;
	}

}
package com.cg.rbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.rbs.dao.EmployeeDao;
import com.cg.rbs.model.Employee;

@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDaoObj;

	@Override
	public String addEmployee(Employee employee) {
		System.out.println("In Servce, calling DAO");
		return employeeDaoObj.addEmployee(employee);
	}

	@Override
	public List<Employee> listEmployee() {
		return employeeDaoObj.listEmployee();
	}

	@Override
	public void deleteEmployee(Employee employee, int id) {
		employeeDaoObj.deleteEmployee(employee, id);
	}

	@Override
	public List<Employee> getEmployee(int id) {
		System.out.println(employeeDaoObj.getEmployee(id).toString());
		return employeeDaoObj.getEmployee(id);
	}

}

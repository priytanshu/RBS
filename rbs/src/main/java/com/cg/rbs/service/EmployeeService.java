package com.cg.rbs.service;

import java.util.List;

import com.cg.rbs.model.Employee;



public interface EmployeeService {

	public String addEmployee(Employee e);

	public List<Employee> listEmployee();

	public void deleteEmployee(Employee employee, int id);

	public List<Employee> getEmployee(int id);

}

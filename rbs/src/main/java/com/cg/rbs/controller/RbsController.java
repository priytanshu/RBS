package com.cg.rbs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.rbs.model.Employee;
import com.cg.rbs.service.EmployeeService;

@Controller
public class RbsController {

	@Autowired
	private EmployeeService employeeServiceObj;

	@RequestMapping(value = "/")
	public ModelAndView hello() {
		return new ModelAndView("hello").addObject("name", "Priytanshu");
	}

	@RequestMapping(value = "/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee employee) {
		return new ModelAndView("addEmployee");
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@Valid @ModelAttribute("command") Employee employee, BindingResult result) {
		System.out.println("Employee name is :" + employee.getName());
		String message = employeeServiceObj.addEmployee(employee);
		return new ModelAndView("hello").addObject("message", message);
	}
}

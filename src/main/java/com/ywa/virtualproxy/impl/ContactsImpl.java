package com.ywa.virtualproxy.impl;

import java.util.ArrayList;
import java.util.List;

import com.ywa.Employee;
import com.ywa.virtualproxy.interfaces.Contacts;

public class ContactsImpl implements Contacts {

	@Override
	public List<Employee> getEmployeeList() {
		
		System.out.println("Start retrieving employee list.....");
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Henery"));
		employeeList.add(new Employee("Josh"));
		employeeList.add(new Employee("Kim"));
		employeeList.add(new Employee("Alan"));
		employeeList.add(new Employee("Bradford"));
		
		return employeeList;
	}

}

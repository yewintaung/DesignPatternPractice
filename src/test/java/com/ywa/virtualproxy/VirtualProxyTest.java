package com.ywa.virtualproxy;

import java.util.List;

import com.ywa.virtualproxy.entity.Company;
import com.ywa.virtualproxy.entity.Employee;
import com.ywa.virtualproxy.interfaces.Contacts;
import com.ywa.virtualproxy.proxy.ContactProxy;

public class VirtualProxyTest {

	public static void main(String[] args) {
		// use proxy
		Contacts contactProxy = new ContactProxy();
		// when creating company instance, we put proxy
		Company company = new Company("My Company.Ltd", contactProxy);
		
		System.out.println(company.getCompanyName());
		
		// when calling heavy method proxy call real implementation
		String employeeListString = getEmployeeListString(company.getContacts().getEmployeeList());
		System.out.println(employeeListString);
	}
	
	
	public static String getEmployeeListString(List<Employee> employeeList) {
		StringBuilder builder = new StringBuilder();
		if (employeeList != null) {
			int i = 0;
			for (Employee employee : employeeList) {
				builder.append(String.format("\t %d - %s \n", i++, employee.getEmployeeName()));
			}
		}
		return builder.toString();
	}

}

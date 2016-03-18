package com.ywa.virtualproxy.proxy;

import java.util.List;

import com.ywa.virtualproxy.entity.Employee;
import com.ywa.virtualproxy.impl.ContactsImpl;
import com.ywa.virtualproxy.interfaces.Contacts;

public class ContactProxy implements Contacts {

	private Contacts contacts;
	@Override
	public List<Employee> getEmployeeList() {
		// proxy call real implementation
		if (contacts == null) {
			contacts = new ContactsImpl();
		}
		return contacts.getEmployeeList();
	}

}

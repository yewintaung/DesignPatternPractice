package com.ywa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.ywa.virtualproxy.interfaces.Contacts;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

	private String companyName;
	private Contacts contacts;
	
}
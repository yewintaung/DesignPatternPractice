package com.ywa.abstractfactory.report;

/**
 * 
 * Abstract Reprot class for various report type
 *
 */
public abstract class AReport {

	protected String name;
	
	protected AReport(String name) {
		this.name = name;
	}
	
	public void processReport() {
		System.out.println("Processing report : " + this.name);
	}
}

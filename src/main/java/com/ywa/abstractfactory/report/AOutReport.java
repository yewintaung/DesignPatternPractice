package com.ywa.abstractfactory.report;

public abstract class AOutReport extends AReport {

	protected AOutReport(String name) {
		super(name);
	}
	
	@Override
	public void processReport() {
		super.processReport();
		System.out.println("Processing OUT Report common stuff: " + this.name);
	}

}

package com.ywa.abstractfactory.report;

public abstract class AInReport extends AReport {

	protected AInReport(String name) {
		super(name);
	}
	
	@Override
	public void processReport() {
		super.processReport();
		System.out.println("Processing IN Report common stuff: " + this.name);
	}

}

package com.ywa.abstractfactory.report.concrete;

import com.ywa.abstractfactory.report.AInReport;

public class InPurchaseReport extends AInReport {

	public InPurchaseReport(String name) {
		super(name);
	}
	
	@Override
	public void processReport() {
		super.processReport();
		System.out.println("Processing IN Purchase specific stuff: " + this.name);
	}

}

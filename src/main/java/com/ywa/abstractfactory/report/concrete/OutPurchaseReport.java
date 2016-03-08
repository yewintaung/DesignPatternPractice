package com.ywa.abstractfactory.report.concrete;

import com.ywa.abstractfactory.report.AOutReport;

public class OutPurchaseReport extends AOutReport {

	public OutPurchaseReport(String name) {
		super(name);
	}

	@Override
	public void processReport() {
		super.processReport();
		System.out.println("Processing OUT purchase specific stuff: " + this.name);
	}
}

package com.ywa.abstractfactory.report.concrete;

import com.ywa.abstractfactory.report.AInReport;

public class InInvoiceReport extends AInReport {

	public InInvoiceReport(String name) {
		super(name);
	}
	
	@Override
	public void processReport() {
		super.processReport();
		System.out.println("Processing IN Invoice specific staff: " + this.name);
	}

}

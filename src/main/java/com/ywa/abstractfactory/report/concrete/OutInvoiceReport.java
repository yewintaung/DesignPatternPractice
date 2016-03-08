package com.ywa.abstractfactory.report.concrete;

import com.ywa.abstractfactory.report.AOutReport;

public class OutInvoiceReport extends AOutReport {

	public OutInvoiceReport(String name) {
		super(name);
	}
	
	@Override
	public void processReport() {
		super.processReport();
		System.out.println("Processing OUT Invoice specific stuff: " + this.name);
	}

}

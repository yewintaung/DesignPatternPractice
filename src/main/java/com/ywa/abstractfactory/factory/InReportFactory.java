package com.ywa.abstractfactory.factory;

import com.ywa.abstractfactory.report.AReport;
import com.ywa.abstractfactory.report.concrete.InInvoiceReport;
import com.ywa.abstractfactory.report.concrete.InPurchaseReport;

public class InReportFactory implements IReportFactory {

	@Override
	public AReport createReport(String type, String name) {
		AReport report = null;
		switch (type) {
		case "INV":
			report = new InInvoiceReport(name);
			break;
		case "PUR":
			report = new InPurchaseReport(name);
			break;
		default:
			break;
		}
		return report;
	}

}

package com.ywa.abstractfactory.factory;

import com.ywa.abstractfactory.report.AReport;
import com.ywa.abstractfactory.report.concrete.OutInvoiceReport;
import com.ywa.abstractfactory.report.concrete.OutPurchaseReport;

public class OutReportFactory implements IReportFactory {

	@Override
	public AReport createReport(String type, String name) {
		AReport report = null;
		switch (type) {
		case "INV":
			report = new OutInvoiceReport(name);
			break;
		case "PUR":
			report = new OutPurchaseReport(name);
			break;
		default:
			break;
		}
		return report;
	}

}

package com.ywa.abstractfactory.client;

import java.util.ArrayList;
import java.util.List;

import com.ywa.abstractfactory.factory.FactoryProvider;
import com.ywa.abstractfactory.factory.IReportFactory;
import com.ywa.abstractfactory.report.AReport;

public class Archive {

	private List<AReport> reportList;
	
	public void addReport(String category, String type, String name) {
		IReportFactory factory = FactoryProvider.getFactory(category);
		if (reportList == null) {
			reportList = new ArrayList<AReport>();
		}
		reportList.add(factory.createReport(type, name));
	}
	
	public void procesAllReport() {
		if (reportList != null) {
			for (AReport report : reportList) {
				report.processReport();
				System.out.println("-----");
			}
		}
	}
}

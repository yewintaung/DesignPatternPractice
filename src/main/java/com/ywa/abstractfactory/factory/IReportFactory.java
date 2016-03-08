package com.ywa.abstractfactory.factory;

import com.ywa.abstractfactory.report.AReport;

public interface IReportFactory {

	public AReport createReport(String type, String name);
}

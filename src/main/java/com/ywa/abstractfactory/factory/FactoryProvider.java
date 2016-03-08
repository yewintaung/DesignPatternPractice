package com.ywa.abstractfactory.factory;

public abstract class FactoryProvider {

	public static IReportFactory getFactory(String factoryType) {
		IReportFactory factory = null;
		switch (factoryType) {
		case "IN":
			factory = new InReportFactory();
			break;
		case "OUT":
			factory = new OutReportFactory();
			break;
		default:
			break;
		}
		return factory;
	}
}

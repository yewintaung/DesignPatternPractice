package com.ywa.decorator.decorate;

import com.ywa.decorator.component.Car;

public class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
	}
	
}

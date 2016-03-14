package com.ywa.decorator.decorate;

import com.ywa.decorator.component.Car;

public class SportCarDecorator extends CarDecorator {

	public SportCarDecorator(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Adding feature of Sport car.");
	}

}

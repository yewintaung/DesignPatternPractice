package com.ywa.decorator.decorate;

import com.ywa.decorator.component.Car;

public class LuxuryCarDecorator extends CarDecorator {

	public LuxuryCarDecorator(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Adding feature of Luxury car.");
	}

}

package com.ywa.decorator;

import com.ywa.decorator.component.BasicCar;
import com.ywa.decorator.decorate.LuxuryCarDecorator;
import com.ywa.decorator.decorate.SportCarDecorator;

public class DecoratorTest {

	public static void main(String[] args) {
		/*
		 * Assume that our car assembly line have to produce SportCar
		 * 
		 */
		
		// basic car assembly
		BasicCar basicCar = new BasicCar();
		
		// now our car is assembled as sport car
		SportCarDecorator sportCar = new SportCarDecorator(basicCar);
		sportCar.assemble();
		
		System.out.println("...............................................");
		
		/*
		 * What if we want to add sport feature and luxury feature
		 * with the ease of without modification of each class.
		 * Just create decorator class of your own.
		 * To create docorator, just create class and extend base decorator.
		 * And override base method and implement of your own.
		 * Very simple, right!
		 * 
		 */
		LuxuryCarDecorator luxuryCar = new LuxuryCarDecorator(new SportCarDecorator(new BasicCar()));
		luxuryCar.assemble();
		
	}
}

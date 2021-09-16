package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	@Autowired
	Car car;
	// Car car = new Car();
	
	public void getCarInfo() {
		car.getInfo();
	}
}

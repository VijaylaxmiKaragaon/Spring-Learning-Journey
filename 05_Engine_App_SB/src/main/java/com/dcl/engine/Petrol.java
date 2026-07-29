package com.dcl.engine;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Engine {

	
	public Petrol() {
		System.out.println("petrol con");
	}
	@Override
	public void start() {
		System.out.println("petrol engine started");
	}

}

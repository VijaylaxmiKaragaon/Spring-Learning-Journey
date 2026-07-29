package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("debitcard")
public class DebitCard implements Payment {

	
	public DebitCard() {
		System.out.println("DC con");
	}
	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
    System.out.println("payment has done by DC");
	}

}

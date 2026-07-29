package com.dcl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("creditcard")
public class CreditCard implements Payment {

	public CreditCard() {
		System.out.println("CreditCard con");
	}
	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
     System.out.println("payment has done by credit card");
	}

}

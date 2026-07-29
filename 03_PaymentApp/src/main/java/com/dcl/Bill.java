package com.dcl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Bill {
	
//	@Autowired
//	@Qualifier("creditcard")
    private Payment payment;
    
    public Bill() {
    	System.out.println("0-param");
    }
    
    public Bill(Payment payment) {
    	this.payment=payment;
    	System.out.println("param con");
    }
    
    @Autowired
    @Qualifier("debitcard")
    public void setPayment(Payment payment) {
    	this.payment=payment;
    	System.out.println("setter method");
    }
    
    public void genarateBill() {
    	payment.doPayment();
    	System.out.println("Bill is genarated");
    }
}

package com.dcl;

public class Student {
    private College clg;
    
    public Student() {
    	System.out.println("0-param con");
    }
    
    public Student(College clg) {
    	this.clg=clg;
    	System.out.println("param con");
    }
    
    public void setClg(College clg) {
    	this.clg=clg;
    	System.out.println("setter injection");
    }
    
    void Study() {
    	System.out.println("student start studying");
    }
}

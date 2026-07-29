package com.dcl.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dcl.entity.Product;
import com.dcl.service.ProductService;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private ProductService pservice;

	@Override
	public void run(String... args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		Product p1 = new Product(1, "Shoes", 1000.0, "Puma");
//		p1=pservice.addProduct(p1);
//		
//		Product p2 = new Product(2, "Shoes", 2000.0, "Nike");
//		Product p3 = new Product(3, "Sandel", 3000.0, "Hills");
//		Product p4 = new Product(4, "Shoes", 4000.0, "Flat");
//		Product p5 = new Product(5, "Shoes", 5000.0, "Nike");
//		Product p6 = new Product(6, "Sandel", 6000.0, "Hills");
//		Product p7 = new Product(7, "Shoes", 8000.0, "Flat");
//		Product p8 = new Product(8, "Shoes", 7000.0, "Nike");
//		Product p9 = new Product(9, "Sandel", 9000.0, "Hills");
//		Product p10 = new Product(10, "Shoes", 10000.0, "Flat");
//		pservice.addProduct(p4);
//		pservice.addProduct(p5);
//		pservice.addProduct(p6);
//		pservice.addProduct(p7);
//		pservice.addProduct(p8);
//		pservice.addProduct(p9);
//		pservice.addProduct(p10);
		
//		pservice.addProduct(p2);
//		pservice.addProduct(p3);
//		pservice.addProduct(p4);
//		System.out.println("Enter the page number");
//		Integer pageNum=sc.nextInt();
//		pservice.getAllProduct(pageNum).forEach(System.out::println);
		
		Product p1 = new Product(1, "Shoes", 1000.0, "Puma");
		p1=pservice.addProduct(p1);
		System.out.println(p1);
	}
}

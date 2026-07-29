package com.dcl.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dcl.entity.Product;
import com.dcl.repo.ProductRepository;

@Service
public class ProductService {
    
	@Autowired
	private ProductRepository prepo;
	
	
	public Product addProduct(Product p) {
		return prepo.save(p);
	}
	
	public Product getProductById(Integer productId) {
		return prepo.findById(productId).orElse(null);
	}
	
	public List<Product> getAllProduct(Integer pageNum){
		//Sort s1 = Sort.by("brand").ascending();
		//return prepo.findAll(s1);
//		Pageable pages=PageRequest.of(pageNum-1, 3);
//	    return prepo.findAll(pages).stream().collect(Collectors.toList());
		
		Product p = new Product();
		p.setBrand("Nike");
		Example<Product> qbe = Example.of(p);
		return prepo.findAll(qbe);
	}
	
	
	
//	public List<Product> find()
}

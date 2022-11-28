package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRepository;
import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@RestController
public class UsersController {
	@Autowired
	UserRepository userrep;
	@Autowired
	ProductRepository productrep;
	
	//user should be able to see the products in different categories.
	
	@GetMapping("/product/{categories}")
	public List<Product> getCate(@PathVariable String categories)
	{
		List<Product> pro = productrep.findByCategories(categories);
		return pro;
	}
	
	//user I should be able to sort the products.//desc
	@GetMapping("/product")
	public List<Product> getProduct()
	{
		return productrep.findByOrderByProductnameDesc();
	}
	
	//--------------------------------------------------------------------------------------------------
	
	

}

package com.example.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product,String> { 
	public  List<Product> findByCategories(String categories);


	public List<Product> findByOrderByProductnameDesc();




 

}

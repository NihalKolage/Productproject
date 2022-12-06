package com.jsp.productController;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.productService.ProductService;
import com.jsp.productdto.Product;

public class GetAllProduct {
public static void main(String[] args) {
	
	
	
	

	
	ProductService productService=new ProductService();
	productService.getAllProduct();
}
}

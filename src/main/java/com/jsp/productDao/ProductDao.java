package com.jsp.productDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.productdto.Product;

public class ProductDao { 
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nihal");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public Product saveProduct(Product product) {
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;
	}
	public Product updateProduct(Product product) {
	
		
		Product pr=entityManager.find(Product.class,product.getId());
		pr.setName(product.getName());
			entityTransaction.begin();
			
		
			entityManager.merge(pr);
			entityTransaction.commit();
			
		  return pr;
			
	
	}
	public Product getProductById( int id) {
		Product product=entityManager.find(Product.class, id);
	   if(product!=null) {
		   System.out.println(product.getBrand());
		   System.out.println(product.getName());
		   System.out.println(product.getPrice());
		   System.out.println(product.getId());
	   }else {
		   System.out.println("not found");
	   }
	   return product;
	}
	
	public List<Product> getAllProduct() {
		
	   String sql="select c from Product c";
	   Query query=entityManager.createQuery(sql);
		
		List<Product >pr=query.getResultList();
		for(Product product:pr) {
			System.out.println("=================");
			System.out.println(product.getId());
			System.out.println(product.getBrand());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
		}
		return pr;
	}
	
	public  void deleteProductById(int id) {
		Product product=entityManager.find(Product.class, id);
		if(product!=null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			
		
	}
	
	}
	
}

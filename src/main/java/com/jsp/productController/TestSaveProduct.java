package com.jsp.productController;

import com.jsp.productService.ProductService;
import com.jsp.productdto.Product;

public class TestSaveProduct {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
	    Product product=new Product();
	    product.setName("Tv");
	    product.setBrand("Samsung");
	    product.setPrice(35000);
	    
	    Product product2=productService.saveProduct(product);
	    if(product2!=null) {
	    	System.out.println("Inserted");
	    }else {
	    	System.out.println("Not Inserted");
	    }
	}
}

package com.jsp.productController;

import com.jsp.productService.ProductService;
import com.jsp.productdto.Product;

public class getProductById {
	public static void main(String[] args) {
		ProductService productService=new ProductService(); 
		int id=5;
		productService.getProductById(id);
	}

}

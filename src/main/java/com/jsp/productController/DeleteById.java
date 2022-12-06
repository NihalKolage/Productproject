package com.jsp.productController;

import com.jsp.productDao.ProductDao;
import com.jsp.productService.ProductService;
import com.jsp.productdto.Product;

public class DeleteById {
 
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		int id=2;
	productService.deleteProductById(id);
		
	}
}

package com.jsp.productService;

import java.util.List;

import com.jsp.productDao.ProductDao;
import com.jsp.productdto.Product;

public class ProductService {
	ProductDao productDao=new ProductDao();
	
	public Product saveProduct(Product product) {
		
		return productDao.saveProduct(product);
		

	}
	public Product updateProduct(Product product) {
	   return productDao.updateProduct(product);
		 
	}
	
	public Product getProductById(int id) {
		
		return productDao.getProductById(id);
	}
	public void getAllProduct() {
		
		
		 productDao.getAllProduct();
		
	}
	
	public  void deleteProductById(int id) {
		productDao.deleteProductById(id);
		
	}

}

package com.jsp.productController;



import com.jsp.productService.ProductService;
import com.jsp.productdto.Product;


public class UpdateProduct {

	public static void main(String[] args) {
		
	
	
		ProductService productService=new ProductService();
		Product product=new Product();
	if(product!=null) {
		product.setName("caps");
        product.setId(2);
        System.out.println("updated");
		
	}else {
		System.out.println(" not found such record to update");
	}
		productService.updateProduct(product);
		  
		
	}
}

package com.training.cakeapp;

import com.training.cakeapp.modal.ProductData;
import com.training.cakeapp.modal.ProductList;

public class CakeApp {
	//Custom Exception if product is not found

	public static void main(String[] args) {
		
		ProductData product=new ProductList("ChocoLava",490,"img.png");
			
		try {
			final String msg1=product.showProduct(10);		
			System.out.println(msg1);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());				
		}
		
	}
	
	
}

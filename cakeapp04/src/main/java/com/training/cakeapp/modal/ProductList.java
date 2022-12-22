package com.training.cakeapp.modal;

import com.training.cakeapp.util.*;

public class ProductList extends ProductData {

		
	public ProductList() {
		super();		
	}

	public ProductList(int prodId, String prodName, double prodPrice, String prodImage) {
		super(prodId, prodName, prodPrice, prodImage);	
	}

	public ProductList(String prodName, double prodPrice, String prodImage) {
		super(prodName, prodPrice, prodImage);	
	}

	@Override
	public String showProduct(int prodId) throws Exception {
		if(prodId>=100) {
			System.out.println(prodId);			
		}
		else {
			
			throw new ProductNotFoundException("Product ID "+prodId+ " Not Found");
		}
			
		return this.getProdName();
	}

}

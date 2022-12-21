package com.training.cakeapp.modal;

public class ProductList {
	
	private static final ProductData [] PRODUCTS = new ProductData[3];

	static {
		PRODUCTS[0]=new ProductData("Black Forest",400,"BlackForest.png");
		PRODUCTS[1]=new ProductData("Choco Lava",450,"ChocoLava.png");
		PRODUCTS[2]=new ProductData("Red Velvet",450,"RedVelvet.png");
	}
	
	public ProductList() {
		super();
	}

	public static ProductData[] getProducts() {
		return PRODUCTS;
	}
	
	
}

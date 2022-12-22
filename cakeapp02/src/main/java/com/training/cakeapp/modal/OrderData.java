package com.training.cakeapp.modal;

public class OrderData extends ProductData {
	
	public int counter=100;

	public OrderData() {
		super();	
	}

	public OrderData(int prodId, String prodName, double prodPrice, String prodImage) {
		super(prodId, prodName, prodPrice, prodImage);
	}

	public OrderData(String prodName, double prodPrice, String prodImage) {
		super(prodName, prodPrice, prodImage);
	}
	
	//@Override
	public String addProduct(String prodName,double prodPrice,String prodImage) {
		
		return this.getProdName()+ "" +this.getProdPrice() ;
	}
	

}

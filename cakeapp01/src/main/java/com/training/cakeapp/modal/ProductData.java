package com.training.cakeapp.modal;

public class ProductData {
	
	public static int counter=100;
	private int prodId;	
	private String prodName;
	private double prodPrice;
	private String prodImage;
	
	public ProductData() {
		super();		
	}

	public ProductData(int prodId, String prodName, double prodPrice, String prodImage) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodImage = prodImage;
	}

	public ProductData(String prodName, double prodPrice, String prodImage) {
		super();
		this.prodId = counter++;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodImage = prodImage;
	}
	
	

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdImage() {
		return prodImage;
	}

	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}

	@Override
	public String toString() {
		return "ProductData [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodImage="
				+ prodImage + "]";
	}
	
	




	

}

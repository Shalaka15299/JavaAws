package com.training.cakeapp.modal;

public class OrderData {
	
	public static int counter=100;
	private int orderId;
	private String prodName;
	private int totalPrice;
	public OrderData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderData(int orderId, String prodName, int totalPrice) {
		super();
		this.orderId = orderId;
		this.prodName = prodName;
		this.totalPrice = totalPrice;
	}
	public OrderData(String prodName, int totalPrice) {
		super();
		this.prodName = prodName;
		this.totalPrice = totalPrice;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "OrderData [orderId=" + orderId + ", prodName=" + prodName + ", totalPrice=" + totalPrice + "]";
	}
	
	public String Addproduct(String prodName,int totalPrice) {
		this.orderId=counter++;
		return this.orderId+ "has product "+this.prodName+ "Of total price"+this.totalPrice;
	}
	
	

}

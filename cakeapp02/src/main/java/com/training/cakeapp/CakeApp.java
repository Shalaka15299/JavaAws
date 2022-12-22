package com.training.cakeapp;

import com.training.cakeapp.modal.OrderData;
import com.training.cakeapp.modal.ProductData;

public class CakeApp {

	public static void main(String[] args) {
		ProductData product1=new OrderData("Choco Lava",450,"lava.png");
		ProductData product2=new OrderData("Red Velvet",450,"red.png");
		System.out.println("Ordered Data :");
		System.out.println(product1);
		System.out.println(product2);
	}

}

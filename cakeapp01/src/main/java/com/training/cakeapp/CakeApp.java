package com.training.cakeapp;

import com.training.cakeapp.modal.ProductData;
import com.training.cakeapp.modal.OrderData;;

public class CakeApp {

	public static void main(String[] args) {
		ProductData product1=new ProductData("Black Forest",400,"BlackForest.png");
		ProductData product2=new ProductData("Choco Lava",450,"ChocoLava.png");
		
		OrderData order1=new OrderData("Black Forest",400);
		final String msg1=order1.Addproduct("Black Forest",400);
		
		System.out.println(product1);		
		System.out.println(product2);
		
	}
	
}

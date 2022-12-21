package com.training.cakeapp;



import com.training.cakeapp.modal.ProductData;
import com.training.cakeapp.modal.ProductList;

public class CakeApp {
	//Find the product By name and also read and update the array data

	public static void main(String[] args) {
		
		try {
			System.out.println("Display All Products");
			ProductData [] products=ProductList.getProducts();
			printData(products);
			final int prodId=100;
			final String prodName="Red Velvet";
			ProductData product=findById(products, prodId);
			
//			if(product!=null) {
//				System.out.println("Product Data of :"+prodId+ " "+product);				
//			}
			
			ProductData product1=findByName(products, prodName);
			
			if(product1!=null) {
				System.out.println("Product Data of :"+prodName+ " "+product1);				
			}
			final String msg=findByProdIdAndDelete(products,prodId);
			System.out.println(msg);
			
			printData(products);
			
		}catch(Exception e) {
			
		}
		
	}
	
	private static ProductData findById(ProductData[] products, final int prodId) {
		for(ProductData product : products) {
			if(product.getProdId()==prodId) {
				return product;				
			}
		}
		return null;
	}

	private static ProductData findByName(ProductData[] products, final String prodName) {
		for(ProductData product : products) {
			if(product.getProdName()==prodName) {
				return product;				
			}
		}
		return null;
	}

	
	private static String findByProdIdAndDelete(ProductData[] products, int prodId) {
		for(int i=0;i<products.length;i++) {
			if(products[i].getProdId()==prodId) {
				products[i]=null;
				return prodId+" record Deleted ";				
			}
		}
		return "Account not available";
	}
	
	private static void printData(ProductData[] products) {
		for(ProductData product : products) {
			System.out.println(product);
		}
	}

}

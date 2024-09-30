package main;

import entity.Product;
import productDao.productDAO;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Product p = new Product();
		p.setSku("Sku");
		p.setDescription("Description");
		p.setPrice("Price");
		p.setMaxDiscount(1);
		p.setStock(123);


		new productDAO().registrationUser(p);


				
		p.setSku("a");
		p.setDescription("b");
		p.setPrice("Pc");
		p.setMaxDiscount(1);
		p.setStock(123);
		
		new productDAO().registrationUser(p);
	}
}

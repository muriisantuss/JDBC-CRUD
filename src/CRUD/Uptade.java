package CRUD;

import java.util.Scanner;

import entity.Product;
import productDao.ProductDAO;

public class Uptade {
  public static void show() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Product ID: ");
    int id = in.nextInt();
    in.nextLine(); 
    
    System.out.print("Enter SKU Value: ");
    String sku = in.nextLine();
    
    System.out.print("Enter Description: ");
    String description = in.nextLine();
    
    System.out.print("Enter Price: ");
    String price = in.nextLine();
    
    System.out.print("Enter Maximum Discount: ");
    int maxDiscount = in.nextInt();
    
    System.out.print("Enter Stock Quantity: ");
    int stock = in.nextInt();
    
    Product uptade = new Product(sku, description, price, maxDiscount, stock);
    uptade.setId(id);
    new ProductDAO().uptade(uptade);

  }

}

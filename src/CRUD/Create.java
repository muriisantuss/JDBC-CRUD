package CRUD;

import java.util.Scanner;

import entity.Product;
import productDao.productDAO;

public class Create {
  public static void show() {
    Product p = new Product();
    Scanner in = new Scanner(System.in);

    System.out.print("SKU: ");
    p.setSku(in.nextLine());

    System.out.print("Description: ");
    p.setDescription(in.nextLine());

    System.out.print("Price: ");
    p.setPrice(in.nextLine());

    System.out.print("Max Discount: ");
    p.setMaxDiscount(in.nextInt());

    System.out.print("Stock: ");
    p.setStock(in.nextInt());

    new productDAO().registrationUser(p);

  }
}

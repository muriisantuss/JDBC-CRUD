package CRUD;

import java.util.Scanner;

import entity.Product;
import productDao.productDAO;

public class Create {
  public static void show() {
    Product create = new Product();
    Scanner in = new Scanner(System.in);

    System.out.print("SKU: ");
    create.setSku(in.nextLine());

    System.out.print("Description: ");
    create.setDescription(in.nextLine());

    System.out.print("Price: ");
    create.setPrice(in.nextLine());

    System.out.print("Max Discount: ");
    create.setMaxDiscount(in.nextInt());

    System.out.print("Stock: ");
    create.setStock(in.nextInt());

    new productDAO().create(create);

  }
}

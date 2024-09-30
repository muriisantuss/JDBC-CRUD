package CRUD;

import java.util.Scanner;

import entity.Product;
import productDao.ProductDAO;

public class Delete {
  public static void show() {
    Product delete = new Product();
    Scanner in = new Scanner(System.in);

    System.out.print("Enter with SKU to delete of the product: ");
    delete.setId(in.nextInt());

    new ProductDAO().delete(delete);
  }
}

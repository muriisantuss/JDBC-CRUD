package CRUD;

import java.util.Scanner;

import entity.Product;
import productDao.productDAO;

public class Delete {
  public static void show() {
    Product delete = new Product();
    Scanner in = new Scanner(System.in);

    System.out.print("Enter with SKU to delete of the product: ");
    delete.setSku(in.nextLine());

    new productDAO().delete(delete);
  }
}

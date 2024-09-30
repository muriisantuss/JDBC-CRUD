package CRUD;

import java.util.List;

import entity.Product;
import productDao.ProductDAO;

public class Read {
  public static void show() {

    ProductDAO productDAO = new ProductDAO();
    List<Product> products = productDAO.read();

    for (Product product : products) {
      System.out.println();
      System.out.println("-----------------------------");
      System.out.println("ID: " + product.getId());
      System.out.println("SKU: " + product.getSku());
      System.out.println("Description: " + product.getDescription());
      System.out.println("Price: " + product.getPrice());
      System.out.println("Max Discount: " + product.getMaxDiscount());
      System.out.println("Stock: " + product.getStock());
      System.out.println("-----------------------------");
    }

  }
}

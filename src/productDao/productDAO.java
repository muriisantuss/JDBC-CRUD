package productDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import java.sql.Statement;
import config.DatabaseConnection;
import entity.Product;

public class ProductDAO {
  public void create(Product product) {
    String sql = "INSERT INTO `tableclud` (sku,description,price,maxDiscount,stock) VALUES (?, ?, ?, ?, ?)";

    PreparedStatement state = null;
    try {
      state = DatabaseConnection.getConnection().prepareStatement(sql);
      state.setString(1, product.getSku());
      state.setString(2, product.getDescription());
      state.setString(3, product.getPrice());
      state.setInt(4, product.getMaxDiscount());
      state.setInt(5, product.getStock());

      state.execute();
    } catch (SQLException e) {
      e.printStackTrace();

    }
  }

  public void delete(Product product) {
    String sql = "DELETE FROM `tableclud` WHERE id = ?";

    PreparedStatement state = null;
    try {
      state = DatabaseConnection.getConnection().prepareStatement(sql);
      state.setInt(1, product.getId());
      int rowsAffected = state.executeUpdate();

      if (rowsAffected > 0) {
        System.out.println("Product deleted successfully.");
      } else {
        System.out.println("No product found with the given name.");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public List<Product> read() {
    List<Product> products = new ArrayList<>();
    String sql = "SELECT * FROM `tableclud`";

    Statement state = null;
    ResultSet resultSet = null;

    try {
      state = DatabaseConnection.getConnection().createStatement();
      resultSet = state.executeQuery(sql);

      while (resultSet.next()) {
        Product p = new Product();

        p.setId(resultSet.getInt("id"));
        p.setSku(resultSet.getString("sku"));
        p.setDescription(resultSet.getString("description"));
        p.setPrice(resultSet.getString("price"));
        p.setMaxDiscount(resultSet.getInt("maxDiscount"));
        p.setStock(resultSet.getInt("stock"));

        products.add(p);
      }
    } catch (SQLException e) {
      e.printStackTrace();

    }

    return products;
  }

  public void uptade(Product product) {
    String sql = "UPDATE `tableclud` SET sku = ?, description = ?, price = ?, maxDiscount = ?, stock = ? WHERE id = ?";
    PreparedStatement state = null;
    try {
      state = DatabaseConnection.getConnection().prepareStatement(sql);
      state.setString(1, product.getSku());
      state.setString(2, product.getDescription());
      state.setString(3, product.getPrice());
      state.setInt(4, product.getMaxDiscount());
      state.setInt(5, product.getStock());
      state.setInt(6, product.getId());

      state.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
package productDao;

// import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.DatabaseConnection;
import entity.Product;

public class productDAO {
  public void create(Product product) {
    String sql = "INSERT INTO crud.tablecrud (sku,description,price,maxDiscount,stock) VALUES (?, ?, ?, ?, ?)";

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
    String sql = "DELETE FROM crud.tablecrud WHERE sku = ?";

    PreparedStatement state = null;
    try {
      state = DatabaseConnection.getConnection().prepareStatement(sql);
      state.setString(1, product.getSku());
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
}

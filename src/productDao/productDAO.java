package productDao;

// import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.DatabaseConnection;
import entity.Product;

public class productDAO {
  public void registrationUser(Product product) {
    String sql = "INSERT INTO crud.tablecrud (sku,description,price,maxDiscount,stock) VALUES (?, ?, ?, ?, ?)";

    PreparedStatement state = null;
    try {
      state = DatabaseConnection.getConnection().prepareStatement(sql);
      state.setString(1, product.getSku());
      state.setString(2, product.getDescription());
      state.setString(3, product.getPrice());
      state.setInt   (4, product.getMaxDiscount());
      state.setInt   (5, product.getStock());
      
      state.execute();
    } catch (SQLException e) {
      e.printStackTrace();

    }
  }
}

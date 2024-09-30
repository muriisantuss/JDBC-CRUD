package entity;

public class Product {
  private String sku;
  private String description;
  private String price;
  private int maxDiscount;
  private int stock;

  public Product() {
  }

  public Product(String sku, String description, String price, int maxDiscount, int stock) {
    this.sku = sku;
    this.description = description;
    this.price = price;
    this.maxDiscount = maxDiscount;
    this.stock = stock;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public int getMaxDiscount() {
    return maxDiscount;
  }

  public void setMaxDiscount(int maxDiscount) {
    this.maxDiscount = maxDiscount;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}

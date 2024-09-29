package entity;

public class product {
  private int id;
  private int sku;
  private String description;
  private String price;
  private int maxDiscount;
  private int stock;

  public product() {
  }

  public product(int id, int sku, String description, String price, int maxDiscount, int stock) {
    this.id = id;
    this.sku = sku;
    this.description = description;
    this.price = price;
    this.maxDiscount = maxDiscount;
    this.stock = stock;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getSku() {
    return sku;
  }

  public void setSku(int sku) {
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

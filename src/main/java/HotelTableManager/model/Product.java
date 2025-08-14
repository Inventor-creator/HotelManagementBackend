package HotelTableManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    private Integer productId;
    private String productName;
    private Integer productCost;

    public Product() {

    }

    public Product(int productId, String productName, int productCost) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCost() {
        return productCost;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", ProductCost=" + productCost +
                '}';
    }
}

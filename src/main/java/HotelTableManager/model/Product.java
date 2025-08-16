package HotelTableManager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name="productId")
    private Integer productId;
    @Column(name="productName")
    private String productName;
    @Column(name="productCost")
    private Integer productCost;

    public Product() {

    }

    public Product(String productName, int productCost) {

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

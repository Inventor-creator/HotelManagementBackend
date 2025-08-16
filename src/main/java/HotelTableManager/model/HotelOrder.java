package HotelTableManager.model;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Entity
@Table(name = "HotelOrder")
public class HotelOrder {
    @Id
    @GeneratedValue
    @Column(name="orderId")
    private int orderId;
    @Column(name="orderDate")
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private LocalDate orderDate;

    @ManyToOne
    @JoinColumn(name = "billId" , referencedColumnName = "billId")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "productId" , referencedColumnName = "productId")
    private Product product;
    public HotelOrder(){

    }
    public HotelOrder( Bill bill, Product product) {
        this.orderDate = LocalDate.now() ;
        this.bill = bill;
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }



    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

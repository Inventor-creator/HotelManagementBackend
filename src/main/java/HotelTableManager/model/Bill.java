package HotelTableManager.model;

import jakarta.persistence.*;

@Entity
public class Bill {
    @Id
    @GeneratedValue
    private int billId;

    @ManyToOne
    @JoinColumn(name = "tabelId" , referencedColumnName = "tabelId")
    private HotelTabel hotelTabel;

    @Column(name="totalCost")
    private int totalCost;
    @Column(name="closed")
    private boolean closed;

    public Bill() {
    }

    public Bill(HotelTabel hotelTabel, int totalCost) {
        this.hotelTabel = hotelTabel;
        this.totalCost = totalCost;
        this.closed = true;
    }

    public Bill(HotelTabel hotelTabel) {
        this.hotelTabel = hotelTabel;
        this.closed = false;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public HotelTabel getHotelTabel() {
        return hotelTabel;
    }

    public void setHotelTabel(HotelTabel hotelTabel) {
        this.hotelTabel = hotelTabel;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

}

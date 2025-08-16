package HotelTableManager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class HotelTabel {
    @Id
    @GeneratedValue
    @Column(name="tabelId")
    private int tabelId;

    @Column(name="floorNum")
    private int floorNum;
    public HotelTabel(){

    }

    public HotelTabel(int floorNum){
        this.floorNum = floorNum;
    }

    public HotelTabel(int tabelId, int floorNum) {
        this.tabelId = tabelId;
        this.floorNum = floorNum;
    }

    public int getTabelId() {
        return tabelId;
    }

    public int getFloorNum() {
        return floorNum;
    }



    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }
}

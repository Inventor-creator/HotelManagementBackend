package HotelTableManager.repos;


import HotelTableManager.model.HotelOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<HotelOrder , Integer> {

    @Query(value = "SELECT o FROM HotelOrder o WHERE o.bill.billId = :billId")
    public List<HotelOrder> findByBillId(@Param("billId") Integer billId);
}

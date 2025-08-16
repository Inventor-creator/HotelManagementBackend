package HotelTableManager.repos;

import HotelTableManager.model.Bill;
import HotelTableManager.model.HotelTabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BillRepo extends JpaRepository<Bill , Integer> {
    @Query(value = "Select b FROM Bill b WHERE b.hotelTabel.tabelId = :tabelId AND b.closed = :closed")
    public Optional<Bill> findbyHotelTabelAndClosed(@Param("tabelId") int tabelId ,@Param("closed") boolean closed);

}

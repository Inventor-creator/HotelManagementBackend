package HotelTableManager.repos;

import HotelTableManager.model.HotelOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<HotelOrder , Integer> {



}

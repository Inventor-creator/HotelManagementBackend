package HotelTableManager.repos;

import HotelTableManager.model.HotelTabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepo extends JpaRepository<HotelTabel, Integer> {

}

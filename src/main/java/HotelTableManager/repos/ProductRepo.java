package HotelTableManager.repos;

import HotelTableManager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProductRepo extends JpaRepository<Product , Integer> {



    default boolean insert(Product product){

        this.save(product);

        return true;

    }
}

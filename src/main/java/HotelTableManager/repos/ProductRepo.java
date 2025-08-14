package HotelTableManager.repos;

import HotelTableManager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepo extends JpaRepository<Product , Integer> {
    default boolean insert(Product prod){
        if(findById(prod.getProductId()).isEmpty()){
            Product saveProd = new Product(prod.getProductId(), prod.getProductName(), prod.getProductCost());
            this.save(saveProd);

            return true;
        }
        else{
            return false;
        }
    }
}

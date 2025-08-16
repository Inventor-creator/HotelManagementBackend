package HotelTableManager.service;


import HotelTableManager.model.Product;
import HotelTableManager.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {



    @Autowired
    ProductRepo pRepo;


    public Boolean createProduct(Product product){

        return pRepo.insert( product);
    }

    public List<Product> getProducts(){
        return pRepo.findAll();
    }

}

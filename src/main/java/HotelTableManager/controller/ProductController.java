package HotelTableManager.controller;


import HotelTableManager.model.Product;
import HotelTableManager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/createProduct")
    public String createProductController(@RequestBody Product product){
        if(productService.createProduct(product)){
            return "Product Created Successfully";
        }
        else{
            return "Something went wrong";
        }
    }

    @GetMapping("/getProducts")
    public List<Product> getProductsController(){

            return  productService.getProducts();
    }


}

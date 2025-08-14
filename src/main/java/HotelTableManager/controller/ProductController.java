package HotelTableManager.controller;


import HotelTableManager.model.Product;
import HotelTableManager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}

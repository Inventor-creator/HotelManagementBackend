package HotelTableManager.controller;

import HotelTableManager.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateOrder {

    @Autowired
    OrderService orderService;

    @PostMapping("/addToBill")
    public String createOrder(@RequestParam Integer tableId , @RequestParam Integer productId ){

        return orderService.createOrder(tableId , productId);

    }

}

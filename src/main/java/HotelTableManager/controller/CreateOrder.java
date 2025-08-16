package HotelTableManager.controller;

import HotelTableManager.model.Bill;
import HotelTableManager.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CreateOrder {

    @Autowired
    OrderService orderService;

    @PostMapping("/addToBill")
    public String createOrder(@RequestParam Integer tableId , @RequestParam Integer productId ){

        return orderService.createOrder(tableId , productId);

    }

    @PostMapping("/closeBill")
    public String closeBillController(@RequestParam Integer tableId){
        return orderService.closeBill(tableId);
    }

    @GetMapping("/getBills")
    public List<Bill> getBillController(){
        return orderService.getBill();
    }

}

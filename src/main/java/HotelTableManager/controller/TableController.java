package HotelTableManager.controller;


import HotelTableManager.model.HotelTabel;
import HotelTableManager.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {

    @Autowired
    TableService tableSer;

    @PostMapping("/createTable")
    public String createTableController(@RequestParam Integer floorNum){
        if(tableSer.createTable(floorNum)) {

            return "Table created successfully";
        }
        else{
            return "Something went wrong";
        }
    }
    @GetMapping("/getTables")
    public List<HotelTabel> getTableController(){

        return tableSer.getTables();
    }
}

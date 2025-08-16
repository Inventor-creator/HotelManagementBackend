package HotelTableManager.controller;


import HotelTableManager.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}

package HotelTableManager.service;

import HotelTableManager.model.HotelTabel;
import HotelTableManager.repos.TableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {

    @Autowired
    TableRepo tRepo;

    public boolean createTable(int floorNum){
        try{
            HotelTabel hotelTabel = new HotelTabel(floorNum);
            tRepo.save(hotelTabel);

            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public List<HotelTabel> getTables(){
        return tRepo.findAll();
    }


}

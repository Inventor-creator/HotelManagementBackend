package HotelTableManager.service;

import HotelTableManager.model.Bill;
import HotelTableManager.model.HotelTabel;
import HotelTableManager.model.HotelOrder;

import HotelTableManager.model.Product;
import HotelTableManager.repos.BillRepo;
import HotelTableManager.repos.OrderRepo;
import HotelTableManager.repos.ProductRepo;
import HotelTableManager.repos.TableRepo;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired OrderRepo orderRepo;
    @Autowired ProductRepo productRepo;
    @Autowired TableRepo tableRepo;
    @Autowired BillRepo billRepo;

    public String createOrder(Integer tableId , Integer productId){
        //orderId
        //orderDate
        //orderCost
        //billId
        //productId
        Bill newBill;
        Optional<HotelTabel> temp = tableRepo.findById(tableId);
        if(billRepo.findbyHotelTabelAndClosed(tableId, false).isEmpty()){
            //create a bill for that tabel

            if(temp.isEmpty()){
                return "Table dosent exist";
            }
            else{

                newBill = new Bill(temp.get());
                billRepo.save(newBill);
            }
        }

        //now make the order and link it to the billId

        //get prod from repo first
        Optional<Product> newProduct = productRepo.findById(productId);
        Optional<Bill> getBill = billRepo.findbyHotelTabelAndClosed(temp.get().getTabelId() ,false);
        if(!newProduct.isEmpty()) {

            HotelOrder newOrder = new HotelOrder(getBill.get() , newProduct.get());
            orderRepo.save(newOrder);
            return "order successfully placed";
        }
        else{
            return " product dosent exist";
        }
    }

    public String closeBill(Integer tableId){
        if(tableRepo.findById(tableId).isEmpty()){
            return "Enter a valid table id";
        }
        if(billRepo.findbyHotelTabelAndClosed(tableId , false).isEmpty()){
            return "Order something first";
        }
        else{
            Bill billToClose = billRepo.findbyHotelTabelAndClosed(tableId , false).get();

            List<HotelOrder> orders =  orderRepo.findByBillId(billToClose.getBillId());
            int sum = 0;
            for(HotelOrder i: orders){
                sum += i.getProduct().getProductCost();
            }
            billToClose.setTotalCost(sum);
            billToClose.setClosed(true);
            billRepo.save(billToClose);
            return "Bill closed successfully, Your total is: $" + sum;
        }


    }
    public List<Bill> getBill(){
        return billRepo.findAll();
    }

}

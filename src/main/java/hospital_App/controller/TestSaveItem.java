package hospital_App.controller;

import java.util.ArrayList;
import java.util.List;

import hospital_App.dto.Item;
import hospital_App.dto.MedOrder;
import hospital_App.service.ItemService;
import hospital_App.service.MedOrderService;

public class TestSaveItem {

	public static void main(String[] args) {
		Item item1=new Item();
		item1.setName("Dolo");
		item1.setQuantity(5);
		item1.setCost(250);
		
		Item item2=new Item();
		item2.setName("Sumo");
		item2.setQuantity(2);
		item2.setCost(100);
			
		MedOrderService medOrderService=new MedOrderService();
		MedOrder medOrder=medOrderService.medOrderById(1);
		System.out.println(medOrder);
		item1.setMedOrder(medOrder);
		item2.setMedOrder(medOrder);
		
		ItemService itemService=new ItemService();
		itemService.saveItem(item1);
		itemService.saveItem(item2);
		
		List<Item> item=new ArrayList();
		item.add(item1);
		item.add(item2);
		
		medOrderService.totalBill(item, medOrder);
	}

}

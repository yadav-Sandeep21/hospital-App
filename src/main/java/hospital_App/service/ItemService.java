package hospital_App.service;

import hospital_App.dao.ItemDao;
import hospital_App.dto.Item;

public class ItemService {
	//Save Items Method
	public Item saveItem(Item item) {
		ItemDao itemDao=new ItemDao();
		return itemDao.saveItem(item);
		
	}

	public double calculateCost() {
		return 0;
	}
}

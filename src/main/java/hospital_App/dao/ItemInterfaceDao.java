package hospital_App.dao;

import hospital_App.dto.Item;

public interface ItemInterfaceDao {
	public abstract Item saveItem(Item item);
	public abstract double calculateCost();
}

package hospital_App.dao;

import java.util.List;

import hospital_App.dto.Item;
import hospital_App.dto.MedOrder;

public interface MedOrderInterfaceDao {
	public abstract MedOrder saveMedOrder(MedOrder medOrder);
	public abstract double totalBill(List<Item> items);
}

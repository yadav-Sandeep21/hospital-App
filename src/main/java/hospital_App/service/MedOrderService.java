package hospital_App.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hospital_App.dao.MedOrderDao;
import hospital_App.dto.Item;
import hospital_App.dto.MedOrder;

public class MedOrderService {
	//Save MedOrder Method
	public MedOrder saveMedOrder(MedOrder medOrder) {
		MedOrderDao medOrderDao=new MedOrderDao();
		return medOrderDao.saveMedOrder(medOrder);
	}

	public double totalBill(List<Item> items, MedOrder medOrder) {
		MedOrderDao medOrderDao=new MedOrderDao();
		return medOrderDao.totalBill(items, medOrder);
	}
	
	public MedOrder medOrderById(int id) {
		MedOrderDao medOrder=new MedOrderDao();
		return medOrder.medOrderById(id);
	}
}

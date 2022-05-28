package hospital_App.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MedOrder {
	private int medOrderId;
	private String description;
	private double cost;
	@ManyToOne
	private Encounter encounter;
	@OneToMany
	private List<Item> item;
}

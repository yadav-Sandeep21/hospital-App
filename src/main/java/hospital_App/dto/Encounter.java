package hospital_App.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int encounterId;
	private LocalDateTime admitDataTime;
	private LocalDateTime dischargeTime;
	private String reason;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@ManyToOne
	@JoinColumn
	private Person person;
	@OneToMany(mappedBy = "encounter")
	private List<Observation> observation;
	@OneToMany(mappedBy = "encounter")
	private List<MedOrder> medOrder;
	public int getEncounterId() {
		return encounterId;
	}
	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}
	public LocalDateTime getAdmitDataTime() {
		return admitDataTime;
	}
	public void setAdmitDataTime(LocalDateTime admitDataTime) {
		this.admitDataTime = admitDataTime;
	}
	public LocalDateTime getDischargeTime() {
		return dischargeTime;
	}
	public void setDischargeTime(LocalDateTime dischargeTime) {
		this.dischargeTime = dischargeTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Observation> getObservation() {
		return observation;
	}
	public void setObservation(List<Observation> observation) {
		this.observation = observation;
	}
	public List<MedOrder> getMedOrder() {
		return medOrder;
	}
	public void setMedOrder(List<MedOrder> medOrder) {
		this.medOrder = medOrder;
	}
}

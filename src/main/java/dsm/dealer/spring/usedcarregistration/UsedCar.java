package dsm.dealer.spring.usedcarregistration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carsale", catalog = "keywestcardealer")
public class UsedCar {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String carmake;
	private String carmodel;
	private String caryear;
	private SalvageTitle salvagetitle;
	public SalvageTitle getSalvagetitle() {
		return salvagetitle;
	}
	public void setSalvagetitle(SalvageTitle salvagetitle) {
		this.salvagetitle = salvagetitle;
	}
	public String getCarmake() {
		return carmake;
	}
	public void setCarmake(String carmake) {
		this.carmake = carmake;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCaryear() {
		return caryear;
	}
	public void setCaryear(String caryear) {
		this.caryear = caryear;
	}


	
}

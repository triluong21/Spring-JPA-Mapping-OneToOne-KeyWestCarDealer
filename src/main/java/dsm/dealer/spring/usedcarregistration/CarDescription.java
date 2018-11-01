package dsm.dealer.spring.usedcarregistration;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cardescription", catalog = "keywestcardealer")
public class CarDescription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	private String cardesc;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private UsedCar usedCar;
	
	public CarDescription() {
	}

	public CarDescription(UsedCar usedCar) {
		super();
		this.usedCar = usedCar;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardesc() {
		return cardesc;
	}
	public void setCardesc(String cardesc) {
		this.cardesc = cardesc;
	}
	public UsedCar getUsedCar() {
		return usedCar;
	}
	public void setUsedCar(UsedCar usedCar) {
		this.usedCar = usedCar;
	}
	
}

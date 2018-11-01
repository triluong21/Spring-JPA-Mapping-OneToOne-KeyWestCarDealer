package dsm.dealer.spring.usedcarregistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/CarDescription")
@RestController
public class CarDescriptionResources {
	private CarDescriptionRepository carDescriptionRepository;
	
	@Autowired
	public CarDescriptionResources(CarDescriptionRepository carDescriptionRepository) {
		super();
		this.carDescriptionRepository = carDescriptionRepository;
	}
	@GetMapping(value = "/all")
	public List<CarDescription> getCarDescription() {
		return carDescriptionRepository.findAll();
	}
	
	@GetMapping(value = "/update/{name}")
	public List<CarDescription> update(@PathVariable final String name) {
		return null;
		
	}
}

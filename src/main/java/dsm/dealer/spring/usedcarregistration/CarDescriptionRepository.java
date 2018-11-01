package dsm.dealer.spring.usedcarregistration;

import java.util.List;

public interface CarDescriptionRepository extends JpaRepository<CarDescription, Integer> {

	List<CarDescription> findAll();

}

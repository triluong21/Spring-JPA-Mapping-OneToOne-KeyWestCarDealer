package dsm.dealer.spring.usedcarregistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UsedCarDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KeyWestCarDealer");
	
	public void insertUsedCar(UsedCar usedcarToAdd){
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(usedcarToAdd);
		em.getTransaction().commit();
		//em.close();
		//emfactory.close();
	}

	public List<UsedCar> getAllUsedCars() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from UsedCar u";
		TypedQuery<UsedCar> typedQuery = em.createQuery(q, UsedCar.class);
		List<UsedCar> all = typedQuery.getResultList();
		return all;
	
	}
}

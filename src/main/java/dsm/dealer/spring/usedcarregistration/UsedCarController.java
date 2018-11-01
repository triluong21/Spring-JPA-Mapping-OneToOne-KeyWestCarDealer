package dsm.dealer.spring.usedcarregistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UsedCarController {

	@Autowired UsedCarDao dao;
	
	private static final String[ ] carmakes = { "Audi", "BMW", "Holden", "Ford", "Toyota", "Nissan", "Honda", "Mazda", "Mercedes", "Volkswagen", "Kia", "Peugeot", "Hyundai", "Chevrolet" };
	private static final String[ ] caryears = {"1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};

	
	@RequestMapping(value = "/frontpage")
	public ModelAndView usedcar( ){
		ModelAndView modelAndView = new ModelAndView( );
		
		modelAndView.setViewName("usedcarForm");
		modelAndView.addObject("usedcar", new UsedCar( ));
		modelAndView.addObject("carmakes", carmakes);
		modelAndView.addObject("caryears", caryears);
		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processUsedCar(UsedCar usedcar){
		ModelAndView modelAndView = new ModelAndView();
		dao.insertUsedCar(usedcar);
		modelAndView.setViewName("usedcarResult");
		modelAndView.addObject("u", usedcar);
		return modelAndView;
	}

	@Bean
	public UsedCarDao dao(){
		UsedCarDao bean = new UsedCarDao();
		return bean;
	}

	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll( ){
		ModelAndView modelAndView = new ModelAndView();
		List<UsedCar> allUsedCars = dao.getAllUsedCars();
		modelAndView.setViewName("viewAllUsedCars");
		modelAndView.addObject("all", allUsedCars);
		return modelAndView;
	}

	
}

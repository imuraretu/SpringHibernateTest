package ro.imuraretu.test;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.imuraretu.test.bo.ProductBo;
import ro.imuraretu.test.bo.UserBo;
import ro.imuraretu.test.bo.UserBoImpl;
import ro.imuraretu.test.model.Product;
import ro.imuraretu.test.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserBo userBo;
	
	@Autowired
	private ProductBo productBo;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		User user = new User("ion", "parola", "ion@gmail.com");
		List<Product> prods = new ArrayList<Product>();
		Product p = new Product("produs1", 20.0);
		productBo.create(p);
		prods.add(p);
		user.setProducts(prods);
		userBo.create(user);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}

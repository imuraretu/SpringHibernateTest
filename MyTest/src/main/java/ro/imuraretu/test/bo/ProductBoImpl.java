package ro.imuraretu.test.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ro.imuraretu.test.dao.GenericDao;
import ro.imuraretu.test.dao.ProductDao;
import ro.imuraretu.test.dao.UserDao;
import ro.imuraretu.test.model.Product;
import ro.imuraretu.test.model.User;

@Service
public class ProductBoImpl extends GenericBoImpl<Product, Integer> implements
		ProductBo {
	private ProductDao productDao;

	public ProductBoImpl() {

	}

	@Autowired
	public ProductBoImpl(
			@Qualifier("productDaoImpl") GenericDao<Product, Integer> genericDao) {
		super(genericDao);
		this.productDao = (ProductDao) genericDao;
	}
}

package ro.imuraretu.test.dao;

import org.springframework.stereotype.Component;

import ro.imuraretu.test.model.Product;

@Component("productDao")
public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao{

}

package ro.imuraretu.test.dao;

import org.springframework.stereotype.Repository;

import ro.imuraretu.test.model.Product;

@Repository
public class ProductDaoImpl extends GenericDaoImpl<Product, Integer> implements ProductDao{

}

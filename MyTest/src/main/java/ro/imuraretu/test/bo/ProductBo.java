package ro.imuraretu.test.bo;

import org.springframework.transaction.annotation.Transactional;

import ro.imuraretu.test.model.Product;

@Transactional
public interface ProductBo extends GenericBo<Product> {

}

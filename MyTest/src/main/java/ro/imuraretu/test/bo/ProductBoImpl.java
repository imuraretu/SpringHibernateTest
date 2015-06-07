package ro.imuraretu.test.bo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.imuraretu.test.model.Product;

@Service
@Transactional
public class ProductBoImpl extends GenericBoImpl<Product> implements ProductBo{

}

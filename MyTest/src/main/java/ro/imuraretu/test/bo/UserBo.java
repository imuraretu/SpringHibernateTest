package ro.imuraretu.test.bo;

import org.springframework.transaction.annotation.Transactional;

import ro.imuraretu.test.model.User;


@Transactional
public interface UserBo extends GenericBo<User> {
	
}

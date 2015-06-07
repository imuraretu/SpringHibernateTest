package ro.imuraretu.test.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ro.imuraretu.test.dao.GenericDao;
import ro.imuraretu.test.dao.UserDao;
import ro.imuraretu.test.model.User;

@Service
public class UserBoImpl extends GenericBoImpl<User, Integer> implements UserBo {

	private UserDao userDao;

	public UserBoImpl() {

	}

	@Autowired
	public UserBoImpl(
			@Qualifier("userDaoImpl") GenericDao<User, Integer> genericDao) {
		super(genericDao);
		this.userDao = (UserDao) genericDao;
	}
}

package ro.imuraretu.test.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ro.imuraretu.test.model.User;

@Component("userDao")
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

}

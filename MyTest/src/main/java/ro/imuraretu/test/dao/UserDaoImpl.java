package ro.imuraretu.test.dao;

import org.springframework.stereotype.Repository;

import ro.imuraretu.test.model.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

}

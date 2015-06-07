package ro.imuraretu.test.bo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.imuraretu.test.model.User;

@Service
@Transactional
public class UserBoImpl extends GenericBoImpl<User> implements UserBo{

}

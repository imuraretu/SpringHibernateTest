package ro.imuraretu.test.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.imuraretu.test.dao.GenericDao;

@Transactional
public class GenericBoImpl<T> implements GenericBo<T> {

	@Autowired
	GenericDao<T> genericDao;

	@Override
	public void create(T t) {
		genericDao.create(t);
	}

	@Override
	public T getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}

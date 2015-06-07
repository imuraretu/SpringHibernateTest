package ro.imuraretu.test.dao;

import java.util.List;

public interface GenericDao<T> {

	void create(T t);

	T getById(long id);

	List<T> getAll();

	void update(T t);

	void delete(long id);

}

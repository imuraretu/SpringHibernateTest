package ro.imuraretu.test.bo;

import java.util.List;

public interface GenericBo<T> {
	void create(T t);

	T getById(long id);

	List<T> getAll();

	void update(T t);

	void delete(long id);
}

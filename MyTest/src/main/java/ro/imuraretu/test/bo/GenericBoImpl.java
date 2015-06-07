package ro.imuraretu.test.bo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ro.imuraretu.test.dao.GenericDao;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public abstract class GenericBoImpl<E, K> 
        implements GenericBo<E, K> {
 
    private GenericDao<E, K> genericDao;
 
    public GenericBoImpl(GenericDao<E,K> genericDao) {
        this.genericDao=genericDao;
    }
 
    public GenericBoImpl() {
    }
 
    @Override
    public void saveOrUpdate(E entity) {
        genericDao.saveOrUpdate(entity);
    }
 
    @Override
    public List<E> getAll() {
        return genericDao.getAll();
    }
 
    @Override
    public E get(K id) {
        return genericDao.find(id);
    }
 
    @Override
    public void add(E entity) {
        genericDao.add(entity);
    }
 
    @Override
    public void update(E entity) {
        genericDao.update(entity);
    }
 
    @Override
    public void remove(E entity) {
        genericDao.remove(entity);
    }
}
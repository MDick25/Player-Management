package service;



import java.util.List;

import javax.persistence.EntityManager;

import exception.ServiceException;
import util.EMUtil;

public class TemplateService<T> {
	protected EMUtil eMUtil;
	protected final Class<T> typeClass;
	
	public TemplateService(Class<T> typeClass) {
		this.eMUtil = EMUtil.getInstance();
		this.typeClass = typeClass;
	}
	
	public void save(T entity) throws ServiceException{
		serviceTransaction(entity, Service.SAVE);
		
	}
	public void update(T entity) throws ServiceException{
		serviceTransaction(entity, Service.UPDATE);
	}
	public void delete(T entity) throws ServiceException{
		serviceTransaction(entity, Service.DELETE);
		
	}
	public void serviceTransaction(T entity, Service action) throws ServiceException{
		EntityManager entityManager = eMUtil.createManager();
		try {
			entityManager.getTransaction().begin();
			switch (action) {
			case SAVE:
				entityManager.persist(entity);
				break;
			case UPDATE:
				entityManager.merge(entity);
				break;
			case DELETE:
				entityManager.remove(entity);
				break;
			}
			entityManager.getTransaction().commit();
		}catch(Exception e) {
			entityManager.getTransaction().rollback();
		}finally {
			if(entityManager!= null) {
				entityManager.close();
			}
		}
	}
	public T findById(Long id) {
		EntityManager entityManager = eMUtil.createManager();
		try {
			return (T) entityManager.find(typeClass, id);
		}catch(Exception e) {
			
		}finally {
			if(entityManager != null) {
				entityManager.close();
			}
		}
		return null;
	}
	public List<T> findAll(){
		EntityManager entityManager = eMUtil.createManager();
		
		List<T> tList = entityManager.createQuery("FROM" + typeClass.getName()).getResultList();
		entityManager.close();
		
		return tList;
		
	}
	public List<T> findAllActive(){
		EntityManager entityManager = eMUtil.createManager();
		List<T> tList = entityManager.createQuery(("FROM" + typeClass.getName() + "WHERE status = 1")).getResultList();
		return tList;
	}
	public List<T> findAllInactive(){
		EntityManager entityManager = eMUtil.createManager();
		List<T> tList = entityManager.createQuery("FROM" + typeClass.getName() + "WHERE status = 0" ).getResultList();
		return tList;
				
	}

}

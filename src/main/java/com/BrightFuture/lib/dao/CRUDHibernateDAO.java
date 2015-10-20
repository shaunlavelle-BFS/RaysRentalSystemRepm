package com.BrightFuture.lib.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;

/**
 * Hibernate implementation of the CRUD DAO.
 * @author Stephen
 */
@Repository
public class CRUDHibernateDAO implements CRUDDAO
{
	/* The @Autowired annotation means that sessionFactory will be instantiated only once across the whole program 
	 * by Spring. This is much more efficient that creating a new one for each controller. Session Factories are also 
	 * heavy on processing due to loading the drivers etc.
	 */
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * @see uk.co.brightfuture.dasacumen.dao.CRUDDAO#retrieve(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public <M> M retrieve(final Class<M> model, final Serializable id)
	{
		return retrieve(model, id, (String[]) null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see uk.co.brightfuture.dasacumen.dao.CRUDDAO#retrieve(java.lang.Class, java.io.Serializable, java.lang.String[])
	 */
	@Override
	public <M> M retrieve(final Class<M> model, final Serializable id, String ... eagerLoads)
	{
		try
		{
			M entity = entityManager.getReference(model, id);
			
			// XXX Implement eager loading
//			if(null != eagerLoads)
//			{
//				ExpressionParser parser = new SpelExpressionParser();
//				EvaluationContext context = new StandardEvaluationContext(entity);
//				Expression exp;
//
//				for (String string : eagerLoads)
//				{
//					exp = parser.parseExpression(string);
//					Object value = exp.getValue(context);
//					Hibernate.initialize(value);
//				}
//			}
			
			return entity;
		}
		catch (EntityNotFoundException e)
		{
			throw e;
		}
	}

	@Override
	public <M> void refresh(M model)
	{
		entityManager.refresh(model);
	}
	
	/**
	 * @see uk.co.brightfuture.dasacumen.dao.CRUDDAO#create(java.lang.Object)
	 */
	@Override
	public <M> void create(M modelObject)
	{
		try
		{
			entityManager.persist(modelObject);
		}
		catch(RuntimeException e)
		{
			throw e;
		}
	}
	
	@Override
	public <M> M update(M modelObject)
	{
		try
		{
			return entityManager.merge(modelObject);
		}
		catch(RuntimeException e)
		{
			throw e;
		}
	}
	
	/**
	 * @see uk.co.brightfuture.dasacumen.dao.CRUDDAO#retrieveAll(java.lang.Class)
	 */
	@Override
	public <M> List<M> retrieveAll(Class<M> model) 
	{
		try
		{
			CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
			CriteriaQuery<M> query = criteriaBuilder.createQuery(model);
			Root<M> root = query.from(model);
			query.select(root);
			List<M> resultList = entityManager.createQuery(query).getResultList();
			return resultList;
		}
		catch (HibernateException e)
		{
			throw e;
		}
	}
	
	/**
	 * @see uk.co.brightfuture.dasacumen.dao.CRUDDAO#delete(java.lang.Object)
	 */
	@Override
	public <M> void delete(M model)
	{
		try{
			M todelete = entityManager.contains(model) ? model : entityManager.merge(model);
			entityManager.remove(todelete);
		}
		catch(HibernateException e){
			throw e;
		}
	}

	@Override
	public void flush()
	{
		entityManager.flush();
	}
}
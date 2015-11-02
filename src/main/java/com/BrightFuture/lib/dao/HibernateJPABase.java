package com.BrightFuture.lib.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.googlecode.genericdao.dao.jpa.GenericDAOImpl;
import com.googlecode.genericdao.search.jpa.JPASearchProcessor;

/**
 * Base class for all Hibernate JPA DAOs. Autowires the entity manager and the search processor
 * @author selliott
 */
public class HibernateJPABase<T, ID extends Serializable> extends GenericDAOImpl<T, ID>
{
	@Override
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
	}
	
	@Override
    @Autowired
    public void setSearchProcessor(JPASearchProcessor searchProcessor){
        super.setSearchProcessor(searchProcessor);
    }
}

/**
 * 
 */
package com.BrightFuture.lib.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BrightFuture.lib.dao.CRUDDAO;
import com.BrightFuture.lib.dao.SearchDAO;
import com.BrightFuture.lib.search.SearchModel;
import com.BrightFuture.lib.search.SearchResult;

/**
 * Implementation of the generic CRUD service.
 * 
 * For CRUD (create, retrieve, update, delete) operations on the database.
 * 
 * @author Stephen
 */
@Service
@Transactional
public class CRUDServiceImpl implements CRUDService
{
	/**
	 * The DAO responsible for the database CRUD operations
	 */
	@Autowired
	private CRUDDAO genericDAO;
	@Autowired
	private SearchDAO searchDAO;

	/**
	 */
	@Override
	public <M> M retrieve(Class<M> model, Long id)
	{
		return retrieve(model, id, (String[]) null);
	}
	@Override
	public <M> M retrieve(Class<M> model, Long id, String... eagerLoads)
	{
		return genericDAO.retrieve(model, id, eagerLoads);
	}

	@Override
	public <M> void create(M modelObject)
	{
		genericDAO.create(modelObject);
	}
	@Override
	public void createAll(Collection<?> modelObjects)
	{
		for (Object object : modelObjects)
		{
			genericDAO.create(object);
		}
	}
	
	@Override
	public <M> M update(M modelObject)
	{
		return genericDAO.update(modelObject);
	}

	@Override
	public <M> List<M> retrieveAll(Class<M> model)
	{
		return genericDAO.retrieveAll(model);
	}

	@Override
	public <M> void delete(M model)
	{
		genericDAO.delete(model);
	}

	@Override
	public <M> List<M> findByExample(M searchExample)
	{
		return searchDAO.findByExample(searchExample);
	}
	
	@Override
	public <M> SearchResult<M> generalSearch(SearchModel<M> searchObject){
		return searchDAO.generalSearch(searchObject);
	}
	
	@Override
	public <M> int count(SearchModel<M> searchObject){
		return searchDAO.count(searchObject);
	}

	@Override
	public <M> SearchResult<M> generalSearch(SearchModel<M> searchObject, String ... eagerLoads)
	{
		searchObject.setFetches(Arrays.asList(eagerLoads));
		return searchDAO.generalSearch(searchObject);
	}

}

package com.BrightFuture.lib.service;

import java.util.Collection;
import java.util.List;

import com.BrightFuture.lib.search.SearchModel;
import com.BrightFuture.lib.search.SearchResult;


/**
 * Generic service for all CRUD operations. Can be generic as the model object
 * is all the differs
 * 
 * @author Stephen
 */
public interface CRUDService
{
	/**
	 * Retrieves an entity of a particular type by its primary key.
	 * @param model The entity class (model) to retrieve.
	 * @param id The primary key
	 * @return
	 */
	public <M> M retrieve(Class<M> model, Long id);
	public <M> M retrieve(Class<M> model, Long id, String ... eagerLoads);

	public <M> List<M> retrieveAll(Class<M> model);

	public <M> void create(M modelObject);

	public void createAll(Collection<?> modelObjects);

	public <M> M update(M modelObject);

	public <M> void delete(M model);

	public <M> List<M> findByExample(M searchExample);
	
	/**
	 * Performs a search on the specified entity within the search model class.
	 * @param searchObject
	 * @return
	 */
	public <M> SearchResult<M> generalSearch(SearchModel<M> searchObject);

	public <M> SearchResult<M> generalSearch(SearchModel<M> searchObject, String ... eagerLoads);
	public <M> int count(SearchModel<M> searchObject);

}
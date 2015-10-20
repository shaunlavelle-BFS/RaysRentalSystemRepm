package com.BrightFuture.lib.dao;

import java.util.List;

import com.BrightFuture.lib.search.SearchModel;
import com.BrightFuture.lib.search.SearchResult;


public interface SearchDAO
{
	/**
	 * A very simple search facility to find all entities that match the set
	 * fields in the example.
	 */
	public <M> List<M> findByExample(M searchExample);

	public <M> SearchResult<M> generalSearch(SearchModel<M> searchObject);

	public <M> int count(SearchModel<M> searchObject);
	
}

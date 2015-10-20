package com.BrightFuture.lib.dao;

import java.io.Serializable;
import java.util.List;


public interface CRUDDAO
{
	public <M> M retrieve(Class<M> model, Serializable id);
	public <M> M retrieve(Class<M> model, Serializable id, String ... eagerLoads);

	public <M> List<M> retrieveAll(Class<M> model);

	public <M> void create(M modelObject);

	public <M> M update(M modelObject);

	public <M> void delete(M model);
	
	/**
	 * Refresh the state of the model with that from the database
	 */
	public <M> void refresh(M model);
	
	/**
	 * Flush the database statements. This should very rarely be used as hibernate will handle things 99% of the time.
	 */
	public void flush();
}

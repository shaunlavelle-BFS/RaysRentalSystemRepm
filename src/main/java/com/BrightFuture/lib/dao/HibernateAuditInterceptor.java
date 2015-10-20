/**
 * 
 */
package com.BrightFuture.lib.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

import com.BrightFuture.lib.security.UserUtils;

/**
 * Hibernate intercepter to set the audit fields on all model objects when saving to the DB
 * @author Stephen Elliott
 */
@Component("hibernateAuditInterceptor")
public class HibernateAuditInterceptor extends EmptyInterceptor
{
	@Override
	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types)
	{
		setValue(currentState, propertyNames, "lastUpdatedBy", UserUtils.getLoggedInUserName());
		setValue(currentState, propertyNames, "lastUpdatedDate", LocalDateTime.now());
		return true;
	}

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types)
	{
		LocalDateTime now = LocalDateTime.now();
		setValue(state, propertyNames, "createdBy", UserUtils.getLoggedInUserName());
		setValue(state, propertyNames, "createdDate", now);
		setValue(state, propertyNames, "lastUpdatedBy", UserUtils.getLoggedInUserName());
		setValue(state, propertyNames, "lastUpdatedDate", now);
		return true;
	}

	private void setValue(Object[] currentState, String[] propertyNames, String propertyToSet, Object value)
	{
		int index = Arrays.asList(propertyNames).indexOf(propertyToSet);
		if (index >= 0)
		{
			currentState[index] = value;
		}
	}
}

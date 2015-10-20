package com.BrightFuture.lib.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * UserUtils class which includes common user functions
 * 
 * @author ROakley
 */
public class UserUtils {

	/**
	 * Returns the users name of the currently logged in User, or null if no one is logged in.
	 * @return current logged in user name
	 */
	public static String getLoggedInUserName() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return null != auth ? auth.getName() : null;
	}

}
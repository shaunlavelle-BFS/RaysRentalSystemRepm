package com.BrightFuture.RaysRentalSystem.bikes;

import com.googlecode.genericdao.dao.jpa.GenericDAO;

interface BikeDAO extends GenericDAO<Bike, Long>
{
	int retrieveAvailableAdultBikeCount();
}
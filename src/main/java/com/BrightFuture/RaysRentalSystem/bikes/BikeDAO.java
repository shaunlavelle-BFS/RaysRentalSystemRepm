package com.BrightFuture.RaysRentalSystem.bikes;

import com.BrightFuture.RaysRentalSystem.constants.BikeSize;
import com.googlecode.genericdao.dao.jpa.GenericDAO;

interface BikeDAO extends GenericDAO<Bike, Long>
{
	int retrieveAvailableBikeCount(BikeSize bikeSize);
}
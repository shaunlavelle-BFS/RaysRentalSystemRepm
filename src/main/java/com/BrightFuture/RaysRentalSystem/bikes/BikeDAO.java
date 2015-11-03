package com.BrightFuture.RaysRentalSystem.bikes;

import java.util.List;

import com.BrightFuture.RaysRentalSystem.constants.BikeSize;
import com.googlecode.genericdao.dao.jpa.GenericDAO;

public interface BikeDAO extends GenericDAO<Bike, Long>
{
	List<Bike> retrieveAvailableBikes(BikeSize bikeSize, Boolean available);
}
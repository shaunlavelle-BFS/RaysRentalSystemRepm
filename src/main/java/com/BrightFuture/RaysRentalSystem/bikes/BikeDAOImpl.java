package com.BrightFuture.RaysRentalSystem.bikes;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.BrightFuture.RaysRentalSystem.constants.BikeSize;
import com.BrightFuture.lib.dao.HibernateJPABase;
import com.googlecode.genericdao.search.Search;

/**
 * @author slavelle
 *
 */
@Repository
class BikeDAOImpl extends HibernateJPABase<Bike, Long> implements BikeDAO
{
	@Override
	public List<Bike> retrieveAvailableBikes(BikeSize bikeSize, Boolean available) {
		Search bikeSearch = new Search(Bike.class);
		bikeSearch.addFilterEqual("bike_size", bikeSize);
		bikeSearch.addFilterEqual("available", available);
		List<Bike> bikesRetrieved = super.search(bikeSearch);
		return bikesRetrieved;
	}
}
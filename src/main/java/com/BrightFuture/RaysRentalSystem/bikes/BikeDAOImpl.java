package com.BrightFuture.RaysRentalSystem.bikes;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.BrightFuture.RaysRentalSystem.constants.Size;
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
	public int retrieveAvailableAdultBikeCount() {
		/*Search bikeSearch = new Search(Bike.class);
		bikeSearch.addFilterEqual("size", Size.LARGE);
		List<Feature> featuresRetrieved = super.search(featureSearch);
		featuresRetrieved.size();
		return featuresRetrieved;*/
		//TODO
		return 0;
	}
}

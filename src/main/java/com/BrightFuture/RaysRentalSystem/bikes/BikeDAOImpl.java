package com.BrightFuture.RaysRentalSystem.bikes;

import org.springframework.stereotype.Repository;

import com.BrightFuture.lib.dao.HibernateJPABase;

/**
 * DAO implementation for Device Log
 * @author selliott
 */
@Repository
class BikeDAOImpl extends HibernateJPABase<Bike, Long> implements BikeDAO
{
}

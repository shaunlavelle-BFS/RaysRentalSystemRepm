package com.BrightFuture.RaysRentalSystem.rent;

import org.springframework.stereotype.Repository;

import com.BrightFuture.RaysRentalSystem.bikes.RentalRecord;
import com.BrightFuture.lib.dao.HibernateJPABase;

/**
 * @author slavelle
 *
 */
@Repository
public class RentDAOImpl extends HibernateJPABase<RentalRecord, Long> implements RentDAO{

}
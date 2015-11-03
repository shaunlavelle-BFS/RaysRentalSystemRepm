package com.BrightFuture.RaysRentalSystem.customer;

import org.springframework.stereotype.Repository;

import com.BrightFuture.lib.dao.HibernateJPABase;

/**
 * @author slavelle
 *
 */
@Repository
public class CustomerDAOImpl extends HibernateJPABase<Customer, Long> implements CustomerDAO{

}

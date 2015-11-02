package com.BrightFuture.RaysRentalSystem.rent;

import java.security.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.BrightFuture.RaysRentalSystem.bikes.BikeService;
import com.BrightFuture.RaysRentalSystem.constants.BikeSize;
import com.BrightFuture.RaysRentalSystem.customer.Customer;

@Controller
@RequestMapping("/")
public class RentController {

	@Autowired
	BikeService bikeService;
	
	@RequestMapping(value= "rent", method = RequestMethod.GET)
	public ModelAndView rentView() {
		RentForm rentForm = new RentForm();
		Customer customer = new Customer();
		rentForm.setCustomer(customer);
		ModelAndView mv = new ModelAndView("rent/rent");
		
		int largeMaleBikeCount = bikeService.retrieveAvailableBikeCount(BikeSize.LARGE_MALE);
		int largeFemaleBikeCount = bikeService.retrieveAvailableBikeCount(BikeSize.LARGE_FEMALE);
		int standardMaleBikeCount = bikeService.retrieveAvailableBikeCount(BikeSize.STANDARD_MALE);
		int standardFemaleBikeCount = bikeService.retrieveAvailableBikeCount(BikeSize.STANDARD_FEMALE);
		int childBikeCount = bikeService.retrieveAvailableBikeCount(BikeSize.CHILD);
		
		mv.addObject(rentForm);
		mv.addObject("largeMaleBikeCount", largeMaleBikeCount);
		mv.addObject("largeFemaleBikeCount", largeFemaleBikeCount);
		mv.addObject("standardMaleBikeCount", standardMaleBikeCount);
		mv.addObject("standardFemaleBikeCount", standardFemaleBikeCount);
		mv.addObject("childBikeCount", childBikeCount);
		
		return mv;
	}
	
	@RequestMapping(value= "rent", method = RequestMethod.POST)
	public ModelAndView rentBikes(@ModelAttribute("rentForm") RentForm rentForm) { 
		//TODO Validation 
		System.out.println(rentForm.getCustomer().getFirstName());
		System.out.println(rentForm.getCustomer().getSurname());
		System.out.println(rentForm.getCustomer().getTelephone());
		System.out.println(rentForm.getCustomer().getAddress().getAddressLine1());
		System.out.println(rentForm.getCustomer().getAddress().getAddressLine2());
		System.out.println(rentForm.getCustomer().getAddress().getCounty());
		System.out.println(rentForm.getCustomer().getAddress().getCity());
		System.out.println(rentForm.getCustomer().getAddress().getPostcode());
		System.out.println(rentForm.getRentDate());
		System.out.println(rentForm.getReturnTimeDue());
		System.out.println(rentForm.getTimeOut());
		
		
		
		System.out.println(rentForm.getAmountPaid());
		
		
		
		
		
		
		
		
		
		/*java.sql.Timestamp sq = new java.sql.Timestamp(rentForm.getRentDate().getTime());
		System.out.println(sq);*/
		
		ModelAndView mv = new ModelAndView("home/index");
		return mv;
	}
}
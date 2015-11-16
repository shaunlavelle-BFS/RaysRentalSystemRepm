package com.BrightFuture.RaysRentalSystem.rent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.BrightFuture.RaysRentalSystem.bikes.Bike;
import com.BrightFuture.RaysRentalSystem.bikes.BikeService;
import com.BrightFuture.RaysRentalSystem.constants.BikeSize;
import com.BrightFuture.RaysRentalSystem.customer.Customer;

@Controller
@RequestMapping("/")
public class RentController {

	@Autowired
	BikeService bikeService;
	
	@Autowired
	RentService rentService;
	
	@Autowired
	RentValidator rentValidator;
	
	@RequestMapping(value= "rent", method = RequestMethod.GET)
	public ModelAndView rentView() {
		RentForm rentForm = new RentForm();
		Customer customer = new Customer();
		rentForm.setCustomer(customer);
		ModelAndView mv = new ModelAndView("rent/rent");
		
		List<Bike> largeMaleBikeCount = bikeService.retrieveAvailableBikes(BikeSize.LARGE_MALE, true);
		List<Bike> largeFemaleBikeCount = bikeService.retrieveAvailableBikes(BikeSize.LARGE_FEMALE, true);
		List<Bike> standardMaleBikeCount = bikeService.retrieveAvailableBikes(BikeSize.STANDARD_MALE, true);
		List<Bike> standardFemaleBikeCount = bikeService.retrieveAvailableBikes(BikeSize.STANDARD_FEMALE, true);
		List<Bike> childBikeCount = bikeService.retrieveAvailableBikes(BikeSize.CHILD, true);

		mv.addObject(rentForm);
		mv.addObject("largeMaleBikeCount", largeMaleBikeCount.size());
		mv.addObject("largeFemaleBikeCount", largeFemaleBikeCount.size());
		mv.addObject("standardMaleBikeCount", standardMaleBikeCount.size());
		mv.addObject("standardFemaleBikeCount", standardFemaleBikeCount.size());
		mv.addObject("childBikeCount", childBikeCount.size());
		
		return mv;
	}
	
	@RequestMapping(value= "rent", method = RequestMethod.POST)
	public ModelAndView rentBikes(@ModelAttribute("rentForm") RentForm rentForm, BindingResult bindingResult) { 
		rentValidator.validate(rentForm, bindingResult);
		
		if (bindingResult.hasErrors()) {
			ModelAndView mv = new ModelAndView("rent/rent");
			return mv;
		}
		
		rentService.rentBikes(rentForm);
		
		ModelAndView mv = new ModelAndView("home/index");
		return mv;
	}
}
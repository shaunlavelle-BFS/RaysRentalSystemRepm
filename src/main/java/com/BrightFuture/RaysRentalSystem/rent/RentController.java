package com.BrightFuture.RaysRentalSystem.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.BrightFuture.RaysRentalSystem.bikes.BikeService;

@Controller
@RequestMapping("/")
public class RentController {

	@Autowired
	BikeService bikeService;
	
	@RequestMapping(value= "rent", method = RequestMethod.GET)
	public ModelAndView rentView() {
		RentForm rentForm = new RentForm();
		ModelAndView mv = new ModelAndView("rent/rent");
		int adultBikeCount = bikeService.retrieveAvailableAdultBikeCount();
		int childBikeCount = bikeService.retrieveAvailableChildBikeCount();
		mv.addObject(rentForm);
		mv.addObject(adultBikeCount);
		mv.addObject(childBikeCount);
		return mv;
	}
}
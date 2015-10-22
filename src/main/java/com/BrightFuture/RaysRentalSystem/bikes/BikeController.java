package com.BrightFuture.RaysRentalSystem.bikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BikeController 
{
	
	@Autowired
	BikeService bikeService;
	
	@RequestMapping(value="newBike", method = RequestMethod.GET) 
	public ModelAndView addNewBike() 
	{
	/*	Bike bike = new Bike();
		bikeService.addNewBike(bike);*/
		ModelAndView mv = new ModelAndView("bike/newBike");
		return mv;
	}
}
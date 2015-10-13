package com.BrightFuture.RaysRentalSystem.bikes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rent")
public class RentController {
	
	@RequestMapping("/bike")
	public ModelAndView rentBike() {
		ModelAndView mv = new ModelAndView("rent/rent");
		return mv;
	}
}
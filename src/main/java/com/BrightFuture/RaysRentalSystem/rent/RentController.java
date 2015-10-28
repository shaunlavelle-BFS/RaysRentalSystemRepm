package com.BrightFuture.RaysRentalSystem.rent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class RentController {

	@RequestMapping("customerRent")
	public ModelAndView rentView() {
		ModelAndView mv = new ModelAndView("rent/customerRent");
		return mv;
	}
	
	@RequestMapping("adminRent")
	public ModelAndView rentForm() {
		ModelAndView mv = new ModelAndView("rent/adminRent");
		return mv;
	}
}

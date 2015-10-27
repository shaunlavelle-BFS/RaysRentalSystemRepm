package com.BrightFuture.RaysRentalSystem.rent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class RentController {

	@RequestMapping("adminRent")
	public ModelAndView rentView() {
		ModelAndView mv = new ModelAndView("rent/adminrent");
		return mv;
	}
}

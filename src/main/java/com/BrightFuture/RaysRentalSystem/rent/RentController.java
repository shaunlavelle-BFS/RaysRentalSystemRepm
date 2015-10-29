package com.BrightFuture.RaysRentalSystem.rent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class RentController {

	@RequestMapping("rent")
	public ModelAndView rentView() {
		RentForm rentForm = new RentForm();
		ModelAndView mv = new ModelAndView("rent/rent");
		mv.addObject(rentForm);
		return mv;
	}
}
package com.BrightFuture.RaysRentalSystem.stock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class StockContoller {

	@RequestMapping(value="stock", method = RequestMethod.GET) 
	public ModelAndView addStock() 
	{
		Stock stock = new Stock();
		ModelAndView mv = new ModelAndView("bike/stock");
		mv.addObject("stock", stock);
		return mv;
	}
	
	@RequestMapping(value="stock", method = RequestMethod.POST) 
	public ModelAndView addStock(Stock stock) 
	{
		ModelAndView mv = new ModelAndView("bike/stock");
		mv.addObject("stock", stock);
		return mv;
	}
}
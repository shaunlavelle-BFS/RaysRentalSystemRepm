package com.BrightFuture.RaysRentalSystem.bikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class stockContoller {

	@Autowired
	StockService stockService;
	
	@RequestMapping(value="stock", method = RequestMethod.GET) 
	public ModelAndView addStock() 
	{
		Stock stock = new Stock();
		ModelAndView mv = new ModelAndView("/stock");
		mv.addObject("stock", stock);
		return mv;
	}
	
	@RequestMapping(value="stock", method = RequestMethod.POST) 
	public ModelAndView addStock(Stock stock) 
	{
		ModelAndView mv = new ModelAndView("/stock");
		mv.addObject("stock", stock);
		return mv;
	}
}
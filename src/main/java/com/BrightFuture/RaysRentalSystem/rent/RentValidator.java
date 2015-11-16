package com.BrightFuture.RaysRentalSystem.rent;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

import org.hsqldb.lib.StringUtil;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RentValidator implements Validator{

	//public static final String CURRENCY_REGEX = "^\$(([1-9]\d{0,2}(,\d{3})*)|(([1-9]\d*)?\d))(\.\d\d)?$";
	@Override
	public boolean supports(Class<?> clazz) {
		return RentForm.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RentForm rentForm = (RentForm) target;
		
		if(StringUtil.isEmpty(rentForm.getCustomer().getFirstName()))
		{
			errors.rejectValue("customer.firstName", null, "First Name can not be empty");
		}
		
		/*DecimalFormat format = new DecimalFormat();
		format.setParseBigDecimal(true);
		try {
			BigDecimal bigDecimal = (BigDecimal) format.parse(rentForm.getAmountPaid());
			System.out.println(bigDecimal);
		} catch (ParseException e) {
			errors.rejectValue("amountPaid", null, "Invalid Amount Paid value");
		}*/
		
	}
	
	
	
	
	
	
	


}
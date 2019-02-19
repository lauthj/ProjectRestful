package com.journaldev.spring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.journaldev.spring.model.*;

/**
 * Handles requests for the Employee service.
 */
@Controller
public class customerTaProfileController {
	
	@Autowired
	
	private static final Logger logger = LoggerFactory.getLogger(customerTaProfileController.class);
		
	//Map to store employees, ideally we should use database
	Map<Object, CustomerTaProfileJSON> customerTaProfile = new HashMap<Object, CustomerTaProfileJSON>();
	Map<Integer, Employee> empData = new HashMap<Integer, Employee>();
	
	@RequestMapping(value = EmpRestURIConstants.CREATE_CUSTOMER, method = RequestMethod.POST)
	public @ResponseBody CustomerTaProfileJSON createProfile(@RequestBody CustomerTaProfileJSON cust) {
		System.out.println("Testing");
		if(cust.getCustomerTaProfile().getGeneralData().getIata().equalsIgnoreCase("Hotels.com")) {
			System.out.println("In CREATE_customerProfile");
			System.out.println("Really?");
			}
		logger.info("Is this why? CREATE_customerProfile");
		cust.setCreatedDate(new Date());
		customerTaProfile.put(cust.getCustomerTaProfile(), cust);
		return cust;
	}
	
	@RequestMapping(value = EmpRestURIConstants.GET_ALL_CUST, method = RequestMethod.GET)
	public @ResponseBody List<CustomerTaProfileJSON> getAllCusts() {
		logger.info("Start getAllCusts");
		List<CustomerTaProfileJSON> custs = new ArrayList<CustomerTaProfileJSON>();
		Set<Object> empIdKeys = customerTaProfile.keySet();
		for(Object i : empIdKeys){
			custs.add(customerTaProfile.get(i));
		}
		return custs;
	}
	
	
	@RequestMapping(value = EmpRestURIConstants.CREATE_EMP1, method = RequestMethod.POST)
	public @ResponseBody Employee createEmployee(@RequestBody Employee emp) {
		System.out.println("In CREATE_customerProfile");
		logger.info("Start createEmployee");
		emp.setCreatedDate(new Date());
		empData.put(emp.getId(), emp);
		return emp;
	}
	
	
}

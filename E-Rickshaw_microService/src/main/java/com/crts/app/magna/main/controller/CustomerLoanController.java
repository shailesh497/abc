package com.crts.app.magna.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.crts.app.magna.main.model.GuarantorDetails;
import com.crts.app.magna.main.model.LoanDetails;
import com.crts.app.magna.main.service.ServiceInterface;
@CrossOrigin("*")
@RestController
public class CustomerLoanController {
	
	@Autowired
	ServiceInterface si;
	
	@RequestMapping("/")
	public String prepage()
	{
		return "welcome";
		
	}
	
	
	
	@RequestMapping(value = "save" , method = RequestMethod.POST)
	public GuarantorDetails saveData(@RequestBody GuarantorDetails g)
	{
		si.saveData(g);
		return g;
	}
	
	@RequestMapping(value = "/get",method =RequestMethod.GET)
	public List<GuarantorDetails> getData(@ModelAttribute GuarantorDetails g,Model m)
	{
		return si.getData();
	}
	
	
	@RequestMapping(value = "/getallData",method = RequestMethod.GET)
	public List<GuarantorDetails> showAllDataDurantor()
	{
			List<GuarantorDetails> list=(List<GuarantorDetails>)	si.getData();
			return list;
	}
}

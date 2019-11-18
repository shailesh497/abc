package com.crts.app.magna.main.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crts.app.magna.main.model.GuarantorDetails;
import com.crts.app.magna.main.model.LoanDetails;
import com.crts.app.magna.main.repository.HomeRepository;


@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	HomeRepository hm;

	

	@Override
	public void saveData(GuarantorDetails g) {
		hm.save(g);
		
	}



	@Override
	public List<GuarantorDetails> getData() {
		// TODO Auto-generated method stub
		return (List<GuarantorDetails>) hm.findAll();
	}



	

	
	

}

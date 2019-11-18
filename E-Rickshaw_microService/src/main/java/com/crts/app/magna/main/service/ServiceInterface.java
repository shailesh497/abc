package com.crts.app.magna.main.service;

import java.util.List;


import com.crts.app.magna.main.model.GuarantorDetails;
//import com.crts.app.magna.main.model.LoanDetails;

public interface ServiceInterface {
	
	
	

	public void saveData(GuarantorDetails g);

	public List<GuarantorDetails> getData();
	
	

	

}

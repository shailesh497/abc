package com.crts.app.magna.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MfCustomerPersonalDetails {
	@Id
	 private int cust_p_d_id;
	 private int cust_id;
	 private String cust_occupation;
	 private String cust_local_address;
	 private String cust_local_ps;
	 private  String cust_localdistid;
	 private  String cust_localstateid;
	 private  String cust_p_address;
	 private  String cust_p_ps;
	 private  String cust_p_distid;
	 private  String cust_p_stateid;
	 private  String annual_income;
	 

}

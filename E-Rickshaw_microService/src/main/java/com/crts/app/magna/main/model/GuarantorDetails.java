package com.crts.app.magna.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GuarantorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int g_id;
	private String g_name;
	private String g_p_id;
	private String g_p_value;
	private String g_s_id;
	private String g_s_value;
	private String g_mobileno;
	private String g_emailid;
	private String g_address;
	private String g_occupation;
	private String g_gender;
	private String g_dob;
	public int getG_id() {
		return g_id;
	}
	public void setG_id(int g_id) {
		this.g_id = g_id;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_p_id() {
		return g_p_id;
	}
	public void setG_p_id(String g_p_id) {
		this.g_p_id = g_p_id;
	}
	public String getG_p_value() {
		return g_p_value;
	}
	public void setG_p_value(String g_p_value) {
		this.g_p_value = g_p_value;
	}
	public String getG_s_id() {
		return g_s_id;
	}
	public void setG_s_id(String g_s_id) {
		this.g_s_id = g_s_id;
	}
	public String getG_s_value() {
		return g_s_value;
	}
	public void setG_s_value(String g_s_value) {
		this.g_s_value = g_s_value;
	}
	public String getG_mobileno() {
		return g_mobileno;
	}
	public void setG_mobileno(String g_mobileno) {
		this.g_mobileno = g_mobileno;
	}
	public String getG_emailid() {
		return g_emailid;
	}
	public void setG_emailid(String g_emailid) {
		this.g_emailid = g_emailid;
	}
	public String getG_address() {
		return g_address;
	}
	public void setG_address(String g_address) {
		this.g_address = g_address;
	}
	public String getG_occupation() {
		return g_occupation;
	}
	public void setG_occupation(String g_occupation) {
		this.g_occupation = g_occupation;
	}
	public String getG_gender() {
		return g_gender;
	}
	public void setG_gender(String g_gender) {
		this.g_gender = g_gender;
	}
	public String getG_dob() {
		return g_dob;
	}
	public void setG_dob(String g_dob) {
		this.g_dob = g_dob;
	}
	
	

}

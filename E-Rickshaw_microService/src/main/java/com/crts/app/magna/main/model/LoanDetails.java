package com.crts.app.magna.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanDetails {

	@Id
	private String loan_detail_id;
	private String vehicle_price;
	private String on_road_price;
	private String tennure;
	private String loan_amount;
	private String Second_year_insurence;
	private String advanced_emi;
	private String processing_fees;
	private String down_payment;
	private String rate_of_intrest;
	private String emi;
	private String actual_emi;
	private String paid_to_dealer;
	private String paid_to_magna_finance;
	public String getLoan_detail_id() {
		return loan_detail_id;
	}
	public void setLoan_detail_id(String loan_detail_id) {
		this.loan_detail_id = loan_detail_id;
	}
	public String getVehicle_price() {
		return vehicle_price;
	}
	public void setVehicle_price(String vehicle_price) {
		this.vehicle_price = vehicle_price;
	}
	public String getOn_road_price() {
		return on_road_price;
	}
	public void setOn_road_price(String on_road_price) {
		this.on_road_price = on_road_price;
	}
	public String getTennure() {
		return tennure;
	}
	public void setTennure(String tennure) {
		this.tennure = tennure;
	}
	public String getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(String loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getSecond_year_insurence() {
		return Second_year_insurence;
	}
	public void setSecond_year_insurence(String second_year_insurence) {
		Second_year_insurence = second_year_insurence;
	}
	public String getAdvanced_emi() {
		return advanced_emi;
	}
	public void setAdvanced_emi(String advanced_emi) {
		this.advanced_emi = advanced_emi;
	}
	public String getProcessing_fees() {
		return processing_fees;
	}
	public void setProcessing_fees(String processing_fees) {
		this.processing_fees = processing_fees;
	}
	public String getDown_payment() {
		return down_payment;
	}
	public void setDown_payment(String down_payment) {
		this.down_payment = down_payment;
	}
	public String getRate_of_intrest() {
		return rate_of_intrest;
	}
	public void setRate_of_intrest(String rate_of_intrest) {
		this.rate_of_intrest = rate_of_intrest;
	}
	public String getEmi() {
		return emi;
	}
	public void setEmi(String emi) {
		this.emi = emi;
	}
	public String getActual_emi() {
		return actual_emi;
	}
	public void setActual_emi(String actual_emi) {
		this.actual_emi = actual_emi;
	}
	public String getPaid_to_dealer() {
		return paid_to_dealer;
	}
	public void setPaid_to_dealer(String paid_to_dealer) {
		this.paid_to_dealer = paid_to_dealer;
	}
	public String getPaid_to_magna_finance() {
		return paid_to_magna_finance;
	}
	public void setPaid_to_magna_finance(String paid_to_magna_finance) {
		this.paid_to_magna_finance = paid_to_magna_finance;
	}
}

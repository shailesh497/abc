package com.crts.app.magna.main.repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.crts.app.magna.main.model.GuarantorDetails;
//import com.crts.app.magna.main.model.LoanDetails;

@Repository
public interface HomeRepository extends JpaRepository<GuarantorDetails, Integer>

{



	
	
}
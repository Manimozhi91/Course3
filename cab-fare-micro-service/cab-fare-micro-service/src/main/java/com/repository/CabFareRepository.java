package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.CabFare;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Double>{

	
	
	@Query("select cf.amount from CabFare cf " + "where cf.tolocation = :tolocation"
	+ " AND " + " cf.fromlocation = :fromlocation" + " AND  " + "cf.typeofcab= :typeofcab")
	public Double findByFromlocationAndTolocationAndTypeofcab(String fromlocation,String tolocation,String typeofcab);

}
	

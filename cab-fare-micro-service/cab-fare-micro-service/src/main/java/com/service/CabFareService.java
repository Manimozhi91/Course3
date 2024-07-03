package com.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.CabFare;
import com.repository.CabFareRepository;

@Service
public class CabFareService implements Serializable{

	@Autowired
	CabFareRepository cabFareRepository;
	
	public String storeCarFare(CabFare cb) {
		cabFareRepository.save(cb);
		return "Cab Details stored";
	}
	
	public List<CabFare> findAllCabDetails() {
		return cabFareRepository.findAll();
	}

	public Double findCabFare(String tolocation, String fromlocation,String typeofcab) {
//		 List<CabFare> repo =cabFareRepository.findAll();
//		 for (cab:repo) {
//			 
		// }
		try {
			System.out.println("fare calculating...");
			System.out.println("TO"+tolocation);
			System.out.println("FROM"+fromlocation);

			System.out.println("Amount in cabfare MS" + cabFareRepository.findByFromlocationAndTolocationAndTypeofcab(tolocation, fromlocation, typeofcab));
			return cabFareRepository.findByFromlocationAndTolocationAndTypeofcab(tolocation, fromlocation, typeofcab);
		} catch (Exception e) {
			System.out.println(e);
			return -1.0;
		}
		
	}

}

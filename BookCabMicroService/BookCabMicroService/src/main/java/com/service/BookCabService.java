package com.service;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.Book;
import com.repository.BookCabRepository;

@Service
public class BookCabService implements Serializable{

	@Autowired
BookCabRepository bookCabRepository;	//cname,source,destination, typeofcab,numberofseats
	
	@Autowired
	RestTemplate restTemplate;
	
	public String bookCab(Book bc) throws URISyntaxException {
		System.out.println("BOOkkkkk"+bc.toString());
//		String tolocation = bc.getTolocaation();
//		System.out.println("TO"+tolocation);
//		String fromlocation = bc.getFromlocation();
//		System.out.println("FROM"+fromlocation);
//
//		String typeofcab = bc.getTypeofcab();
//		System.out.println(typeofcab);

//	URI uri = new URI("http://CABFARESERVICE/cabfare/findCabFare/{tolocation}/{fromlocation}/{typeofcab}");
Map<String, String> map = new HashMap<>();
map.put("tolocation",bc.getTolocaation());
map.put("fromlocation",bc.getFromlocation());
map.put("typeofcab",bc.getTypeofcab());
String URL="http://CABFARESERVICE/cabfare/findCabFare/{tolocation}/{fromlocation}/{typeofcab}";

//		Double amount = 
//restTemplate.getForObject("http://localhost:8282/cabfare/findCabFare/"+tolocation+"/"+fromlocation+"/"+typeofcab,Double.class);
Double amount = restTemplate.getForObject(URL, Double.class,map);		
System.out.println("Amount " +amount);

		if(amount==null) {
			return "No Cab Avaiable as of now, So cab didn't book";
		}else if(amount==-1.0){
			
			return "Amount is 0";
	}
		else {
			bc.setAmount(amount);
			bookCabRepository.save(bc);
		
			System.out.println("Amount "+bc);
			return "Your cab fare amount is "+amount;
		}
	}



	public void deleteById(Integer bookcabid) {
		bookCabRepository.deleteById(bookcabid);  
		
	}



	public List<Book> findAllBookings() {
		return bookCabRepository.findAll();
	}

}
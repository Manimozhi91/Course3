package com.controller;

import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.Book;
import com.service.BookCabService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BookCabController {

	@Autowired
	BookCabService bookCabService;
	@RequestMapping(value="/displayAll",method = RequestMethod.GET)	
	public String  getAllBookings(Model model) {
	
		List<Book> listOfBookings = bookCabService.findAllBookings();
		System.out.println("LiSt of BOOKINGS"+listOfBookings);
		model.addAttribute("listOfBookings", listOfBookings);
//	mav.setViewName("displayAll");
//	mav.addObject("listOfBookings",listOfBookings);
	return "displayAll";
		//return bookCabService.findAllBookings();
	}

	@RequestMapping(value="/home",method = RequestMethod.GET)	
	public String homePage() {
	return "home";
}
	@RequestMapping(value = "/bookCab",method = RequestMethod.POST)
	public String books(HttpServletRequest req, Book bookcab) throws URISyntaxException { 
		String cname = req.getParameter("cname");
	String fromlocation = req.getParameter("fromlocation");
		String tolocation = req.getParameter("tolocation");
		String typeofcab = req.getParameter("typeofcab");
		System.out.println(cname);
		System.out.println(fromlocation);
		bookcab.setCname(cname);
		bookcab.setFromlocation(fromlocation);
		bookcab.setTolocaation(tolocation);
		bookcab.setTypeofcab(typeofcab);
		bookcab.setBookingtime(LocalDateTime.now());
		String result ;
		 result=bookCabService.bookCab(bookcab);

		return "index";
	}
//	@RequestMapping(value="/cancel{cname}",method = RequestMethod.DELETE)	
//	public String cancelCab(HttpServletRequest req, Book bookcab) {
//		String cname=req.getParameter("cname");
//		System.out.print("Cancel");
//	return "/cancel";
//}
	@DeleteMapping("/cancel/{bookcabid}")  
	private void deleteCab(@PathVariable("bookcabid") Integer bookcabid)   
	{  
		bookCabService.deleteById(bookcabid);  

	}  

}

	





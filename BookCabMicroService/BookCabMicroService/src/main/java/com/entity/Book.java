package com.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookcab")
public class Book implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false)
	private Long bookcabid;
	private String cname;
	private LocalDateTime bookingtime;		// current data and time.
	private Double amount;					// 
	private String fromlocation;
	private String tolocaation;
	private String typeofcab;
	public Book(Long bookcabid, String cname, LocalDateTime bookingtime, Double amount, String fromlocation,
			String tolocaation, String typeofcab) {
		super();
		this.bookcabid = bookcabid;
		this.cname = cname;
		this.bookingtime = bookingtime;
		this.amount = amount;
		this.fromlocation = fromlocation;
		this.tolocaation = tolocaation;
		this.typeofcab = typeofcab;
	}



	
	public Long getBookcabid() {
		return bookcabid;
	}
	public void setBookcabid(Long bookcabid) {
		this.bookcabid = bookcabid;
	}
	@Override
	public String toString() {
		return "Book [bookcabid=" + bookcabid + ", cname=" + cname + ", bookingtime=" + bookingtime + ", amount="
				+ amount + ", fromlocation=" + fromlocation + ", tolocaation=" + tolocaation + ", typeofcab="
				+ typeofcab + "]";
	}
	


	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public LocalDateTime getBookingtime() {
		return bookingtime;
	}
	public void setBookingtime(LocalDateTime bookingtime) {
		this.bookingtime = bookingtime;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getFromlocation() {
		return fromlocation;
	}
	public void setFromlocation(String fromlocation) {
		this.fromlocation = fromlocation;
	}
	public String getTolocaation() {
		return tolocaation;
	}
	public void setTolocaation(String tolocaation) {
		this.tolocaation = tolocaation;
	}
	public String getTypeofcab() {
		return typeofcab;
	}
	public void setTypeofcab(String typeofcab) {
		this.typeofcab = typeofcab;
	}


	public Book() {
		super();
	}


}

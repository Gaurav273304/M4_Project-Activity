package com.ltts.ticket.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	private int ticketid;
 private String mobile;
 private String moviename;
 private int nooftickets;
 private LocalDate bookingdate;
 private LocalDate showdate;
 private LocalDate showtime;
 private String ticketType;
 private int totalamount;
 
public Ticket(int ticketid, String mobile, String moviename, int nooftickets, LocalDate bookingdate, LocalDate showdate,
		LocalDate showtime, String ticketType, int totalamount) {
	super();
	this.ticketid = ticketid;
	this.mobile = mobile;
	this.moviename = moviename;
	this.nooftickets = nooftickets;
	this.bookingdate = bookingdate;
	this.showdate = showdate;
	this.showtime = showtime;
	this.ticketType = ticketType;
	this.totalamount = totalamount;
}
public int getTicketid() {
	return ticketid;
	
}
public void setTicketid(int ticketid) {
	this.ticketid = ticketid;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public int getNooftickets() {
	return nooftickets;
}
public void setNooftickets(int nooftickets) {
	this.nooftickets = nooftickets;
}
public LocalDate getBookingdate() {
	return bookingdate;
}
public void setBookingdate(LocalDate bookingdate) {
	this.bookingdate = bookingdate;
}
public LocalDate getShowdate() {
	return showdate;
}
public void setShowdate(LocalDate showdate) {
	this.showdate = showdate;
}
public LocalDate getShowtime() {
	return showtime;
}
public void setShowtime(LocalDate showtime) {
	this.showtime = showtime;
}
public String getTicketType() {
	return ticketType;
}
public void setTicketType(String ticketType) {
	this.ticketType = ticketType;
}
public int getTotalamount() {
	return totalamount;
}
public void setTotalamount(int totalamount) {
	this.totalamount = totalamount;
}
@Override
public String toString() {
	return "Ticket [ticketid=" + ticketid + ", mobile=" + mobile + ", moviename=" + moviename + ", nooftickets="
			+ nooftickets + ", bookingdate=" + bookingdate + ", showdate=" + showdate + ", showtime=" + showtime
			+ ", ticketType=" + ticketType + ", totalamount=" + totalamount + "]";
}

}
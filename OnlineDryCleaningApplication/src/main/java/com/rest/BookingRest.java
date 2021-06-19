package com.rest;



import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Booking;
import com.service.IBookingService;

@RestController
@RequestMapping("/booking")
public class BookingRest {

	@Autowired
	private IBookingService iBookingService;


	@PostMapping("/add")
	public Booking addBooking(@RequestBody Booking booking) {
		Booking booking1 = null;
		booking1 = this.iBookingService.addBooking(booking);
		return booking1;
	}

	@GetMapping("/get/{bookingId}")
	public Booking getBooking(@PathVariable long bookingId) {
		Booking booking1 = this.iBookingService.getBooking(bookingId);
		return booking1;
	}
	

	@GetMapping("/all")
	public List<Booking> getAllBookings() {
		List<Booking> bookings = this.iBookingService.getAllBookings();
		return bookings;
	}

	@DeleteMapping("/delete/{bookingId}")
	public Booking removeBooking(@PathVariable long bookingId) {
		Booking booking1 = this.iBookingService.removeBooking(bookingId);
		return booking1;
	}

	
	@PutMapping("/update")
	public Booking updateBooking(@RequestBody Booking booking) {
		Booking booking1 = this.iBookingService.updateBooking(booking);
		return booking1;
	}

	@GetMapping("/getbydate/{localDate}")
	public List<Booking> getBookingsByDate(@PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate localDate) {
		List<Booking> booking1 = this.iBookingService.getBookingsByDate(localDate);
		return booking1;
	}

	
	@GetMapping("/getbycustomer/{customerId}")
	public List<Booking> getBookingsByCustomer(@PathVariable String customerId) {
		List<Booking> booking1 = this.iBookingService.getBookingsByCustomer(customerId);
		return booking1;
	}
}

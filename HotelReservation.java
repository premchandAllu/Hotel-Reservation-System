package com.blz.HotelReservationSystem;

import java.util.*;

public class HotelReservation {

	private List<Hotel> hotelList = new ArrayList<Hotel>();

	public boolean addHotel(String hotelName, int rateForRegularCustomer) {
		Hotel hotel = new Hotel(hotelName, rateForRegularCustomer);
		hotelList.add(hotel);
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Hotel Reservation Program in HotelReservation class on Master Branch");
	}

}
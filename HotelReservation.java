package com.blz.HotelReservationSystem;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.*;

public class HotelReservation {

	private List<Hotel> hotelList = new ArrayList<Hotel>();

	public boolean addHotel(String hotelName, int rateForWeekdaysRegularCustomer, int rateForWeekendsRegularCustomer) {
		Hotel hotel = new Hotel(hotelName, rateForWeekdaysRegularCustomer, rateForWeekendsRegularCustomer);
		hotelList.add(hotel);
		return true;
	}

	public Hotel cheapestHotel(String dateStart, String dateEnd) {
		Date startDate = null;
		Date endDate = null;
		try {
			startDate = new SimpleDateFormat("ddMMMYYYY").parse(dateStart);
			endDate = new SimpleDateFormat("ddMMMYYYY").parse(dateEnd);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		long dateRange = 2 + (endDate.getTime() - startDate.getTime()) / 1000 / 60 / 60 / 24;
		Hotel cheapHotel = hotelList.stream().sorted(Comparator.comparing(Hotel::getRateForWeekdaysRegularCustomer))
				.findFirst().orElse(null);
		long totalRate = dateRange * cheapHotel.getRateForWeekdaysRegularCustomer();
		cheapHotel.setTotalRate(totalRate);
		return cheapHotel;
	}

	public static void main(String[] args) {
		
		HotelReservation hotelReservation = new HotelReservation();
		System.out.println("Welcome to Hotel Reservation Program in HotelReservation class on Master Branch");
		Scanner sc = new Scanner(System.in);
		hotelReservation.addHotel("Lakewood", 110, 90);
		hotelReservation.addHotel("Bridgewood", 150, 50);
		hotelReservation.addHotel("Ridgewood", 220, 150);
		System.out.println("Enter the hotel Name of your choice");
		String hotelName = sc.next();
		System.out.println("Enter the rate for Weekdays for regular customer");
		int rateWeekdays = sc.nextInt();
		System.out.println("Enter the rate for Weekends for regular customer");
		int rateWeekends = sc.nextInt();
		hotelReservation.addHotel(hotelName, rateWeekdays, rateWeekends);
		System.out.println("Enter the start date in ddMMMYYYY format");
		String start = sc.next();
		System.out.println("Enter the end date in ddMMMYYYY format");
		String end = sc.next();
		Hotel cheapHotel = hotelReservation.cheapestHotel(start, end);
		System.out.println(cheapHotel.getHotelName() + "'s total rate is " + cheapHotel.getTotalRate());
	}

}
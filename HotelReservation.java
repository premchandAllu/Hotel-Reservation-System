package com.blz.HotelReservationSystem;

import java.util.*;

public class HotelReservation {

	private List<Hotel> hotelList = new ArrayList<Hotel>();

	public boolean addHotelForRegularCustomers(String hotelName, int rateForWeekdaysRegularCustomer,int rateForWeekendsRegularCustomer,int rating) {
		Hotel hotel = new Hotel(hotelName, rateForWeekdaysRegularCustomer,rateForWeekendsRegularCustomer,rating);
		hotelList.add(hotel);
		return true;
	}
	
	public boolean addHotelForRewardsCustomers(String hotelName, int rateForWeekdaysRewardsCustomer,int rateForWeekendsRewardsCustomer,int rating) {
		Hotel hotel = new Hotel(hotelName, rateForWeekdaysRewardsCustomer,rateForWeekendsRewardsCustomer,rating);
		hotelList.add(hotel);
		return true;
	}

	public static void main(String[] args) {
		
		HotelReservation hotelReservation =new HotelReservation();
		System.out.println("Welcome to Hotel Reservation Program in HotelReservation class on Master Branch");
        Scanner sc=new Scanner(System.in);
        sc.close();
        hotelReservation.addHotelForRewardsCustomers("Lakewood",80,80,3);
        hotelReservation.addHotelForRewardsCustomers("Bridgewood",110,50,4);
        hotelReservation.addHotelForRewardsCustomers("Ridgewood",100,40,5);
	}

}
package com.blz.HotelReservationSystem;

import org.junit.Assert;

import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void addHotelForRegularCustomerTest() {
		HotelReservation hotelReservation = new HotelReservation();
		boolean checkHotel = hotelReservation.addHotelForRegularCustomers("Bridgewood", 150,50,4);
		Assert.assertEquals(true, checkHotel);
	}

	@Test
	public void addHotelForRewardsCustomerTest() {
		HotelReservation hotelReservation = new HotelReservation();
		boolean checkHotel = hotelReservation.addHotelForRewardsCustomers("Bridgewood", 110,50,4);
		Assert.assertEquals(true, checkHotel);
	}
}
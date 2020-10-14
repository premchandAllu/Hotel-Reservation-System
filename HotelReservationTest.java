package com.blz.HotelReservationSystem;

import org.junit.Assert;

import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void addHotelForRegularCustomerTest() {
		HotelReservation hotelReservation = new HotelReservation();
		boolean checkHotel = hotelReservation.addHotel("Bridgewood", 150,50);
		Assert.assertEquals(true, checkHotel);
	}

}
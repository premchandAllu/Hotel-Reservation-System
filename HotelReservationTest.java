package com.blz.HotelReservationSystem;

import org.junit.Assert;

import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void addHotelForRegularCustomerTest() {
		HotelReservation hotelReservation = new HotelReservation();
		boolean checkHotel = hotelReservation.addHotel("Bridgewood", 160);
		Assert.assertEquals(true, checkHotel);
	}

}
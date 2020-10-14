package com.blz.HotelReservationSystem;

public class Hotel {

	public String hotelName;
	public int rateForRegularCustomer;
	public long totalRate;
	
	public long getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(long totalRate2) {
		this.totalRate = totalRate2;
	}

	public Hotel(String hotelName,int rateForRegularCustomer) {
		this.hotelName=hotelName;
		this.rateForRegularCustomer=rateForRegularCustomer;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setRateForRegularCustomer(int rateForRegularCustomer) {
		this.rateForRegularCustomer = rateForRegularCustomer;
	}

	public int getRateForRegularCustomer() {
		return rateForRegularCustomer;
	}
}
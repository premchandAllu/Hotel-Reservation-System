package com.blz.HotelReservationSystem;

public class Hotel {

	public String hotelName;
	public int rateForWeekdaysRegularCustomer;
	public int rateForWeekendsRegularCustomer;
	public long totalRate;
	
	public long getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(long totalRate2) {
		this.totalRate = totalRate2;
	}

	public Hotel(String hotelName,int rateForWeekdaysRegularCustomer,int rateForWeekendsRegularCustomer) {
		this.hotelName=hotelName;
		this.rateForWeekdaysRegularCustomer=rateForWeekdaysRegularCustomer;
		this.rateForWeekendsRegularCustomer=rateForWeekendsRegularCustomer;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public int getRateForWeekdaysRegularCustomer() {
		return rateForWeekdaysRegularCustomer;
	}

	public void setRateForWeekdaysRegularCustomer(int rateForWeekdaysRegularCustomer) {
		this.rateForWeekdaysRegularCustomer = rateForWeekdaysRegularCustomer;
	}

	public int getRateForWeekendsRegularCustomer() {
		return rateForWeekendsRegularCustomer;
	}

	public void setRateForWeekendsRegularCustomer(int rateForWeekendsRegularCustomer) {
		this.rateForWeekendsRegularCustomer = rateForWeekendsRegularCustomer;
	}

	
}
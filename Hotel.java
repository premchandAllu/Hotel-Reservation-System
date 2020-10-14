package com.blz.HotelReservationSystem;

public class Hotel {

	private String hotelName;
	private int rateForWeekdaysRegularCustomer;
	private int rateForWeekendsRegularCustomer;
	private int rateForWeekdaysRewardsCustomer;
	private int rateForWeekendsRewardsCustomer;
	private int rating;
	private long totalRate;

	public Hotel(String hotelName, int rateForWeekdaysRegularCustomer, int rateForWeekendsRegularCustomer, int rating,
			int rateForWeekdaysRewardsCustomer, int rateForWeekendsRewardsCustomer) {
		this.hotelName = hotelName;
		this.rateForWeekdaysRegularCustomer = rateForWeekdaysRegularCustomer;
		this.rateForWeekendsRegularCustomer = rateForWeekendsRegularCustomer;
		this.rateForWeekdaysRewardsCustomer = rateForWeekdaysRewardsCustomer;
		this.rateForWeekendsRewardsCustomer = rateForWeekendsRewardsCustomer;
		this.rating = rating;
	}

	public int getRateForWeekdaysRewardsCustomer() {
		return rateForWeekdaysRewardsCustomer;
	}

	public void setRateForWeekdaysRewardsCustomer(int rateForWeekdaysRewardsCustomer) {
		this.rateForWeekdaysRewardsCustomer = rateForWeekdaysRewardsCustomer;
	}

	public int getRateForWeekendsRewardsCustomer() {
		return rateForWeekendsRewardsCustomer;
	}

	public void setRateForWeekendsRewardsCustomer(int rateForWeekendsRewardsCustomer) {
		this.rateForWeekendsRewardsCustomer = rateForWeekendsRewardsCustomer;
	}

	public long getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(long totalRate2) {
		this.totalRate = totalRate2;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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

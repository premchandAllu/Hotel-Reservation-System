package com.blz.HotelReservationSystem;

import java.util.*;
import java.util.stream.Collectors;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HotelReservation {

	private List<Hotel> hotelList = new ArrayList<Hotel>();

	public boolean addHotel(String hotelName, int rateForWeekdaysRegularCustomer,int rateForWeekendsRegularCustomer,int rating) {
		Hotel hotel = new Hotel(hotelName, rateForWeekdaysRegularCustomer,rateForWeekendsRegularCustomer,rating);
		hotelList.add(hotel);
		return true;
	}
	
	public Hotel bestRatedHotel(String start,String end) {
		Date StartDate=null;
		Date EndDate=null;
		 try {
			 StartDate = new SimpleDateFormat("ddMMMyyyy").parse(start);
			 EndDate = new SimpleDateFormat("ddMMMyyyy").parse(end);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 long noOfDays=1+(EndDate.getTime()-StartDate.getTime())/1000/60/60/24;
		  Calendar startCal = Calendar.getInstance();
	      startCal.setTime(StartDate);  
		  Calendar endCal = Calendar.getInstance();
	      endCal.setTime(EndDate);
	      long weekdays = 0;
	      if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
	            startCal.setTime(EndDate);
	            endCal.setTime(StartDate);
	            
	        }
	        do {
	            if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
	                ++weekdays;
	            }
	            startCal.add(Calendar.DAY_OF_MONTH, 1);
	        } while (startCal.getTimeInMillis() <= endCal.getTimeInMillis()); 
	        
	       long weekends = noOfDays - weekdays;
	        
	       for(Hotel hotel: hotelList) {
	        	long totalRate = weekdays*hotel.getRateForWeekdaysRegularCustomer()+weekends*hotel.getRateForWeekendsRegularCustomer();
	        	hotel.setTotalRate(totalRate);
	        }
		 List<Hotel> bestRatedHotelList = hotelList.stream().sorted(Comparator.comparing(Hotel::getRating).reversed()).collect(Collectors.toList());
	        
	      Hotel bestRatedHotel = bestRatedHotelList.get(0);
	      int bestHotelRating= bestRatedHotelList.get(0).getRating();
	       for(Hotel hotel:bestRatedHotelList) {
	    	   if(hotel.getRating()>=bestHotelRating) {
	        		if(hotel.getTotalRate()<bestRatedHotel.getTotalRate())
	        			bestRatedHotel = hotel;
	        	}
	        	else 
	        		break;
	        }
		 return bestRatedHotel; 
	}

	public static void main(String[] args) {
		
		HotelReservation hotelReservation =new HotelReservation();
		System.out.println("Welcome to Hotel Reservation Program in HotelReservation class on Master Branch");
        Scanner sc=new Scanner(System.in);
        hotelReservation.addHotel("Lakewood",110,90,3);
        hotelReservation.addHotel("Bridgewood",150,50,4);
        hotelReservation.addHotel("Ridgewood",220,150,5);
        System.out.println("Enter the start date in ddMMMYYYY format");
        String start=sc.next();
        System.out.println("Enter the end date in ddMMMYYYY format");
        String end=sc.next();
        Hotel bestHotel=hotelReservation.bestRatedHotel(start, end);
        System.out.println(bestHotel.getHotelName()+"'s has rating of "+bestHotel.getRating()+" and total rate is "+bestHotel.getTotalRate());
	}

}
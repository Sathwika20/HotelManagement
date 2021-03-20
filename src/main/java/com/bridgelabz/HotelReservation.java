package com.bridgelabz;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class HotelReservation {
     static ArrayList<Hotel> list = new ArrayList<>();

     public ArrayList<Hotel> addHotel(Hotel hotel) {
        list.add(hotel);
        return list;
    }

    public Hotel getCheapestHotel(LocalDate d1, LocalDate d2) {
        long noOfDaysBetween = ChronoUnit.DAYS.between(d1, d2);
        Hotel cheapest = list.stream().min((hotel1, hotel2) -> hotel1.ratesForRegularCustomer> hotel2.ratesForRegularCustomer ? 1: -1).get();
        long cheapRate = cheapest.ratesForRegularCustomer * (noOfDaysBetween + 1);
        System.out.println("Cheapest Hotel: " + cheapest.hotelName +", Total Rates: " + cheapRate);
        return cheapest;

    }

}



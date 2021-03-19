package com.bridgelabz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservation {
    public static ArrayList<Hotel> list = new ArrayList<>();
        Hotel result;

    public ArrayList<Hotel> addHotel(Hotel hotel) {
        list.add(hotel);
        return list;
    }

    public Hotel getCheapestHotel(LocalDate d1 , LocalDate d2 ) {
        long daysBetween = ChronoUnit.DAYS.between(d1, d2);
        Hotel cheapest = Collections.min(list, Comparator.comparing(hotel -> hotel.weekDayRateForNormalCustomer));
        int cheapRate = (int) (ChronoUnit.DAYS.between(d1, d2) * cheapest.weekDayRateForNormalCustomer);
        System.out.println("Cheapest Hotel Name: " + cheapest.name + "\nTotal Rate: " + cheapRate);
        return cheapest;
    }

}

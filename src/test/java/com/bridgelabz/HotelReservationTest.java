package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;


public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

   Hotel LakeWood = new Hotel("LakeWood", 110);
   Hotel BridgeWood = new Hotel("BridgeWood", 160);
   Hotel RidgeWood = new Hotel("RidgeWood",220);


    @Test
    public void AbilityToAddTheHotel() {
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(LakeWood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(BridgeWood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(RidgeWood);

        Assert.assertTrue(hotel3.contains(LakeWood));
        Assert.assertTrue(hotel2.contains(BridgeWood));
        Assert.assertTrue(hotel3.contains(RidgeWood));

    }
    @Test
    public void AbilityToFindTheCheapestHotel() {
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(LakeWood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(BridgeWood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(RidgeWood);

        LocalDate d1 = LocalDate.of(2020, 9, 10);
        LocalDate d2 = LocalDate.of(2020, 9, 11);

        Hotel cheapestHotel = hotelReservation.getCheapestHotel(d1,d2);
        Assert.assertEquals("LakeWood", cheapestHotel.hotelName);

    }

}

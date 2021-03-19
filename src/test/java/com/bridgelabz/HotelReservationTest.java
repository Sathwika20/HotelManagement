package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.ArrayList;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    Hotel LakeWood = new Hotel("LakeWood", 110, 80, 90, 80);
    Hotel BrideWood = new Hotel("BridgeWood", 160, 110, 60, 50);
    Hotel RidgeWood = new Hotel("RidgeWood", 220, 100, 150, 40);


    @Test
    public void AbilityToAddTheHotel() {
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(LakeWood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(BrideWood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(RidgeWood);

        Assert.assertTrue(hotel3.contains(LakeWood));
        Assert.assertTrue(hotel2.contains(BrideWood));
        Assert.assertTrue(hotel3.contains(RidgeWood));
    }
}

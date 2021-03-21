package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

   Hotel LakeWood = new Hotel("LakeWood", 110,80,90, 80,3);
   Hotel BridgeWood = new Hotel("BridgeWood", 160,60,110,50,4);
   Hotel RidgeWood = new Hotel("RidgeWood",220,150,100,40,5);


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

        long rate = hotelReservation.getCheapestHotel(LocalDate.parse("2020-10-10"), LocalDate.parse("2020-10-11"));
        Assert.assertEquals(220, rate);

    }
    @Test
    public void AbilityToFindTheCheapestInGivenDateRange(){
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(LakeWood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(BridgeWood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(RidgeWood);

        LocalDate d1 = LocalDate.parse("2020-09-11");
        LocalDate d2 = LocalDate.parse("2020-09-12");
        int result = hotelReservation.findCheapestHotelInGivenDateRange(d1, d2);
        Assert.assertEquals(200, result);
    }
    @Test
    public void CheapestHotelInGivenDatesByRating() {
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(LakeWood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(BridgeWood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(RidgeWood);

        LocalDate startDate = LocalDate.parse("2020-09-11");
        LocalDate endDate = LocalDate.parse("2020-09-12");
        int result = hotelReservation.findCheapestHotelInGivenDateRange(startDate, endDate);
        Assert.assertEquals(200, result);
        hotelReservation.findByRating();
    }
    @Test
    public void findCheapestBestRatedHotelForRegular() {
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(LakeWood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(BridgeWood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(RidgeWood);

        LocalDate startDate = LocalDate.parse("2020-09-11");
        LocalDate endDate = LocalDate.parse("2020-09-12");
        hotelReservation.findBestRatedHotelForRegular(startDate,endDate);

    }
    @Test
    public void findBestRatedHotelForRegularCustomer() {
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(LakeWood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(BridgeWood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(RidgeWood);

        LocalDate startDate = LocalDate.parse("2020-09-11");
        LocalDate endDate = LocalDate.parse("2020-09-12");
        hotelReservation.findCheapestBestRatedHotelForRegular(startDate, endDate);
    }
    @Test
    public void findCheapestBestRatedHotelForReward() {
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(LakeWood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(BridgeWood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(RidgeWood);
        LocalDate startDate = LocalDate.parse("2020-09-11");
        LocalDate endDate = LocalDate.parse("2020-09-12");

        try {
            hotelReservation.findCheapestBestRatedHotelForReward(startDate,endDate);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Entries");
        }
        catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid Entries");
        }

    }


}

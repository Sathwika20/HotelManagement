package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekDayRatesForRegularCustomer;
    int weekEndRatesForRegularCustomer;
    int rating;
    int rate;



    public Hotel(String hotelName, int weekDayRatesForRegularCustomer, int weekEndRatesForRegularCustomer, int rating) {
        this.hotelName = hotelName;
        this.weekDayRatesForRegularCustomer = weekDayRatesForRegularCustomer;
        this.weekEndRatesForRegularCustomer = weekEndRatesForRegularCustomer;
        this.rate = rating;

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRatesForRegularCustomer=" + weekDayRatesForRegularCustomer +
                ", weekEndRatesForRegularCustomer=" + weekEndRatesForRegularCustomer +
                ", rating=" + rating +
                '}';
    }
}





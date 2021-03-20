package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekDayRatesForRegularCustomer;
    int weekEndRatesForRegularCustomer;
    int rate;



    public Hotel(String hotelName, int weekDayRatesForRegularCustomer, int weekEndRatesForRegularCustomer) {
        this.hotelName = hotelName;
        this.weekDayRatesForRegularCustomer = weekDayRatesForRegularCustomer;
        this.weekEndRatesForRegularCustomer = weekEndRatesForRegularCustomer;

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRatesForRegularCustomer=" + weekDayRatesForRegularCustomer +
                ", weekEndRatesForRegularCustomer=" + weekEndRatesForRegularCustomer +
                '}';
    }
}





package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekDayRatesForRegularCustomer;
    int weekEndRatesForRegularCustomer;
    int weekDayRatesForRewardCustomer;
    int weekEndRatesForRewardCustomer;
    int rating;
    int rate;



    public Hotel(String hotelName, int weekDayRatesForRegularCustomer, int weekEndRatesForRegularCustomer, int weekDayRatesForRewardCustomer, int weekEndRatesForRewardCustomer, int rating) {
        this.hotelName = hotelName;
        this.weekDayRatesForRegularCustomer = weekDayRatesForRegularCustomer;
        this.weekEndRatesForRegularCustomer = weekEndRatesForRegularCustomer;
        this.weekDayRatesForRewardCustomer = weekDayRatesForRewardCustomer;
        this.weekEndRatesForRewardCustomer = weekEndRatesForRewardCustomer;
        this.rate = rating;


    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRatesForRegularCustomer=" + weekDayRatesForRegularCustomer +
                ", weekEndRatesForRegularCustomer=" + weekEndRatesForRegularCustomer +
                ", weekDayRatesForRewardCustomer=" + weekDayRatesForRewardCustomer +
                ", weekEndRatesForRewardCustomer=" + weekEndRatesForRewardCustomer +
                ", rating=" + rating +
                ", rate=" + rate +
                '}';
    }
}





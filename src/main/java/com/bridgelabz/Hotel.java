package com.bridgelabz;

public class Hotel {
    String hotelName;
    int ratesForRegularCustomer;



    public Hotel(String hotelName, int ratesForRegularCustomer) {
        this.hotelName = hotelName;
        this.ratesForRegularCustomer = ratesForRegularCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", ratesForRegularCustomer=" + ratesForRegularCustomer +
                '}';
    }
}





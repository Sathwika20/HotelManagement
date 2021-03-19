package com.bridgelabz;

public class Hotel {
    public String name;
    public int weekDayRateForNormalCustomer;
    public int weekDayRateForRewardCustomer;
    public int weekEndRateForNormalCustomer;
    public int weekEndRateForRewardCustomer;


    public Hotel(String name, int weekDayRateForNormalCustomer, int weekDayRateForRewardCustomer, int weekEndRateForNormalCustomer,int weekEndRateForRewardCustomer) {

        this.name = name;
        this.weekDayRateForNormalCustomer = weekDayRateForNormalCustomer;
        this.weekDayRateForRewardCustomer = weekEndRateForRewardCustomer;
        this.weekEndRateForNormalCustomer = weekEndRateForNormalCustomer;
        this.weekDayRateForRewardCustomer = weekEndRateForRewardCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", weekDayRateForNormalCustomer=" + weekDayRateForNormalCustomer +
                ", weekDayRateForRewardCustomer=" + weekDayRateForRewardCustomer +
                ", weekEndRateForNormalCustomer=" + weekEndRateForNormalCustomer +
                ", weekEndRateForRewardCustomer=" + weekEndRateForRewardCustomer +
                '}';
    }




}


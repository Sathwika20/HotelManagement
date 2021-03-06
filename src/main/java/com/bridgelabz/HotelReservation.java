package com.bridgelabz;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HotelReservation {
     static ArrayList<Hotel> list = new ArrayList<>();
    Map<String,Integer> allMinimumHotels = new HashMap<>();
    Map<String, Double> allCheapRateHotelsRating = new HashMap<>();

    public ArrayList<Hotel> addHotel(Hotel hotel) {
        list.add(hotel);
        return list;
    }

    public long getCheapestHotel(LocalDate d1, LocalDate d2) {
        long noOfDaysBetween = ChronoUnit.DAYS.between(d1, d2);
        Hotel cheapHotel = list.stream().min((hotel1, hotel2) -> hotel1.weekDayRatesForRegularCustomer > hotel2.weekDayRatesForRegularCustomer ? 1: -1).get();
        long cheapRate = cheapHotel.weekDayRatesForRegularCustomer * (noOfDaysBetween + 1);
        System.out.println("Cheapest Hotel: " + cheapHotel.hotelName +", Total Rates: " + cheapRate);
        return cheapRate;
    }
    public int findCheapestHotelInGivenDateRange(LocalDate d1, LocalDate d2) {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(1);

        long numOfDays = ChronoUnit.DAYS.between(startDate, endDate);

        List<LocalDate> listOfDates = Stream.iterate(startDate, date -> date.plusDays(1))
                .limit(numOfDays)
                .collect(Collectors.toList());

        System.out.println(listOfDates.size());

        Iterator itr = listOfDates.iterator();
        while (itr.hasNext()) {

            DayOfWeek dayOfWeek2 = DayOfWeek.from((TemporalAccessor) itr.next());
            if (dayOfWeek2.equals(DayOfWeek.SATURDAY) || dayOfWeek2.equals(DayOfWeek.SUNDAY)) {
                for (Hotel hotel : list) {
                    hotel.rate = +hotel.weekEndRatesForRegularCustomer;
                }
            } else {
                for (Hotel hotel : list) {
                    hotel.rate = +hotel.weekDayRatesForRegularCustomer;
                }
            }
        }
        for (Hotel hotel : list) {
            System.out.println(hotel.hotelName + " " + hotel.rate);
        }
        Hotel result1 = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (result1.rate > list.get(i).rate) {
                result1 = list.get(i);
                allMinimumHotels.put(list.get(i).hotelName, list.get(i).rate);
            }
        }
        allMinimumHotels.put(result1.hotelName, result1.rate);
        for (Hotel hotel : list) {
            if (hotel.rate == result1.rate) {
                allMinimumHotels.put(hotel.hotelName, hotel.rate);
            }
        }
        for(Hotel hotel : list) {
            System.out.println("Hotel Name: " + hotel.hotelName + ", Rate: " + hotel.rate);

        }
        return result1.rate;

    }
    public void findByRating() {
        Double maxValueInMap = (Collections.max(allCheapRateHotelsRating.values()));
        for (Map.Entry<String, Double> entry : allCheapRateHotelsRating.entrySet()) {
            if(entry.getValue().equals(maxValueInMap)){
                Hotel result1 = list.get(0);
                System.out.println(entry.getKey() + ", Rating: " + entry.getValue() + " And Total Rates: " + result1.rate );
            }
        }
    }
    public int cheapestHotelForRewardCustomer(LocalDate d1, LocalDate d2){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusDays(1);

        long numOfDays = ChronoUnit.DAYS.between(d1, d2);

        List<LocalDate> listOfDates = Stream.iterate(d1, date -> date.plusDays(1))
                .limit(numOfDays)
                .collect(Collectors.toList());

        System.out.println(listOfDates.size());

        Iterator itr = listOfDates.iterator();
        while (itr.hasNext()) {

            DayOfWeek dayOfWeek2 = DayOfWeek.from((TemporalAccessor) itr.next());
            if (dayOfWeek2.equals(DayOfWeek.SATURDAY) || dayOfWeek2.equals(DayOfWeek.SUNDAY)) {
                for (Hotel hotel : list) {
                    hotel.rate = +hotel.weekEndRatesForRewardCustomer;
                }
            } else {
                for (Hotel hotel : list) {
                    hotel.rate = +hotel.weekDayRatesForRewardCustomer;
                }
            }
        }
        for (Hotel hotel : list) {
            System.out.println(hotel.hotelName + " " + hotel.rate);
        }
        Hotel result2 = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (result2.rate > list.get(i).rate) {
                result2 = list.get(i);
                allMinimumHotels.put(list.get(i).hotelName, list.get(i).rate);
            }
        }
        allMinimumHotels.put(result2.hotelName, result2.rate);
        for (Hotel hotel : list) {
            if (hotel.rate == result2.rate) {
                allMinimumHotels.put(hotel.hotelName, hotel.rate);
            }
        }
        for(Hotel hotel : list) {
            System.out.println("Hotel Name: " + hotel.hotelName + ", Rate: " + hotel.rate);

        }
        return result2.rate;

    }
    public Map<String, Double> findCheapestBestRatedHotelForReward(LocalDate d1, LocalDate d2) {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(1);
        long numOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        Map<String, Double> rewardedCustomerHotelsRating = new HashMap<>();
        Double maxValueInMap = (Collections.max(rewardedCustomerHotelsRating.values()));
        System.out.println("\nThe Cheapest Best Rated Hotel is ::");
        System.out.println("\nThe Cheapest Best Rated Hotel is ::");
        Hotel result2 = list.get(0);
        rewardedCustomerHotelsRating.entrySet().stream().filter(t -> t.getValue().equals(maxValueInMap))
                .forEach(t -> System.out.println(t.getKey() + ", Rating: " + t.getValue() + " And Total Rates: " + result2.totalRewardedRate +"\n"));
        return rewardedCustomerHotelsRating;
    }
        public Hotel findBestRatedHotelForRegular(LocalDate startDate, LocalDate endDate) {
        findCheapestHotelInGivenDateRange(startDate, endDate);
        Hotel bestRated = Collections.max(list, Comparator.comparing(hotel -> hotel.rating));
        System.out.println("Best Rated");
        System.out.println("Hotel Name: " + bestRated.hotelName + ", Total Rate: " + bestRated.rate + "\n");
        return bestRated;
    }
    public void findCheapestBestRatedHotelForRegular(LocalDate startDate, LocalDate endDate) {
        HashMap<String, Double> regularRateHotelsRating = new HashMap<>();
        Double maxValueInMap = (Collections.max(regularRateHotelsRating.values()));
        System.out.println("The Cheapest Best Rated Hotel is ::");
        Hotel result1 = list.get(0);
        regularRateHotelsRating.entrySet().stream().filter(t -> t.getValue().equals(maxValueInMap))
                .forEach(t -> System.out.println(t.getKey() + ", Rating: " + t.getValue() + " And Total Rates: " + result1.totalRegularRate +"\n"));
    }




}



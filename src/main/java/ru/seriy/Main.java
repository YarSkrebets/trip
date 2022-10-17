package ru.seriy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car() {
        };
        Road[] road;
        Person person = new Person();

        Trip trip = new Trip();
        TripStatus tripStatus = trip.continueTrip(car, person);
        System.out.println(tripStatus);

        System.out.println("Hello world!");
    }
}
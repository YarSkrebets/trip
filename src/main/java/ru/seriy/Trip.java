package ru.seriy;

import ru.seriy.utils.OlegRandom;

public class Trip {
    private Road[] roads;

    //constructor

    public TripStatus continueTrip(Car car, Person person) {
        if (OlegRandom.babkaSbita()) {
            return TripStatus.SBIL_BABKU;
        }

        return null;
    }
}

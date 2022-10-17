package ru.seriy.utils;

import java.util.concurrent.ThreadLocalRandom;

public class OlegRandom {
    public static boolean babkaSbita() {
        return ThreadLocalRandom.current().nextBoolean();
    }
}

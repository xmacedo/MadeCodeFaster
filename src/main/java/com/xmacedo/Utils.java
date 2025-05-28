package com.xmacedo;

import java.util.concurrent.TimeUnit;

public class Utils {

    public static void printResults(String typeProcess, int count, long duration) {
        long hours = TimeUnit.MILLISECONDS.toHours(duration);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(duration) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(duration) % 60;
        long milliseconds = duration % 1000;

        System.out.println("'" + typeProcess + "' to find [" + count +
                "]took the duration of: " + String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds));
    }
}

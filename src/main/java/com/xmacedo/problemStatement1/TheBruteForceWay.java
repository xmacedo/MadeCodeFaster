package com.xmacedo.problemStatement1;

import com.xmacedo.Utils;
import java.util.ArrayList;

public class TheBruteForceWay {

    //As a beginner, my first instinct was to use a nested loop.
    // We check every possible pair of elements and see if their sum equals the target.
    public TheBruteForceWay(ArrayList<String> arr, String target) {
        System.out.printf("Problem 1: The Brute Force way!");
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target) {
                    count++;
                }
            }
        }
        //# Pros:
        // - Very easy to understand.
        // - Covers all valid pairs.

        //# Cons:
        // - Time complexity = O(n²)
        // - Terribly slow for large inputs.
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        Utils.printResults("The Brute Force way", duration);
        System.out.printf("END Problem 1!");
    }
    //# Performance testing
    //Let’s say the array has 10,000 elements.
    //With nested loops, that’s nearly 50 million comparisons.

    //That’s why this approach was taking over 7000 milliseconds (7 seconds) on big inputs.

    //Even though it gives the correct answer, it’s far from efficient.

    //And in coding interviews or real production code, efficiency is everything.
}
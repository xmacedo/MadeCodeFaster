package com.xmacedo.problemStatement1;

import com.xmacedo.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TheSmarterApproach {

    public static Integer countPairs(ArrayList<Integer> arr, int target) {
        System.out.println("Problem 1: The Smarter approach!");
        long startTime = System.currentTimeMillis();
        //Suppose the current number is num.

        //We want to find if there's any previous number such that:
        //num + prevNum == target

        //Which means:
        //prevNum = target - num

        //We use a HashMap to store frequencies of numbers we’ve seen so far.
        //For every number in the array, we:

        //Check if target - num exists in the map.
        //If it does, we add the frequency to the count.
        //Then, we update the current number’s frequency in the map.

        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {

            int complement = target - num;

            // If complement is already in the map, we found some pairs
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }

            // Update frequency of current number
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        //Why this works:
        //We’re looping through the array only once.

        //At every step, we check if we’ve already seen the number we need to form a valid pair.

        //Time Complexity: O(n)
        //Space Complexity: O(n)
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        Utils.printResults("The Smarter Approach ", count, duration);
        System.out.println("END Problem 1!");

        return count;
    }
    //# Performance testing

    //I used the same array of 10,000 elements and ran both versions.

    //Brute force: 7000ms+
    //HashMap version: ~90ms

    //That’s more than 75 times faster.

    //And we didn’t do anything “advanced” — just used the right data structure and rethought the logic.
}

# How we can made code more faster?


### The Problem Statement 1
- Given an array of integers, count how many pairs (i, j) exist such that i < j and arr[i] + arr[j] == target.

#### You are given:

- An integer array arr
- A target value T

#### You need to count the number of pairs (i, j) such that:

- i < j
- arr[i] + arr[j] == T

### Performance testing
I used the same array of 10,000 elements and ran both versions.

- [Brute force](src/main/java/com/xmacedo/problemStatement1/TheBruteForceWay.java): 7000ms+ 
- [HashMap version](src/main/java/com/xmacedo/problemStatement1/TheSmarterApproach.java): ~90ms

That’s more than 75 times faster.

And we didn’t do anything “advanced” — just used the right data structure and rethought the logic.

### Results
 - 100.000
   - Brute force: 10 s ~
   - Smater approach: 0.2 s ~
 - 1.000.000
 - Brute force:
   - 'The Brute Force way' to find [655558585]took the duration of: 00:19:09.408
   - Total of pairs found: 655558585
 - Smater approach: 0.2 s ~
   - 'The Smarter Approach ' to find [655558585]took the duration of: 00:00:00.086 
   - Total of pairs found: 655558585

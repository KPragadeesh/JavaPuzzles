package org.arrays;

import java.util.*;

public class FrequenciesOfLimitedRangeArray {
    public static void main(String[] args) {
        int num[] = {3,3,3,3};
        int n = 4;
        frequenciesOfLimitedRange(num,n);
    }

    public static void frequenciesOfLimitedRange(int[] num, int n) {
       Map<Integer, Integer> frequenciesOfLimited = new HashMap<>();
       List<Integer> frequenciesArray = new ArrayList<>();
       for(int i =0;i<n;i++){
           frequenciesOfLimited.put(num[i], frequenciesOfLimited.containsKey(num[i])?frequenciesOfLimited.get(num[i])+1:1);
       }
       for (int i = 1; i <= n; i++) {
            frequenciesArray.add(frequenciesOfLimited.getOrDefault(i, 0));
        }
        System.out.println(frequenciesArray);
    }
}

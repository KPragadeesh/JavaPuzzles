package org.arrays;

import java.util.ArrayList;
import java.util.List;

public class CountPairsGiven {
    public static void main(String[] args) {
        int num[] = {1, 1, 1, 1};
        int k = 2;
        System.out.println(countOfPairSums(num, k));
    }

    private static int countOfPairSums(int[] num, int k) {
        List<Integer> numbers = new ArrayList<>();
        int count =0;
        for(int n: num){
            if(numbers.contains(k-n)){
                count++;
            }
            numbers.add(n);
        }
        return count;
    }
}

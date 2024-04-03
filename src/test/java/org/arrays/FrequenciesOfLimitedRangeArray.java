package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequenciesOfLimitedRangeArray {
    public static void main(String[] args) {
        int num[] = {1,2, 3, 2, 3, 5};
        int n = 5;
        int p = 5;
        frequenciesOfLimitedRange(num,n, p);
    }

    public static void frequenciesOfLimitedRange(int[] num, int n, int p) {
        List<Integer> frequenciesArray = new ArrayList<>();
        int number =1;
        int count=0;
        for(int i=0;i<n;i++){
            if(num[i]==number){
                count++;
            }
        }
    }
}

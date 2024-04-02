package org.arrays;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestDistinctElement {
    public static void main(String[] args) {
        int num[] = {10, 5, 10};
        System.out.println(secondLargestDistinctNumber(num));
    }

    private static int secondLargestDistinctNumber(int[] num) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        List<Integer> distinctList = new ArrayList<>();
        for(int number:num){
            if(!distinctList.contains(number)){
                distinctList.add(number);
            }
            if(number>max){
                max = number;
            }
        }

        for(int value : distinctList){
            if(value>secondLargest && value != max){
                secondLargest = value;
            }
        }
        if(distinctList.size()<2){
            return -1;
        }
        return secondLargest;
    }
}

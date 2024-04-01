package org.arrays;

//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

//Input:
//N = 5
//A[] = {1,2,3,5}
//Output: 4

//Input:
//N = 10
//A[] = {6,1,2,8,3,4,7,10,5}
//Output: 9

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        missingNumberWithN();
        missingNumberWithoutN();

    }

    //since it is n and n-1 in array. There is only 1 number is missing. we can easily solve this usinf below logic
    public static void missingNumberWithN(){
        int num[] = {6,1,2,8,3,4,7,10,5};
        int n = 10;
        int initialSum = 0;
        for(int i =0;i<num.length;i++){
            initialSum += num[i];
        }
        int actualSum = n*(n+1)/2;
        System.out.println(actualSum-initialSum);
    }

    public static void missingNumberWithoutN(){
        int[] num = {1,2,3,4,5,6,8};
        int initialSum = 0;
        int finalSum=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < num.length;i++){
            initialSum += num[i];
            min = Math.min(min, num[i]);
            max = Math.max(max, num[i]);
        }
        for(int i =min;i<=max;i++){
            finalSum += i;
        }
        System.out.println(finalSum - initialSum);
    }
}

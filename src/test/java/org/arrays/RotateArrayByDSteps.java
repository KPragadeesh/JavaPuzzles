package org.arrays;

import java.util.ArrayList;
import java.util.List;

//Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer.

//Example 1:
//Input:
//N = 5, D = 2
//arr[] = {1,2,3,4,5}
//Output: 3 4 5 1 2
//Explanation: 1 2 3 4 5  when rotated
//by 2 elements, it becomes 3 4 5 1 2.

//Example 2:
//Input:
//N = 10, D = 3
//arr[] = {2,4,6,8,10,12,14,16,18,20}
//Output: 8 10 12 14 16 18 20 2 4 6
//Explanation: 2 4 6 8 10 12 14 16 18 20
//when rotated by 3 elements, it becomes
//8 10 12 14 16 18 20 2 4 6.


//the rotateArrayByDSteps method has a time complexity of O(n) and a space complexity of O(n),

public class RotateArrayByDSteps {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16,18,20};
        int n = 10;
        int d = 3;
        List<Integer> rotateArray = rotateArrayByDSteps(num, n, d);
        System.out.println(rotateArray);
    }
    private static List<Integer> rotateArrayByDSteps(int[] num, int n, int d) {
        List<Integer> rotatedArray = new ArrayList<>();
        for(int i = d;i<n;i++){
            rotatedArray.add(num[i]);
        }
        for(int i =0 ;i<d;i++){
            rotatedArray.add(num[i]);
        }
        return rotatedArray;
    }
}

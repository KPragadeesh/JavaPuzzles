package org.arrays;

//Given an array A of positive integers. Your task is to find the leaders in the array.
// An element of array is a leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

public class LeaderInArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,0};
        leaderInArray(num);
    }

    private static void leaderInArray(int[] num) {
        int n = num.length-1;
        int maxFromRight = num[n];
        System.out.println(num[n] + " is the leader in the array ");
        for(int i = n-1;i>=0;i--){
            if(num[i]>maxFromRight){
                maxFromRight = num[i];
                System.out.println(num[i] + " is the Leader in the array");
            }
        }
    }
//approach ensures that each element is visited only once, resulting in linear time complexity O(n),
// where n is the number of elements in the array. The space complexity remains O(1) as we only use a constant amount of extra space.

}

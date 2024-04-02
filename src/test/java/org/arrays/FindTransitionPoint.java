package org.arrays;

import java.util.Arrays;
import java.util.List;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int num[] = {0,0,0,0};
        int n =4;
        int transitionNumber = transitionPoint(num, n);
        System.out.println(transitionNumber);
    }

    private static int transitionPoint(int[] num, int n) {
        for(int i =0;i<n;i++){
            if(num[i] == 1){
                return i;
            }
        }
        return -1;
    }
}

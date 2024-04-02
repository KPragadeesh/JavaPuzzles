package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyPair {
    public static void main(String[] args) {
        int num[] =  {1, 2, 4, 3, 6};
        int n =5;
        int x = 10;
        System.out.println(keyPairCheck(num, n, x));
    }

    private static String keyPairCheck(int[] num, int n, int x) {
        List<Integer> numArray = new ArrayList<>();
        int count = 0;
        for(int i =0;i<n;i++){
            if(numArray.contains(x-num[i])){
                count++;
            }
            numArray.add(num[i]);
        }
        if(count!=0){
            return "Yes";
        }
        return "No";
    }
}

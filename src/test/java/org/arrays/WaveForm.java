package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaveForm {
    public static void main(String[] args) {
        int num[] =  {5, 1, 3, 2, 4};
        System.out.println(waveForm(num));
    }

    public static List<Integer> waveForm(int[] num) {
        Arrays.sort(num);
        List<Integer> waveArray = new ArrayList<>();
        int count =0;
        if(num.length <=1){
            return waveArray;
        }
        for(int i=0;i<num.length-1;i+=2){
//            if((i+1+count) < num.length && (i+count) < num.length) {
//                waveArray.add(num[i + 1 + count]);
//                waveArray.add(num[i + count]);
//                count++;
//            }
             int temp = num[i];
             num[i]= num[i+1];
             num[i+1] = temp;
        }
        for(int n : num){
            waveArray.add(n);
        }
       return waveArray;
    }
}

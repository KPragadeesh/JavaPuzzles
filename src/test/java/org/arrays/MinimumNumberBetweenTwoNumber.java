package org.arrays;

public class MinimumNumberBetweenTwoNumber {
    public static void main(String[] args) {
        int num[] = {1,2,3,2};
        int x =1;
        int y =2;
        minimumIndexBetweenTwoNumbers(num, x,y);
    }

    static int minimumIndexBetweenTwoNumbers(int[] num, int x, int y){
        if(num.length <= 0 ){
            return -1;
        }
        int indexOfX = 0;
        int indexOfY = 0;
        for(int i=0;i<num.length;i++){
            if(num[i] == x){
                indexOfX = i;
            }
        }
    }
}

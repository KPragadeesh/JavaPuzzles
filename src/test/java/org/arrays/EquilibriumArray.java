package org.arrays;

public class EquilibriumArray {
    public static void main(String[] args) {
        int num[] = {1,3,5,2,2};
        int n = num.length;
        int index =equlibriumPosition(num,n);
        System.out.println(num[index]);
    }

    private static int equlibriumPosition(int[] num, int n) {
        int rsum = 0;
        int lsum =0;

        for(int i =0;i<n; i++){
            rsum += num[i];
        }
        for(int j =0;j<n;j++){
            rsum -= num[j];
            if(lsum == rsum){
                return j;
            }
            lsum += num[j];
        }
        return -1;
    }
}

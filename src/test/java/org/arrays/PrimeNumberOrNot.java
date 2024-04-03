package org.arrays;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        System.out.println(primeOrNot(17));
    }

    public static String primeOrNot(int n) {
        if(n<=1){
            return "neither prime nor composite";
        }
        int i = 2;
        while(i*i <=n){
            if(n % i == 0){
                return "not prime";
            }
            i++;
        }
        return "prime";
    }
}

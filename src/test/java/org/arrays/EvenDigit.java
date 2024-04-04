package org.arrays;


//how many objects in array of even number length of digits

public class EvenDigit {
    public static void main(String[] args) {
        int num[] = {18,124,9,1764,98,1};
        System.out.println(findNumbers(num));
        System.out.println(findingDigitsUsingDigitsFn(num));
    }


    //using string
    static int findNumbers(int num[]){
        int count =0;
        for(int n:num) {
            if (String.valueOf(n).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //creating digits function for finding length and using it.
    static int findingDigitsUsingDigitsFn(int num[]){
        int count =0;
        for(int n: num) {
            int length = digits(n);
            if (length % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int digits(int num){
        int count =0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }

}

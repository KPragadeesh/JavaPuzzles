package org.example;

public class PalindromeNumber {
    static int reverse;
    static int num =121;
    public static void main(String[] args) {
        System.out.println(isPalindrome(num));
        System.out.println(isPalindrome_2(num));
        System.out.println(isPalindrome_1(num));
    }

    //time Complexity 0(d)
    public static String isPalindrome(int n){
        while (n > 0){
            int i = n % 10;
            reverse = (reverse * 10) + i;
            n = n / 10;
        }
        if(num == reverse){
            return  "It is a palindrome";
        }
        return  "It is not a palindrome";
    }

    //time complexity O(d/2)
    //half way compare
    public static boolean isPalindrome_1(int n){
        int reversedHalf = 0;
        while (n >reversedHalf){
            int i = num % 10;
            reversedHalf = (reversedHalf*10) + i;
            n = n/10;
        }
        return n == reversedHalf || n == reversedHalf/10;
    }

    //time complexity O(d/2)
    public static boolean isPalindrome_2(int n){
        String num = String.valueOf(n);
        int left =0;
        int right = num.length() -1 ;
        while(left < right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
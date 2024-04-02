package org.arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] names = {"geek", "geeks", "geeksforgeeks", "geezer"};
        int n = 4;
        longestCommonPrefix(names, n);
    }

    private static void longestCommonPrefix(String[] names, int n) {
        String prefix = names[0];
        for (int i =1;i<n;i++){
            int j =0;
           String currentString = names[i];
           while (j<prefix.length() && j< currentString.length() && prefix.charAt(j) == currentString.charAt(j)){
               j++;
           }
           prefix = prefix.substring(0,j);
       }
        System.out.println(prefix);
    }
}

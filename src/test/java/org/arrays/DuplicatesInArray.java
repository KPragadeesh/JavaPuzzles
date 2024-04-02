package org.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
//Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1].

//Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.
//Input:
//N = 4
//a[] = {0,3,1,2}
//Output:
//-1
//Explanation:
//There is no repeating element in the array. Therefore output is -1.
//Example 2:

//Input:
//N = 5
//a[] = {2,3,1,2,3}
//Output:
//2 3
//Explanation:
//2 and 3 occur more than once in the given array.


//the time complexity of the method is O(n) (assuming average-case constant-time lookup in ArrayList), and the space complexity is O(n)

public class DuplicatesInArray {
    public static void main(String[] args) {
        int num[] = {2,3,1,2,3};
        List<Integer> duplicates = duplicatesInArray(num);
        if(duplicates.isEmpty()){
            System.out.println("-1");;
        }else {
            duplicates.stream().forEach(System.out::println);
        }
    }

    private static List<Integer> duplicatesInArray(int num[]) {
        List<Integer> numArrayList = new ArrayList<>();
        List<Integer> duplicateNumbers = new ArrayList<>();
        for(int n : num){
            if(!numArrayList.contains(n)){
                numArrayList.add(n);
            }else{
                duplicateNumbers.add(n);
            }
        }
        return duplicateNumbers;
    }
}

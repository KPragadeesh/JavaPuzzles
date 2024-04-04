package org.arrays;


/*Given an array arr[] of size n, find the first repeating element.
        The element should occur more than once and the index of its first occurrence should be the smallest*/

//the space complexity is O(n), and the time complexity is O(n) for the given firstRepeatingElementAndIndex method.


import java.util.ArrayList;
import java.util.List;
public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        System.out.println(firstRepeatingElementAndIndex(num));
    }

    static int firstRepeatingElementAndIndex(int[] num) {
        if(num.length <= 0){
            return -1;
        }

        List<Integer> repeatingArray = new ArrayList<>();
        List<Integer> repeatingNumberIndex = new ArrayList<>();
        for(int x: num){
            if(!repeatingArray.contains(x)){
                repeatingArray.add(x);
            }else {
                repeatingNumberIndex.add(repeatingArray.indexOf(x) + 1);
            }
        }
        if(repeatingNumberIndex.isEmpty()){
            return -1;
        }
        return repeatingNumberIndex.stream().sorted().findFirst().get();
    }
}

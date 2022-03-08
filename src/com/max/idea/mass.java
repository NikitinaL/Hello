package com.max.idea;

import java.util.Arrays;

public class mass {
    public static void main(String[] args){
        int [] myArraw = new int[5];
        int [] nums ={9, 8, 7, 6, 5};
        int last= nums [nums.length-1];
        System.out.println(last);
        System.out.println(nums[0]);
        int sum = Arrays.stream(myArraw).sum();
        System.out.println(sum);
    }
}

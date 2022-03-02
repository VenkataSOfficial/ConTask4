package com.moshpackage;

import java.util.Arrays;

public class Q7 {
//                                          difference between the largest and smallest values in an array of integers.
    public static void main(String[] args) {

        int[] array_nums = {5, 7, 2, 4, 9};
        int max_num = array_nums[0];
        int min_num = array_nums[0];
        for(int i = 1; i < array_nums.length; i++)
        {
            if(array_nums[i] > max_num)
                max_num = array_nums[i];
            else if(array_nums[i] < min_num)
                min_num = array_nums[i];
        }
        System.out.println("Max - Min = "+(max_num-min_num));
    }

    }


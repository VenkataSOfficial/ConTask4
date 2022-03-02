package com.moshpackage;

import java.util.Arrays;

public class Q11 {
    public static void main(String args[]){

                                                                      // sort array => max / min / max / min...
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
        int len = arr.length;

        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        int small = 0, large = len - 1;

        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];

            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));

    }
}

package com.moshpackage;

public class Q10 {
    public static void main(String[] args) {
                                // the sum of the two elements of a given array which is equal to 0.
        int[] arr = { 4, 2, 1, 6, -4 };
        int sum = 12;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == 0)
                {
                    System.out.println(arr[i] +"  "+ arr[j] + " = 0");

                }
    }

}

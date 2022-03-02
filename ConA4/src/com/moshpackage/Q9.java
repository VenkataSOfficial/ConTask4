package com.moshpackage;

public class Q9 {
    public static void main(String[] args) {

                            // the sum of the two elements of a given array which is equal to a given integer.
        int[] arr = { 4, 2, 1, 6, 8 };
        int sum = 12;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                {
                    System.out.println("Pairs are "+ arr[i] +" and "+ arr[j]);
                }
    }

}



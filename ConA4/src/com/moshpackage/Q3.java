package com.moshpackage;

public class Q3 {
    public static void main(String[] args) {

                                                                // Second largest element in Array
        int arr[]={1,2,4,2,3,9};
        int temp;
        int length = 5;
        for (int i = 0; i < length; i++)
        {
            for (int j = i + 1; j < length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);

    }
}

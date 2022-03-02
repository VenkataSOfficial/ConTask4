package com.moshpackage;

public class Q8 {
    public static void main(String[] args) {

                                            // Remove Duplicate elements from an array and return length of new array

        int arr[] = {1,2,2,3, 4, 6, 6, 7,5};
        int length = arr.length;
        int n = length;
        int[] arr2 = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                arr2[j++] = arr[i];
            }
        }
        arr2[j++] = arr[n-1];
        for (int i=0; i<j; i++){
            arr[i] = arr2[i];

        }

        for (int i=0; i<j; i++) {
            System.out.print(arr[i] + " ");
        }

        int len = arr.length;
        System.out.println("New array length = " + (len-2));

    }
}

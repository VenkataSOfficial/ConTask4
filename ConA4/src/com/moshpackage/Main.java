package com.moshpackage;

public class Main {

    public static void main(String[] args) {

	                                    // Remove Repetative elements from an array

        int arr[] = {1,2,2,3, 4, 6, 6, 7};
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

        for (int i=0; i<j; i++)
            System.out.print(arr[i]+" ");

    }
}

package com.moshpackage;

public class Q5 {

    public static void main(String[] args) {
//                                                              move all 0's to the end of an array.
        int arr[] = {7,0,2,6,0,4,0,2};
        int len = arr.length;
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while(count < len) {
            arr[count++] = 0;
        }

        for(int j = 0; j < len; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}

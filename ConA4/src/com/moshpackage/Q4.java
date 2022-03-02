package com.moshpackage;

public class Q4 {
    public static void main(String[] args) {

//                                      Write a Java program to add two matrices of the same size.
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{9,8,7},{6,5,4},{3,2,1}};
        int arr3[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("");
        }

    }
}

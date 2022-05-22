package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] arr_2 = {1,3,5,7};
        int[] arr_3 = new int[3];
        int[] arr_zeros = new int[10];
        arr_3[0] = 2314;
        arr_3[1] = 3259;
        arr_3[2] = 1243;

        for(int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        System.out.println("*_*");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("*_*");
        for(int i = 0; i < arr_2.length; i++){
            System.out.println(arr_2[i]);
        }
        System.out.println("*_*");
        for(int i = 0; i < arr_3.length; i++){
            System.out.println(arr_3[i]);
        }
        System.out.println("*_*");
        for(int i = 0; i < arr_zeros.length; i++){
            System.out.println(arr_zeros[i]);
        }
    }
}

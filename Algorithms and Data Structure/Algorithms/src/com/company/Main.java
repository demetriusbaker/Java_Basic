package com.company;

import java.util.Arrays;

public class Main {
    private static int[] createArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 100) + 1;
        return arr;
    }

    private static boolean isSorted(int[] array){
        for (int i = 0; i < array.length - 1; i++)
            if (array[i] > array[i + 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(15 & 42); // 10
        System.out.println(15 | 42); // 47
        System.out.println(15 ^ 42); // 37
        System.out.println(~42); // -43
        System.out.println(~(-42)); // 41
        System.out.println(~(~42)); // 42
        System.out.println();

        int[] arr = createArray(21);
        System.out.print("Common: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Bubble: ");
        Sorting.toBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
        System.out.println();

        arr = createArray(21);
        System.out.print("Common: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Shake: ");
        Sorting.toShakeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
        System.out.println();

        arr = createArray(21);
        System.out.print("Common: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Comb: ");
        Sorting.toCombSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
        System.out.println();

        arr = createArray(23);
        System.out.print("Common: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Selection: ");
        Sorting.toSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
        System.out.println();

        arr = createArray(23);
        System.out.print("Common: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Double Selection: ");
        Sorting.toDoubleSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
        System.out.println();

        arr = createArray(23);
        System.out.print("Common: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Insert: ");
        Sorting.toInsertSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
        System.out.println();

        arr = createArray(23);
        System.out.print("Common: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Shuttle: ");
        Sorting.toShuttleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
        System.out.println();
    }
}
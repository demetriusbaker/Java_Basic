package com.company;

public class Sorting {
    private static void swap(int[] arr, int index1, int index2){
        int buf = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = buf;
    }

    public static void toBubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
    }

    public static void toShakeSort(int[] array){
        int left = 0, right = array.length - 1;

        while (left <= right){
            for (int i = right; i > left; --i)
                if (array[i - 1] > array[i])
                    swap(array, i - 1, i);
            left++;

            for (int i = left; i < right; ++i)
                if (array[i] > array[i + 1])
                    swap(array, i, i + 1);
            right--;
        }
    }

    public static void toCombSort(int[] array){
        final float factorDecrease = 1.247f;
        float step = array.length - 1;

        while (step >= 1){
            for (int i = 0; i + step < array.length; i++)
                if (array[i] > array[i + (int)step])
                    swap(array, i, i + (int)step);

            step /= factorDecrease;
        }

        toBubbleSort(array);
    }

    public static void toSelectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i], minIndex = i;

            for (int j = i + 1; j < array.length; j++)
                if (min > array[j]){
                    min = array[j];
                    minIndex = j;
                }

            if (i != minIndex)
                swap(array, i, minIndex);
        }
    }

    public static void toDoubleSelectionSort(int[] array){
        int size = array.length;
        for (int i = 0; i <= size--; i++) {
            int min = array[i], max = array[i], minI = i, maxI = i;

            for (int j = i + 1; j <= size; j++){
                if (min > array[j]){
                    min = array[j];
                    minI = j;
                }
                if (max < array[j]){
                    max = array[j];
                    maxI = j;
                }
            }

            if (maxI == i && minI != size){
                swap(array, size, maxI);
                swap(array, i, minI);
            }
            if (maxI != i && minI == size){
                swap(array, i, minI);
                swap(array, size, maxI);
            }
            if (maxI != i && minI != size){
                swap(array, size, maxI);
                swap(array, i, minI);
            }
            if (minI == size && maxI == i)
                swap(array, size, i);
        }
    }

    public static void toInsertSort(int[] array){
        for (int left = 0; left < array.length; left++){
            int value = array[left], i = left - 1;

            while (i >= 0){
                if (value < array[i])
                    array[i + 1] = array[i];
                else
                    break;

                i--;
            }

            array[i + 1] = value;
        }
    }

    public static void toShuttleSort(int[] array){
        for (int i = 1; i < array.length; i++)
            if (array[i - 1] > array[i]){
                swap(array, i - 1, i);

                for (int j = i - 1; j - 1 >= 0; j--)
                    if (array[j - 1] > array[j])
                        swap(array, j - 1, j);
                    else
                        break;
            }
    }
}
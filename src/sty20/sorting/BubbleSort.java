package sty20.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=nmhjrI-aW5o
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arrayToSort[] = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        System.out.println("Initial: " + Arrays.toString(arrayToSort));
        bubbleSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortingUtils.swap(arr, j, j + 1);
                }
            }
        }
    }
}
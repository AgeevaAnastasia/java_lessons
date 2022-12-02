package hw3;

import java.util.Arrays;

public class mergesort {
    /*
     * Реализовать алгоритм сортировки слиянием
     */

    public static void main(String[] args) {

        int[] array = new int[] {4, 2, 7, 5, 1, 9, 0, 8, 3, 6};
        System.out.println(Arrays.toString(array));

        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));

    }

    public static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int middle = n / 2;
        int[] left = new int[middle];
        int[] right = new int[n - middle];
    
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < n; i++) {
            right[i - middle] = arr[i];
        }
        mergeSort(left, middle);
        mergeSort(right, n - middle);
    
        merge(arr, left, right, middle, n - middle);
        
    }

    public static void merge(int[] arr, int[] left, int[] right, int l, int r) {
        int i = 0; 
        int j = 0;
        int k = 0;
        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < l) {
            arr[k++] = left[i++];
        }
        while (j < r) {
            arr[k++] = right[j++];
        }

    }
}

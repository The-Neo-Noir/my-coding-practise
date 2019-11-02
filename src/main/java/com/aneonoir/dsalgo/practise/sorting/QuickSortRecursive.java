package com.aneonoir.dsalgo.practise.sorting;

/**
 *
 */
public class QuickSortRecursive {
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {

            int partition = partition(arr, low, high);


            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4 ,1 ,3 ,9, 7};
        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    private static int partition(int[] a, int pIndex, int qIndex) {
        int i = pIndex - 1;
        int pivotValue = a[qIndex];
        for (int counter = pIndex; counter <= qIndex-1; counter++) {
            if (a[counter] <= pivotValue) {
                int temp = a[++i];
                a[i] = a[counter];
                a[counter] = temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[qIndex];
        a[qIndex]=temp;
        return i+1;
    }
}

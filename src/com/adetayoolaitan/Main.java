package com.adetayoolaitan;

import com.adetayoolaitan.algorithms.PrintUtil;

import static com.adetayoolaitan.algorithms.PrintUtil.printArray;
import static com.adetayoolaitan.algorithms.search.Binary.bSearch;
import static com.adetayoolaitan.algorithms.search.Binary.bSearch2;
import static com.adetayoolaitan.algorithms.search.Exponential.exponentialSearch;
import static com.adetayoolaitan.algorithms.search.Interpolation.interpolationSearch;
import static com.adetayoolaitan.algorithms.search.Jump.jumpSearch;
import static com.adetayoolaitan.algorithms.search.Linear.search;
import static com.adetayoolaitan.algorithms.search.Linear.search2;
import static com.adetayoolaitan.algorithms.sort.Bubble.bubbleSort;
import static com.adetayoolaitan.algorithms.sort.Bucket.bucketSort;
import static com.adetayoolaitan.algorithms.sort.Comb.combSort;
import static com.adetayoolaitan.algorithms.sort.Count.countSort;
import static com.adetayoolaitan.algorithms.sort.Cycle.cycleSort;
import static com.adetayoolaitan.algorithms.sort.Heap.heapSort;
import static com.adetayoolaitan.algorithms.sort.Insertion.insertionSort;
import static com.adetayoolaitan.algorithms.sort.Merge.mergeSort;
import static com.adetayoolaitan.algorithms.sort.PigeonHole.pigeonhole_sort;
import static com.adetayoolaitan.algorithms.sort.Quick.quickSort;
import static com.adetayoolaitan.algorithms.sort.Radix.radixsort;
import static com.adetayoolaitan.algorithms.sort.Selection.selectionSort;
import static com.adetayoolaitan.algorithms.sort.Shell.shellsort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //test_linearsearch();//linear search

    }

    static void test_linearsearch(){
        int arr[] = { 2, 3, 4, 10, 40 };
        int search_element = 10;

        int result = search(arr, search_element);//1
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at index "
                    + result);

        search2(arr,search_element);//2
    }

    static void test_binarysearch(){
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = bSearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

        int result2 =bSearch2(arr,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    static void test_jumpsearch(){
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
        int x = 55;

        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);

        // Print the index where 'x' is located
        System.out.println("\nNumber " + x +
                " is at index " + index);
    }

    static void test_interpolationsearch(){
        // Array of items on which search will
        // be conducted.
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47 };

        int n = arr.length;

        // Element to be searched
        int x = 18;
        int index = interpolationSearch(arr, 0, n - 1, x);

        // If element was found
        if (index != -1)
            System.out.println("Element found at index "
                    + index);
        else
            System.out.println("Element not found.");
    }

    static void test_exponentialsearch(){
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = exponentialSearch(arr,
                arr.length, x);

        System.out.println((result < 0) ?
                "Element is not present in array" :
                "Element is present at index " +
                        result);
    }

    static void test_selectionsort(){
        int arr[] = {64,25,12,22,11};
        selectionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }

    static void test_bubblesort(){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    static void test_insertionsort(){
        int arr[] = { 12, 11, 13, 5, 6 };

        insertionSort(arr);

        printArray(arr);
    }

    static void test_mergesort(){
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    static void test_heapsort(){
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        heapSort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }

    static void test_quicksort(){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    static void test_countsort(){
        int[] arr = { -5, -10, 0, -3, 8, 5, -1, 10 };
        countSort(arr);
        printArray(arr);
    }

    static void test_radixsort(){
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;

        // Function Call
        radixsort(arr, n);
        printArray(arr, n);
    }

    static void test_bucketsort(){
        float arr[] = { (float)0.897, (float)0.565,
                (float)0.656, (float)0.1234,
                (float)0.665, (float)0.3434 };

        int n = arr.length;
        bucketSort(arr, n);

        System.out.println("Sorted array is ");
        for (float el : arr) {
            System.out.print(el + " ");
        }
    }

    static void test_shellsort(){
        int arr[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(arr);

        shellsort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }

    static void test_combsort(){
        int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        combSort(arr);

        System.out.println("sorted array");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

    static void test_pigeonholesort(){
        int[] arr = {8, 3, 2, 7, 4, 6, 8};

        System.out.print("Sorted order is : ");

        pigeonhole_sort(arr,arr.length);

        for(int i=0 ; i<arr.length ; i++)
            System.out.print(arr[i] + " ");
    }

    static void test_cyclesort(){
        int arr[] = { 1, 8, 3, 9, 10, 10, 2, 4 };
        int n = arr.length;
        cycleSort(arr, n);

        System.out.println("After sort : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

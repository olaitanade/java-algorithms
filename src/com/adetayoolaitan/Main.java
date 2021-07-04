package com.adetayoolaitan;

import static com.adetayoolaitan.algorithms.search.Binary.bSearch;
import static com.adetayoolaitan.algorithms.search.Binary.bSearch2;
import static com.adetayoolaitan.algorithms.search.Exponential.exponentialSearch;
import static com.adetayoolaitan.algorithms.search.Interpolation.interpolationSearch;
import static com.adetayoolaitan.algorithms.search.Jump.jumpSearch;
import static com.adetayoolaitan.algorithms.search.Linear.search;
import static com.adetayoolaitan.algorithms.search.Linear.search2;

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

}

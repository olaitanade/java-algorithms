package com.adetayoolaitan;

import static com.adetayoolaitan.algorithms.search.Binary.bSearch;
import static com.adetayoolaitan.algorithms.search.Binary.bSearch2;
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
}

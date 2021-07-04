package com.adetayoolaitan.algorithms.search;

public class Linear {

    //O(n)
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    //if element Found at last  O(n) to O(1), if element Not found O(n) to O(n/2)
    public static void search2(int arr[], int search_Element)
    {
        int left = 0;
        int length = arr.length;
        int right = length - 1;
        int position = -1;

        // run loop from 0 to right
        for (left = 0; left <= right;)
        {

            // if search_element is found with left variable
            if (arr[left] == search_Element)
            {
                position = left;
                System.out.println(
                        "Element found in Array at "
                                + (position + 1) + " Position with "
                                + (left + 1) + " Attempt");
                break;
            }

            // if search_element is found with right variable
            if (arr[right] == search_Element)
            {
                position = right;
                System.out.println(
                        "Element found in Array at "
                                + (position + 1) + " Position with "
                                + (length - right) + " Attempt");
                break;
            }

            left++;
            right--;
        }

        // if element not found
        if (position == -1)
            System.out.println("Not found in Array with "
                    + left + " Attempt");
    }
}

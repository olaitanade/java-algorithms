package com.adetayoolaitan.algorithms.greedy;

public class BuyNCandles {
    // Function to find the minimum
    // amount to buy all candies
    public static int findMinimum(int arr[], int n, int k)
    {
        int res = 0;
        for (int i = 0; i < n; i++) {
            // Buy current candy
            res += arr[i];

            // And take k candies for free
            // from the last
            n = n - k;
        }
        return res;
    }

    // Function to find the maximum
    // amount to buy all candies
    public static int findMaximum(int arr[], int n, int k)
    {
        int res = 0, index = 0;

        for (int i = n - 1; i >= index; i--)
        {
            // Buy candy with maximum amount
            res += arr[i];

            // And get k candies for free from
            // the starting
            index += k;
        }
        return res;
    }
}

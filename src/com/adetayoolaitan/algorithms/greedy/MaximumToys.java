package com.adetayoolaitan.algorithms.greedy;

import java.util.Arrays;

public class MaximumToys {
    // This functions returns
// the required number of toys
    public static int maximum_toys(int cost[],
                            int N, int K)
    {
        int count = 0, sum = 0;

        // sort the cost array
        Arrays.sort(cost);
        for (int i = 0; i < N; i++)
        {

            // Check if we can buy ith toy or not
            if (sum +cost[i] <= K)
            {
                sum = sum + cost[i];
                // Increment count
                count++;
            }
        }
        return count;
    }
}

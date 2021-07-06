package com.adetayoolaitan.algorithms.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    // A job has a start time, finish time and profit.
    public static class Activity
    {
        int start, finish;

        // Constructor
        public Activity(int start, int finish)
        {
            this.start = start;
            this.finish = finish;
        }
    }

    // A utility function that is used for sorting
    // activities according to finish time
    static void compare(Activity arr[], int n)
    {
        Arrays.sort(arr, new Comparator<Activity>()
        {
            @Override
            public int compare(Activity s1, Activity s2)
            {
                return s1.finish - s2.finish;
            }
        });
    }

    // Returns count of the maximum set of activities that
    // can
    // be done by a single person, one at a time.
    public static void printMaxActivities(Activity arr[], int n)
    {
        // Sort jobs according to finish time
        compare(arr, n);
        System.out.println(
                "Following activities are selected :");

        // The first activity always gets selected
        int i = 0;
        System.out.print("(" + arr[i].start + ", "
                + arr[i].finish + "), ");

        // Consider rest of the activities
        for (int j = 1; j < n; j++)
        {

            // If this activity has start time greater than
            // or equal to the finish time of previously
            // selected activity, then select it
            if (arr[j].start >= arr[i].finish)
            {
                System.out.print("(" + arr[j].start + ", "
                        + arr[j].finish + "), ");
                i = j;
            }
        }
    }
}

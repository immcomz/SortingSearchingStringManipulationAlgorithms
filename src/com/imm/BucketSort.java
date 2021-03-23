package com.imm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void sort(int[] array, int numberOfBuckets) {
        var i = 0;
        for (var bucket : createBuckets(array, numberOfBuckets)) {
            Collections.sort(bucket);//sort each and every buckets in the array
            for (var item : bucket)
                array[i++] = item; // copy the sorted items in to array
        }
    }

    private static List<List<Integer>> createBuckets(int[] array, int numberOfBuckets) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (var i = 0; i < numberOfBuckets; i++)
            buckets.add(new ArrayList<>());// create buckets in the bucket array // List<List<Integer>>

        for (var item : array)
            buckets.get(item / numberOfBuckets).add(item);//add items in unsorted array to buckets (to item / numberOfBuckets position) in buckets array

        return buckets;
    }
}

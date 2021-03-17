package com.imm;

public class MergeSort {
    //Divide and conquor Algorithm
    //Requires Additional memory to merge into brand new array

    //1.Divide this array in to half
    //2.Recursively sort each half
    //3.Merge the results

    //    [4,2,1]
    //     /   \
    //Left [4] right [2,1]
    //           /    \
    //       left[2] right[1]    result[1,2]

    public static void sort(int[] array) {
        System.out.println("at sort");
        //[4,2,1]
        if (array.length < 2)// ARRAY Length 0 0r 1/ Base Condition
            return;
        //1.
        var middle = array.length / 2; //devide array in to 2 pieces

        int[] left = new int[middle];//form left array //[4]
        for (var i = 0; i < middle; i++)
            left[i] = array[i];//copy items upto middle

        int[] right = new int[array.length - middle];//form right array //[2,1]
        for (var i = middle; i < array.length; i++)
            right[i - middle] = array[i]; //i-middle match the correct index of right array
        //2.
        sort(left); //recursively sort left
        sort(right); //recursively sort right
        //3.
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] result) {
        System.out.println("at merge");
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) { //iterate over left n right arrays
            //find the smallets value and store it result array.
            if (left[i] <= right[j])
                result[k++] = left[i++]; // result[k] increment later k++
            else
                result[k++] = right[j++]; //copy right item to result array
        }
        //when one partition is smaller than the other one
        //when left array has less amount of elements than right array
        //copy rest of elements to result/ when one condition is false i < left.length && j < right.length
        while (i < left.length)
            result[k++] = left[i++];

        //when right array has less amount of elements than left array
        //copy rest of elements to result / when one condition is false i < left.length && j < right.length
        while (j < right.length)
            result[k++] = right[j++];
    }
}

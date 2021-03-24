package com.imm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	   // int [] array = {2,3,5,7};

//        BubbleSort.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        SelectionSort.sort(array);
//        System.out.println(Arrays.toString(array));

//        InsertionSort.sort(array);
//        System.out.println(Arrays.toString(array));

//        MergeSort.sort(array);
//        System.out.println(Arrays.toString(array));

//        CountingSort.sort(array,4);
//        System.out.println(Arrays.toString(array));

//        BucketSort.sort(array,4);
//        System.out.println(Arrays.toString(array));

        //BucketSort.sort(array,4); // Binary Search only works for sorted arrays
        //Arrays.sort(array);
        int [] array = {2,3,5,7};
        var index = Search.binarySearchRecursive(array,2);
        System.out.println(index);

    }

}

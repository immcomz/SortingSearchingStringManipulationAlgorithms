package com.imm;

import java.util.Arrays;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    int [] array = {4,2,1};

//        BubbleSort.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        SelectionSort.sort(array);
//        System.out.println(Arrays.toString(array));

//        InsertionSort.sort(array);
//        System.out.println(Arrays.toString(array));

//        MergeSort.sort(array);
//        System.out.println(Arrays.toString(array));

        CountingSort.sort(array,4);
        System.out.println(Arrays.toString(array));

    }

}

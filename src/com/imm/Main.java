package com.imm;

import java.util.Arrays;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    int [] array = {1,2,0,2};

//        BubbleSort.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        SelectionSort.sort(array);
//        System.out.println(Arrays.toString(array));

//        InsertionSort.sort(array);
//        System.out.println(Arrays.toString(array));

        MergeSort.sort(array);
        System.out.println(Arrays.toString(array));


    }

}

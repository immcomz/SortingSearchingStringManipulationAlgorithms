package com.imm;

import java.util.Arrays;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    int [] array = {3,5,6,7,8,2,1,3,-1};

        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));

        SelectionSorts.sort(array);
        System.out.println(Arrays.toString(array));


    }

}

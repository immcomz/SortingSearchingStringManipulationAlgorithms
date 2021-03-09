package com.imm;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] input){
        //Bubble Up Until(swap elements) previous less than next element in an Array
        //i 0 1 2 3 4
        // {6,8,0,4,2} --->Bubble UP  {0,2,4,6,8}
        //j   1 2 3 4
        boolean isSorted;
        for(int i=0; i<input.length; i++){
             isSorted =true;// assume that array is sorted
            //j<input.length - i because by the second iteration highest value will be at the correct position {6,0,4,2,*8*}
            //so it need to move second iteration input.length-i
            for(int j=1; j<input.length-i;j++){//second loop to iterate every two items of the array ex: 6(i=0) compare with 8(j=1),0(j=2),4,2
                if(input[j-1]>input[j]){
                    isSorted=false; // cause trying to swapping or not sorted
                    swap(j,j-1,input);
                }
            }
            if(isSorted) return; //if already sorted the array/ no need to iterate over the loops in other word didnt find any swapping in each iteration

        }

    }

    private static void swap(int index1, int index2,int[] array){
        var temp = array[index1]; //temp =j
        array[index1] = array[index2]; // j = j-1
        array[index2] = temp;          // j-1 = temp

    }
}

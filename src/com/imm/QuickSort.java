package com.imm;

public class QuickSort {
    //Steps
    //1.Partition Assume Pivet as the last element in an array
    //2.Recursively sort left
    //3.recursively sort right

    //b=-1 i=0           pivot
    //|    |              |
    //    [15,6,3,1,22,10,13]
    //          b=pivot  i  where pivot at the right position
    //          |        |
    //[6,3,1,10,13,15,  22]

    //[6,3,1,10,      13    ,15,22]
    //     left  <-boundary-> right[start:boundary+1, end:array.length-1] -
    //       |                                                             |
    //  [start:0, end:boundary-1]                                       [15,22]
    //     |                                                        left     right-start= index[22](boundry)+1 >end(length-1) stop recursion
    //[3,1,6,10]                                                    |- start=0 end=boundry(1)-1=0 stop recursion

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        if (start >= end)//base condition when array is empty(start > end) or it has 1 element(start = end)
            return;

        var boundary = partition(array, start, end);
        //sort left recursively
        sort(array, start, boundary - 1);
        //sort right recursively
        sort(array, boundary + 1, end);
    }

    private static int partition(int[] array, int start, int end) {//return the index of the pivot(became boundary of left array) after it sorted in to correct possition
        var pivot = array[end];//set pivot as the last element
        var boundary = start - 1;// starting boundary of left partition = -1
        for (var i = start; i <= end; i++)
            if (array[i] <= pivot)
                swap(array, i, ++boundary); // increase the boundary and swap boundary and current/i

        return boundary;//after for loop de pivot at the correct position=boundary and return it
    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

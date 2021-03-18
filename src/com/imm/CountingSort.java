package com.imm;
//Not comparing items use basic maths
public class CountingSort {
    //[5,3,2,5,4,4,5] array

    // 0 1 2 3 4 5 = indexes
    //[0,0,1,1,2,3 ] countArray[max(5)+1]

    // [2,3,4,4,5,5,5] sorted according to indexes values of count array

    public static void sort(int[] array, int max) {
        int[] counts = new int[max + 1];
        for (var item : array) //item = 5
            //ex [0,0,0,0,0,1 ] increment index of 5 by 1
            counts[item]++;// use var item index of count array(increment by 1)

        var k = 0;
        for (var i = 0; i < counts.length; i++)//typical loop on countArray
            for (var j = 0; j < counts[i]; j++) //loop between current index of count and # of elements in current index
                //ex i=4  j=0 j<2  add [...4]  j=1 j<2 add [...4,4]
                array[k++] = i; //array[k]=i n increment by 1
    }
}

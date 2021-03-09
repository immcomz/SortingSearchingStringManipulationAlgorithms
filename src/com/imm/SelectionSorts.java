package com.imm;

public class SelectionSorts {
    public static void sort(int[] input){
        //{8,2,4,1,3} --> i=0(8),minIndex=0,j=0(8) input[j=3] 1<8 input[i=0] so nextMinIndex=3 swap(3,0,arr)
        // {1,2,4,8,3} -->i=1(2),minIndex=1,j=1(2) no need to swap already nextMinIndex=1 (2)
        // {1,2,4,8,3} --->i=2(2),minIndex=2,j=2(4) input[j=4] 3<4 input[i=2] so nextMinIndex=4 swap(4,2,arr)
        // {1,2,3,8,4} --->nextMinIndex=4 swap(4,3,arr)
        // {1,2,3,4,8} ---> Done

        for(var i=0; i<input.length; i++){
            var minIndex=i;
            //j=i
//            for(var j=i; j<input.length;j++){
//                if(input[j]<input[minIndex]){
//                    minIndex= j;//next Min Index
//                    swap(minIndex,i,input);//swap current with new minIndex ex:swap(3,0,input)
//                }
//            }
            findMinIndex(minIndex,input,i);
        }
    }
    private static void findMinIndex(int minIndex,int[] input,int i){
        for(var j=i; j<input.length;j++){
            if(input[j]<input[minIndex]){
                minIndex= j;//next Min Index
                swap(minIndex,i,input);//swap current with new minIndex ex:swap(3,1,input)
            }
        }

    }
    private static void swap(int index1, int index2,int[] array){
        var temp = array[index1]; //temp =j
        array[index1] = array[index2]; // j = j-1
        array[index2] = temp;          // j-1 = temp

    }
}

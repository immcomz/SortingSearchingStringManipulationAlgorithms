package com.imm;

public class Search {

    public static int linearSearch(int[] array, int target) {
        for (var i = 0; i < array.length; i++)
            if (array[i] == target) // current == target value
                return i;

        return -1; //otherwise reurn -1
    }
    public  static int binarySearchRecursive(int[] array,int target){
        //before binary search need to sort array in ascending order
        return binarySearchRecursive(array,target,0,array.length-1);
    }

     private static int binarySearchRecursive(int[] array, int target,int left,int right){
        //   left(0) middle  right(length-1) (initial values)
         //  |       |       |
        //   1,2,3,4,5,6,7,8,9]
        //assume target 2

         if(right < left) return -1; // base condition when array is empty

         var middle = (left + right)/2;

        if(array[middle] == target) return middle; //find the target

       // if(array[left] == target) return left;// Fix the error finding index 0 in above if(array[middle] == target) return middle; //find the target

        if(target < array[middle]) // target value is at left side from middle
            //   left(0) middle-1  new middle = (left+ middle-1) /2 =
            //   |     |
            //   1,2,3,4,
            return binarySearchRecursive(array,target,left,middle-1); //recursively search in left partition

        //other wise target at right side from middle
         return binarySearchRecursive(array,target,middle+1,right);//recursively search in right partition

     }

}

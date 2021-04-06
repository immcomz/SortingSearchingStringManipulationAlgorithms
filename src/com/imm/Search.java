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

         if(right < left) return -1; // base condition when partition array is empty

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

    public int binarySearchIterative(int[] array, int target) {
        var left = 0;
        var right = array.length - 1;

        while (left <= right) { //until partition array is empty
            var middle = (left + right) / 2;

            if (array[middle] == target)// if found
                return middle;

            if (target < array[middle])
                right = middle - 1; // target at the left
            else
                left = middle + 1; // target at the right
        }
        return -1;
    }

    public int ternarySearch(int[] array, int target) {

        // Runtime complexity is higher in Ternary Search than binary search
        return ternarySearch(array, target, 0, array.length - 1);
    }
    private int ternarySearch(int[] array, int target, int left, int right) {

        if (left > right)// left become grater than right / target at out of range in array/ there is no such a element in an array
            return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == target)
            return mid1;

        if (array[mid2] == target)
            return mid2;

        if (target < array[mid1])
            return ternarySearch(array, target, left, mid1 - 1);

        if (target > array[mid2])
            return ternarySearch(array, target, mid2 + 1, right);

        //result in between mid1 and mid 2
        return ternarySearch(array, target, mid1 + 1, mid2 - 1);
    }
}

package com.imm;

public class Search {

    public int linearSearch(int[] array, int target) {
        for (var i = 0; i < array.length; i++)
            if (array[i] == target) // current == target value
                return i;

        return -1; //otherwise reurn -1
    }
}

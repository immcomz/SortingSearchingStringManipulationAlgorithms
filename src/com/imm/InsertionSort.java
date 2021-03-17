package com.imm;

public class InsertionSort {
    //Instead of swapping items, shift items to right if current > others
    //Insert in correct position named this Insertion Sort algorithm

    // j=i-1  i
    // |  ____|
    // | |
    //{8,2,4,1,3}  i=1,j=0(8) current(i)=2 8(j) > 2(current) ->shift {8,8,4,1,3} a[j+1]=current -> shift{2,8,4,1,3}
    //   j i
    //   | |
    //{2,8,4,1,3}  i=2,j=1 current(i)=8 8(j) > 4(current) ->shift {2,8,8,1,3} a[j+1]=current -> shift{2,4,8,1,3}
    //   2=j i=3                     while{ array[j+1] = array[j]             (j-- =1)j(4) > (1)current ->  (j-- =0)j(2) > (1)current  EndOfWile}           a[j+1]==current
    //     | |                                                   *                    |                             |                                       |
    //{2,4,8,1,3}  current(i)=1 8(j) > 1(current) ->shift {2,4,8,8,3}      ->      {2,4,8,8,3}  ->            shift{2,4,4,8,3} -->   shift{2,2,4,8,3} ->   {1,2,4,8,3}
    public static void sort(int[] array){                                  //             |                               |
        for(int i=1; i<array.length; i++){                                 //         i[i]=1                              i
            var current = array[i];
            var j = i-1; //previous index
            while(j >=0 && array[j] > current){ //j canot be negetive value and previous > current
                System.out.println("i:"+i + " j:"+j);
                array[j+1] = array[j];//now shift items to right
                j--;// but still current value is still same wont changed during while loop
            }
            array[j+1] = current;

        }
    }
}

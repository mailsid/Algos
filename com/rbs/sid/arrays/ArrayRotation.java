package com.rbs.sid.arrays;

public class ArrayRotation {


    public static void main(String[] args){

        int [] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int rotateBy = 2;

        rotate(input, rotateBy);
    }

    private static void rotate(int[] input, int rotateBy) {

        int j = 0;

        for(int i = rotateBy -1 ; i < input.length; i ++){

            int temp = input[j];
            input[j] = input[i];
            input[i] = temp;
            j ++;
        }

    }
}

package com.java.datastructure;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int arr1[] = new int[5];
        int []arr2 = new int[5];
        assert 4==arr.length;
        //2-D array
        int[][] twoDArray = new int[3][3];
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 1;
        twoDArray[1][0] = 1;
        twoDArray[1][1] = 1;

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        //Jagged array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[2];
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[2][0] = 6;
        jaggedArray[2][1] = 7;

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
//        1 2
//        3 4 5
//        6 7
    }
}

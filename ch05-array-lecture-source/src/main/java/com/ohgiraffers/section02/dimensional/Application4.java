package com.ohgiraffers.section02.dimensional;

public class Application4 {
    public static void main(String[] args) {
        /*
        * 2d array
        *
        * 할당과 동시에 블록을 이용해서 초기화가 가능
        * */

        System.out.println("===== 정변 배열 =====");
        int[][] arr = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n===== 가변 배열 =====");
        int[][] arr2 = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {6,7,8,9,10};
        int[][] arr5 = {arr3, arr4};
        System.out.println("\n===== 미리 할당한 배열을 이용한 방식 =====");
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();
        }
    }
}

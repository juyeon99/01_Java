package com.ohgiraffers.section02.dimensional;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 2d array 선언
        *
        * 자료형[][] 변수명 = new 자료형[할당할 배열의 개수][할당할 배열의 길이]
        * */

        int[][] arr = new int[3][5];
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "번째 인덱스 배열");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

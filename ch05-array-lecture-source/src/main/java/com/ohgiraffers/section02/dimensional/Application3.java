package com.ohgiraffers.section02.dimensional;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 2d array (가변배열)
        *
        * 가변배열의 경우 각 인덱스별 배열을 따로 할당해야 한다.
        * 선언과 동시에 모든 배열을 할당할 수 없으며, 할당할 배열의 개수만 지정하고
        * 각 인덱스에 서로 다른 길이의 배열을 따로 할당해야 한다.
        *
        * 자료형[][] 변수명 = new 자료형[할당할 배열의 개수][];
        * 변수명[인덱스]    = new 자료형[배열의 길이];
        * */

        // Declaration
        int[][] arr1 = new int[3][];

        arr1[0] = new int[3];
        arr1[1] = new int[2];

        int[] arr2 = new int[5];
        arr1[2] = arr2;  // 미리 할당해둔 배열을 이용해서 활용 가능

        int n = 1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + "번째 인덱스 배열");
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = n++;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

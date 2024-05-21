package com.ohgiraffers.section02.dimensional;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 다차원 배열
        *
        * 2차원 이상의 배열을 의미
        * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미
        * -> 2차원 배열은 1차원 배열 여러개를 하나로 묶어서 관리하는 배열을 의미
        * */

        /*
        * 2차원 배열을 사용하는 방법
        * 1. 배열의 주소를 보관하는 reference 변수 선언(stack)
        * 2. 여러개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
        * 3. 각 인덱스에서 관리하는 배열을 할당하여 주소를 보관하는 배열에 저장
        * 4. 생성한 여러개의 1차원 배열에 차례로 접근해서 사용
        * */

        int[][] arr1;
        int arr2[][];

        arr1 = new int[3][];    // 주소를 묶어서 관리할 배열의 크기를 지정해야 함
        arr1[0] = new int[5];
        arr1[1] = new int[6];
        arr1[2] = new int[7];   // each 1d array can have diff size

        arr2 = new int[3][5];   // all three 1d arrays have the same size of 5

        // 크기 할당 후 아무 값을 대입하지 않으면 heap에 기본값이 들어감.
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j]);
//            }
//            System.out.println();
//        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

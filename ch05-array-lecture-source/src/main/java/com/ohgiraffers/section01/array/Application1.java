package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {
        /*
        * array
        *
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)
        * array는 heap에 new를 이용하여 할당
        * */

        /*
        * array의 사용이유
        *
        * array을 사용하지 않으면 변수를 여러개 사용해야함
        * -> 모든 변수의 이름을 사용자가 관리해야 한다는 단점
        * 1. 연속된 메모리 공간으로 관리할 수 있다.
        * 2. 반복문을 이용해 연속 처리가 가능
        * */

        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;

        for (int i = 0, value = 0; i < arr.length; i++) {
//            value += arr[i];
            value += 10;
            arr[i] = value;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

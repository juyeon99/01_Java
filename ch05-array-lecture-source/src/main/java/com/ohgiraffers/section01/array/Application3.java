package com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {
        /*
         * 배열에 초기화되는 자료형 별 기본값
         *
         * 정수: 0
         * 실수: 0.0
         * 논리: false
         * 문자: \n0000
         * String 참조: null
         * */

//        int[] arr = new int[5];
//        double[] arr = new double[5];
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("iarr[" + i + "] = " + arr[i]);
        }

        /*
        * 자바에서 지정한 기본값 이외의 값으로 초기화를 하고싶은 경우 블럭 이용
        *
        * 블럭 -> new 필요X, 값의 개수만큼 자동으로 크기가 설정됨
        * */

        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = new int[] {1,2,3,4,5,6};

        System.out.println("arr2의 길이: " + arr2.length);
        System.out.println("arr3의 길이: " + arr3.length);

        System.out.println("=========== arr2의 각 인덱스별 값 ===========");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr[" + i + "] = " + arr2[i]);
        }
    }
}

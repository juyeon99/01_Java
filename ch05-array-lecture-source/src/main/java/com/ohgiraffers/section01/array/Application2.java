package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 배열의 사용 방법
        *
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        * */

        /*
        * 배열의 선언
        *
        * 자료형[] 변수명;
        * 자료형 변수명[];
        * */

        // stack에 array의 주소를 보관할 수 있는 공간을 만드는 것
        int[] iarr;
        char carr[];

        /*
        * 선언한 reference 변수에 array를 할당하여 대입할 수 있다.
        * new연산자는 heap영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자
        * 발생한 주소를 reference 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에 참조 자료형이라고 한다.
        * */

        // array를 할당할 시에는 반드시 array의 크기를 지정해 줘야한다.
//        iarr = new int[];   // 크기를 지정해주지 않아서 error

        iarr = new int[5];
        carr = new char[5];

        int[] iarr2 = new int[5];
        char carr2[] = new char[10];
        long[] larr = new long[5];

        System.out.println("iarr2: " + iarr2);  // prints address
        System.out.println("carr2: " + carr2);
        System.out.println("larr : " + larr);

        /*
        * hashcode(): 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환
        * -> 동일 객체인지 비교할 때 사용할 목적으로 많이 쓰이며, 동등객체를 동일객체 취급하기 위한 용도로 overriding해서 사용
        * */

        System.out.println("iarr2의 hashcode : " + iarr2.hashCode());  // 주소값을 십진수로 변환한 것
        System.out.println("carr2의 hashcode : " + carr2.hashCode());

        // 배열의 길이
        System.out.println("iarr2의 길이: " + iarr2.length);
        System.out.println("carr2의 길이: " + carr2.length);

        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이: ");
        int size = sc.nextInt();

        double[] darr = new double[size];
        System.out.println("darr의 hashCode: " + darr.hashCode());
        System.out.println("darr의 length: " + darr.length);

        // 한번 지정한 배열의 크기는 변경 불가
        darr = new double[30];  // 배열의 사이즈를 변경한 것이 아니고, 새로운 배열을 생성해서 그 주소값을 reference variable에 덮어 쓴 것이다.
        System.out.println("변경된 darr의 hashCode: " + darr.hashCode());
        System.out.println("변경된 darr의 length: " + darr.length);

        // 한번 주소값을 잃어버린 배열은 다시 reference 불가
        darr = null;
//        System.out.println("삭제 후 darr의 길이: " + darr.length);    // null ptr exception
    }
}

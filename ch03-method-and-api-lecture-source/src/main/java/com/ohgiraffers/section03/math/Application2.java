package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 난수의 활용
        *
        * Math.random()을 이용해 발생한 난수는 0부터 1 전까지의 실수 범위의 난수값을 발생시킨다.
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야하는 경우들이 존재.
        *
        * 원하는 범위의 난수를 구하는 공식
        * (int)(Math.random * 구하려는 난수의 개수) + 구하려는 난수의 최소값
        * */

        // 범위: 0~9
        int random = (int) (Math.random() * 10);
        System.out.println("0~9 중 랜덤: " + random);

        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("1~10 중 랜덤: " + random2);

        // 범위: 10~15
        System.out.println("10~15 중 랜덤: " + ((int)(Math.random() * 6) + 10));

        // 범위: -128~127
        System.out.println("-128~127 중 랜덤: " + ((int)(Math.random() * 256) - 128));
    }
}

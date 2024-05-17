package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /*
        * java.util.Random
        *
        * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * nextInt(int bound) : 0부터 parameter로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 변환
        *
        * 원하는 범위의 난수를 구하는 공식
        * random.nextInt([구하려는 난수의 개수]) + [구하려는 난수의 최소값]
        * */

        Random rand = new Random();
        // 0~9
        int rand1 = rand.nextInt(10);
        System.out.println("0~9 중 랜덤: " + rand1);

        // 1~10
        int rand2 = rand.nextInt(10) + 1;
        System.out.println("1~10 중 랜덤: " + rand2);

        // 20~45
        int rand3 = rand.nextInt(45-20+1) + 20;
        System.out.println("20~45 중 랜덤: " + rand3);

        // -128~127
//        int rand4 = rand.nextInt(127-(-128)+1) - 128;
        int rand4 = new Random().nextInt(127-(-128)+1) - 128;   // 객체를 생성하자마자 바로 메소드 호출 가능
        System.out.println("-128~127 중 랜덤: " + rand4);
    }
}

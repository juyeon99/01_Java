package com.ohgiraffers.section02.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Calculating
        * 
        * 수학연산과 관련된 다양한 메소드를 제공하는데 최소, 최대, 종합 등의 결과를 보여준다.
        * */

        long count = IntStream.range(1,10).count();
        long sum = IntStream.range(1,10).sum();

        System.out.println("count = " + count); // 9
        System.out.println("sum = " + sum);     // 45

        int oddSum = IntStream.range(1,10)
                .filter(i -> i % 2 == 1)    // 1,3,5,7,9
                .sum();
        System.out.println("oddSum = " + oddSum);   // 25

        // OptionalInt: 값이 Stream안에 존재할 수도, 존재하지 않을 수도 있는 int를 표현하는 타입
        OptionalInt max = IntStream.range(1,10).max();  // Optional: Stream안에 값이 없을 수도 있기 때문에 최대값이 있을수도 있고 없을수도 있음을 표현
        OptionalInt min = IntStream.range(1,10).min();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

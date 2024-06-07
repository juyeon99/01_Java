package com.ohgiraffers.section02.intermediate;

import java.net.StandardSocketOptions;
import java.util.stream.IntStream;

public class Application1 {
    // 중계연산, 중간연산
    public static void main(String[] args) {
        /*
        * Stream<T> filter(<Predicate<? super T> predicate);
        *
        * filter는 Stream에서 특정 데이터만 걸러내는 메소드
        * parameter로 받는 Predicate는 boolean을 리턴하는 함수형 인터페이스
        * */

        IntStream intStream = IntStream.range(0,10);    // 0~9
        // i % 2 == 0 인 경우만 골라내기
        intStream.filter(i -> i % 2 == 0)   // 0,2,4,6,8
                .forEach(i -> System.out.print(i + " "));
    }
}

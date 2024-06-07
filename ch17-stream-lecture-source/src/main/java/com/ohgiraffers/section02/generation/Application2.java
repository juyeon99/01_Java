package com.ohgiraffers.section02.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 기본타입 스트림 생성
        * range(start,end):       start부터 "end 전까지" 범위의 스트림 생성 [s,e)
        * rangeClosed(start,end): start부터 "end까지" 범위의 스트림 생성 [s,e]
        * */

        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        LongStream longStream2 = LongStream.rangeClosed(5, 10);
        longStream2.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /*
        * Wrapper 클래스 자료형의 스트림으로 변환이 필요할 때 boxing을 통해 할 수 있다.
        * doubles(n): n개만큼 생성하여 반환
        * boxed():    기본 타입 스트림인 XXXStream을 boxing하여 Wrapper타입의 Stream<XXX>으로 변환
        * */

        // [double 타입 랜덤 수 5개]를 Double타입으로 boxing해서 담은 doubleStream
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        // String을 intStream으로 변환
        IntStream helloworldChars = "hello world".chars();   // String을 int로 변경
        helloworldChars.forEach(v -> System.out.print(v + " "));
        System.out.println();

        Stream<String> stringStream1 = Stream.of("java","oracle","jdbc");
        Stream<String> stringStream2 = Stream.of("html","css","javascript");

        /*
        * concat(): 두 개의 Stream을 동일 타입 Stream으로 합치기
        * */
        System.out.println("========== concatStream ==========");
        Stream<String> concatStream = Stream.concat(stringStream1,stringStream2);
        concatStream.forEach(System.out::println);

        // Stream은 1회성으로 사용가능 => 이미 최종 연산이 끝난 스트림은 재사용 불가
        // 다시 사용할시 IllegalStateException 발생
//        stringStream1.forEach(System.out::println);
//        stringStream2.forEach(System.out::println);
    }
}

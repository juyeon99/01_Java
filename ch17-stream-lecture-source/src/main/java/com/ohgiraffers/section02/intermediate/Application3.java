package com.ohgiraffers.section02.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {
        /*
        * Stream<T> sorted();
        * Stream<T> sorted(Comparator<? super T> comparator);
        *
        * sorted(): 인자가 없어도 호출 가능, 인자 없으면 오름차순으로 자동 정렬
        * */

        List<Integer> integerList = IntStream.of(5,10,99,2,1,35)
                .boxed()    // Integer 형태로 변환
                .sorted(/* Comparator.reverseOrder() */)   // 오름차순 정렬
                .toList();  // List 형태로 리턴
        System.out.println("integerList = " + integerList);
    }
}

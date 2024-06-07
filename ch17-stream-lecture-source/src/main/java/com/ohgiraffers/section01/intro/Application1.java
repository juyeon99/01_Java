package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Stream
        *
        * JAVA 8버전부터 추가된 기능으로 컬렉션에 저장된 element들을 하나씩 순회하며 처리할 수 있는 기능
        * Stream을 이용하면 array 또는 컬렉션을 함수 여러개를 사용해 결과를 쉽게 얻을 수 있다.
        * 람다식과 함께 사용될 수 있으며 컬렉션에 들어있는 데이터에 대한 처리를 간결하게 표현하여 코드양이 많이 줄어듦
        * */

        /*
        * Stream의 특징
        *
        * 1. 원본데이터를 변경시키지 X
        * 2. 일회용이기 때문에 최종 연산이 일어난 후 다시 스트림을 생성해서 사용해야 한다.
        * 3. 작업을 내부적으로 반복처리한다.
        * 4. 작업을 병렬로 처리할 수 있다. (Multi-thread)
        * */

        List<String> strList = new ArrayList<String>(
                Arrays.asList("b","a","e","b","c","c","a","d")
        );
        System.out.println("========== stream 사용 이전 ==========");
        for (String str : strList) {
            System.out.println(str);
        }

        System.out.println("========== stream 사용 이후 ==========");
        strList.stream().forEach(System.out::println);

        System.out.println("========== stream 연산 ==========");
//       |-- stream 생성 --|------------ 중간 연산 -------------|---------- 최종 연산 ----------|
//        strList.stream().distinct().sorted().limit(5).forEach(System.out::println);

        // distinct(): 중복 제거
        // sorted():   오름차순 정렬 (내림차순 정렬: Comparator.reverseOrder())
        // limit():    parameter로 넣은 정수만큼 잘라줌
        strList.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);    // 위에서부터 3개만 limit
    }
}

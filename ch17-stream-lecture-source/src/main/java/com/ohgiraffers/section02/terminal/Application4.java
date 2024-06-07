package com.ohgiraffers.section02.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /*
        * match
        *
        * boolean anyMatch(Predicate<? super T> predicate);     // 하나라도 조건을 만족하는 값이 있는지
        * boolean allMatch(Predicate<? super T> predicate);     // 모든 조건을 만족하는지
        * boolean noneMatch(Predicate<? super T> predicate);    // 모든 조건을 만족하지 않는지
        * */

        List<String> strList = Arrays.asList("Java","Spring","SpringBoot");

        // 하나라도 조건을 만족하는 값이 있는지 확인
        boolean anyMatch = strList
                .stream()
                .anyMatch(str -> str.contains("p"));    // 하나의 문자열이라도 p를 포함하는지
        System.out.println("anyMatch = " + anyMatch);

        // 모든 조건을 만족하는지
        boolean allMatch = strList
                .stream()
                .allMatch(str -> str.contains("a"));
        System.out.println("allMatch = " + allMatch);

        // 모든 조건을 만족하지 않는지
        boolean noneMatch = strList
                .stream()
                .noneMatch(str -> str.contains("c"));
        System.out.println("noneMatch = " + noneMatch);
    }
}

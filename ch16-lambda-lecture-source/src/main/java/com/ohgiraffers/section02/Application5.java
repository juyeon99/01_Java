package com.ohgiraffers.section02;

import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {
        /*
        * Predicate: parameter와 boolean 리턴값이 있는 testXXX()를 가지고 있다.
        *            parameter 값을 이용하여 true/false를 리턴
        * */

        /* Predicate<T>#test(T t) : boolean : T를 조사하여 boolean으로 리턴 */
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("String인지 확인: " + predicate.test("123"));    // true
        System.out.println("String인지 확인: " + predicate.test(123));      // false
    }
}

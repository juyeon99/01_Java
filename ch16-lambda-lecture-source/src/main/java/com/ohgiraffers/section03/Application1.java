package com.ohgiraffers.section03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 메소드 참조 (::)
        *
        * 함수형 인터페이스를 람다식으로 쓰는게 아닌, 일반 메소드를 참조시켜 선언하는 방법
        * 일반 메소드를 참조하기 위해서는 함수형 인터페이스의 parameter 타입/개수/리턴타입 과 메소드의 타입/개수/리턴타입 이 같아야 한다.
        *
        * [메소드 참조 표현식]
        * 클래스이름::메소드이름
        * 참조변수이름::메소드이름
        * */

        // BiFunction<T,U,R>#apply(T t, U u) : R : 객체 T와 U를 R로 mapping
        // String과 String을 받아서 equals로 비교하여 결과를 Boolean 형태로 return
        BiFunction<String,String,Boolean> biFunction = String::equals;
        System.out.println(biFunction.apply("java","oracle"));
//        String str = "java";
//        System.out.println(str.equals("java"));

        Consumer<Object> objectConsumer = System.out::println;
        objectConsumer.accept("println 사용");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");

        forEach(subjects, /* 메소드 참조 */ System.out::println);
    }

    // List<? extends Object>: 와일드 카드 (ch11 참고)
    // extends super
    // extends ? ->
    // 상한제한 하한제한
    // extends 상한제한 -> Object 상위 타입은 받을 수 없다.
    // super 하한제한 -> Object 자식 타입은 받을 수 없다.
    // 반복할 객체 리스트를 받고, Consumer를 이용해서 출력
    private static void forEach(List<? extends Object> list /* List<Object> list => 와일드카드 없이도 가능 */, Consumer<Object> consumer){
        for (Object obj : list){
            consumer.accept(obj);
        }
    }
}

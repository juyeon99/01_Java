package com.ohgiraffers.section02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.function.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 표준 함수적 인터페이스
        * JDK 8 자주 사용되는 함수적 인터페이스를 표준 API로 제공
        * Consumer: 리턴값이 없는 accept()를 가지고 있다. (parameter 소비자 역할)
        * Supplier: parameter가 없고, 리턴값이 있는 getXXX()를 가지고 있다.
        * Function: parameter와 리턴값이 있는 applyXXX()를 가지고 있다. (parameter를 return 값으로 mapping)
        * Operator: Function과 똑같이 applyXXX()를 가지고 있는데, parameter로 연산을 한 후 통일된 타입으로 리턴
        * Predicate: parameter과 boolean값을 반환하는 testXXX()를 가지고 있다. (parameter를 활용해서 Boolean값 리턴)
        * */

        Runnable runnable = () -> System.out.println("hello");
        runnable.run();

        /* Consumer<T>#accept(T t) : void : 객체 T를 받아 소비 */
        Consumer<String> consumer = str -> System.out.println(str + "이(가) 출력됨");    // hello world이(가) 출력됨
        consumer.accept("hello world");

        /* BiConsumer<T,U>#accept(T t, U u) : void : 객체 T,U를 받아 소비 */
        BiConsumer<String,LocalTime> biConsumer = (str, time) -> System.out.println(str + "이(가) " + time + "에 출력됨");   // hello world이(가) 10:49:03.123159400에 출력됨
        biConsumer.accept("hello world", LocalTime.now());

        /* IntConsumer#accept(int value) : void : int값을 받아서 소비 */
        IntConsumer intConsumer = num -> System.out.println(num + "의 제곱은 " + (num * num) + "입니다.");
        intConsumer.accept(15);

        /* LongConsumer#accept(long value) : void : long값을 받아서 소비 */
        LongConsumer longConsumer = num -> System.out.println("입력하신 정수는 " + num + "입니다.");
        longConsumer.accept(12345);

        /* ObjIntConsumer<T>#accept(T t, int value) : void : 객체 T와 int값을 받아서 소비 */
        ObjIntConsumer<Random> objIntConsumer =
                (random, value) ->
                        System.out.println("0부터 " + value + " 전까지의 난수 발생: " + random.nextInt(value));
        objIntConsumer.accept(new java.util.Random(), 10);  // 0부터 10 전까지의 난수 발생

        /* ObjLongConsumer<T>#accept(T t, long value) : void : 객체 T와 long값을 받아서 소비 */
        ObjLongConsumer<LocalDate> objLongConsumer =
                (date, days) -> System.out.println(date + "의 " + days + "일 후의 날짜는 " + date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(), 10);

        /* ObjDoubleConsumer<T>#accept(T t, double value) : void : 객체 T와 double값을 받아서 소비 */
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값: "), -123.5);
    }
}

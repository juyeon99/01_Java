package com.ohgiraffers.section02;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {
    public static void main(String[] args) {
        // Supplier: parameter가 없고 return 값이 있는 getXXX()를 가지고 있다.

        /* Supplier<T>#get() : T : 객체 T를 return */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);

        /* BooleanSupplier#getAsBoolean() : boolean : boolean값을 return */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0 ? false : true;
        };
        System.out.println("랜덤 true or false: " + booleanSupplier.getAsBoolean());

        /* IntSupplier#getAsInt() : int : int값을 return */
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위를 던져서 나온 수: " + intSupplier.getAsInt());

        /* DoubleSupplier#getAsDouble() : double : double값을 return */
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴 값: " + doubleSupplier.getAsDouble());

        /* LongSupplier#getAsLong() : long : long값을 return */
        LongSupplier longSupplier = () ->
                new java.util.Date().getTime(); // 1970년 1월 1일 0시 0분 0초 이후 지난 시간
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간: " + longSupplier.getAsLong());
    }
}

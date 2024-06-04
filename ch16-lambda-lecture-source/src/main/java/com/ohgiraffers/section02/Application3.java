package com.ohgiraffers.section02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Application3 {
    public static void main(String[] args) {
        // Function: parameter와 리턴값이 있는 applyXXX()를 가지고 있다.

        /* Function<T,R>#apply(T t) : R : 객체 T를 R로 mapping */
        Function<String,Integer> function = (str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + ": " + function.apply(strValue).getClass().getName() /* getClass: Wrapper 타입의 클래스를 가져옴 */);   // 12345: java.lang.Integer

        /* BiFunction<T,U,R>#apply(T t, U u) : R : 객체 T와 U를 R로 mapping */
        BiFunction<String,String,Integer> biFunction =
                (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "67890";
        System.out.println(biFunction.apply(str1,str2) + ": " + biFunction.apply(str1,str2).getClass().getName());  // 80235: java.lang.Integer

        /* IntFunction<R>#apply(int value) : R : int를 R로 mapping */
        IntFunction<String> intFunction =
                (intValue) -> String.valueOf(intValue);
        int intValue = 123;
        System.out.println(intFunction.apply(intValue) + ": " + intFunction.apply(intValue).getClass().getName());  // 123: java.lang.String

        /* IntToDoubleFunction#applyAsDouble(int value) : double : int를 double로 mapping */

        /* IntToLongFunction#applyAsLong(int value) : long : int를 long으로 mapping */

        /* DoubleFunction<R>#apply(double value) : R : double을 R로 mapping */

        /* LongToDoubleFunction#applyAsDouble(long value) : double : long을 double로 mapping */

        /* LongToIntFunction#applyAsInt(long value) : int : long을 int로 mapping */

        /* ToDoubleBiFunction<T, U>#applyAsDouble(T t, U u) : double : 객체 T와 U를 double로 mapping */

        /* ToDoubleFunction<T>#applyAsDouble(T t) : double : 객체 T를 double로 mapping */

        /* ToIntBiFunction<T, U>#applyAsInt(T t, U u) : int : 객체 T와 U를 int로 mapping */

        /* ToIntFunction<T>#applyAsInt(T t) : int : 객체 T를 int로 mapping */

        /* ToLongBiFunction<T, U>#applyAsLong(T t, U u) : long : 객체 T와 U를 long으로 mapping */

        /* ToLongFunction<T>#applyAsLong(T t) : long : 객체 T를 long으로 mapping */
    }
}

package com.ohgiraffers.section02;

import java.util.function.*;

public class Application4 {
    public static void main(String[] args) {
        /*
        * Operator: parameter와 리턴값이 있는 applyXXX()를 가지고 있다.
        *           Function과 거의 유사하지만 다른점은 parameter를 이용해 연산을 한 후 동일한 타입으로 리턴해주는 것
        * */

        /* BinaryOperator<T>#apply(T t1, T t2) : T : T와 T를 연산하여 T를 리턴 */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello","world"));

        /* UnaryOperator<T>#apply(T t) : T : T를 연산하여 T를 리턴 */
        UnaryOperator<String> unaryOperator = (str) -> str + " world";
        System.out.println(unaryOperator.apply("hello"));

        /* DoubleBinaryOperator#applyAsDouble(double d1, double d2) : double : parameter 두 개를 이용하여 연산 후 double 타입으로 리턴 */

        /* DoubleUnaryOperator#applyAsDouble(double d) : double : parameter 한 개를 이용하여 연산 후 double 타입으로 리턴 */

        /* IntBinaryOperator#applyAsInt(int i1, int i2) : int : parameter 두 개를 이용하여 연산 후 int 타입으로 리턴 */

        /* IntUnaryOperator#applyAsInt(int i) : int : parameter 한 개를 이용하여 연산 후 int 타입으로 리턴 */

        /* LongBinaryOperator#applyAsLong(long l1, long l2) : long : parameter 두 개를 이용하여 연산 후 long 타입으로 리턴 */

        /* LongUnaryOperator#applyAsLong(long l) : long : parameter 한 개를 이용하여 연산 후 long 타입으로 리턴 */
    }
}

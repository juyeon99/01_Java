package com.ohgiraffers.section1.literal;

public class Application2 {
    public static void main(String[] args) {
        // 수업 목표: 값을 직접 연산하여 출력 할 수 있다.
        // 이 때 값의 형태에 따라 사용 할 수 있는 연산자의 종류와 연산의 결과가 달라진다.

        // 정수와 정수의 연산
        System.out.println("============= 정수와 정수의 연산 =============");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        // 실수와 실수의 연산
        System.out.println("\n============= 실수와 실수의 연산 =============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);    // 계산의 결과는 실수 형태로 나온다.
        System.out.println(1.23 * 10);
        System.out.println(1.23 / 10);
        System.out.println(1.23 % 1.0);

        // 정수와 실수의 연산
        // 정수와 실수를 연산 하면 결과는 항상 실수
        System.out.println("\n============= 정수와 실수의 연산 =============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 문자와 문자의 연산
        // 문자는 내부적으로 ASCII코드 숫자로 인식
        System.out.println("\n============= 문자와 문자의 연산 =============");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        // 문자와 정수의 연산
        System.out.println("\n============= 문자와 정수의 연산 =============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 10);
        System.out.println('a' / 10);
        System.out.println('a' % 10);

        // 문자와 실수의 연산
        // 결과는 실수의 형태로 출력
        System.out.println("\n============= 문자와 실수의 연산 =============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 10.0);
        System.out.println('a' / 10.0);
        System.out.println('a' % 10.0);

        /*
            결론은 문자는 내부적으로 숫자 취급을 한다.
         */

        // 문자열과 문자열의 연산
        System.out.println("\n============= 문자열과 문자열의 연산 =============");
        System.out.println("hello" + " world");

        // 문자열과 다른 형태의 값 연산
        System.out.println("\n============= 문자열과 다른 형태의 값 연산 =============");
        System.out.println("juyeon" + 123);     // 정수와의 연산
        System.out.println("juyeon" +123.456);  // 실수와의 연산
        System.out.println("juyeon" + 'a');     // 문자와의 연산
        System.out.println("juyeon" + true);    // 논리값과의 연산

        System.out.println("123" + "456");  // 문자열 합치기

        // 논리값 끼리의 연산은 모든 연산자 사용이 불가능
        // 논리값과 정수/실수/문자의 연산도 불가능
//        System.out.println(true + false);

        // 논리값과 문자열의 연산
        System.out.println("\n============= 논리값과 문자열의 연산 =============");
        System.out.println(true + "a");
    }
}

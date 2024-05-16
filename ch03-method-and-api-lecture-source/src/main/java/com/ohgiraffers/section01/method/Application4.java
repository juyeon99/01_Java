package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        /* 여러개의 전달인자를 이용한 메소드의 호출 테스트 */
        Application4 app4 = new Application4();
        String name = "jenny";
        int age = 20;
        char gender = 'f';

        app4.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender /*변하지 않는 값*/){
        System.out.println(
                "당신의 이름은 " + name + "이고, 나이는 " + age +
                        "세 이며, 성별은 " + gender + "입니다."
        );
    }
}

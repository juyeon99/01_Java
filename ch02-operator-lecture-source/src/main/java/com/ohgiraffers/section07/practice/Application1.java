package com.ohgiraffers.section07.practice;

public class Application1 {
    public static void main(String[] args) {
        // 1. 변수 a가 15이고, b가 4일 때, a / b의 결과를 구하세요.
        int a = 15; int b = 4;
        System.out.println("1. a / b = " + (a/b));

        // 2. 두 수 8과 3에 대해 나머지 연산을 수행하는 코드를 작성하세요.
        System.out.println("2. " + (8 % 3));

        // 3. 5 * 2 - 3을 계산하고 결과를 출력하는 코드를 작성하세요.
        System.out.println("3. " + (5 * 2 - 3));

        // 4. 변수 x가 10일 때, x += 5의 결과는 얼마인가요?
        int x = 10;
        System.out.println("4. " + (x += 5));

        // 5. 변수 y가 20일 때, y /= 4의 결과를 구하세요.
        int y = 20;
        System.out.println("5. " + (y /= 4));

        // 6. 변수 z가 8이고, z %= 3을 수행한 후의 z의 값을 구하세요.
        int z = 8;
        System.out.println("6. " + (z %= 3));

        // 7. 변수 i가 0일 때, i++ 후의 i의 값을 출력하세요.
        int i = 0;
        i++;
        System.out.println("7. " + i);

        // 8. int j = 10; 선언 후 -j의 결과를 출력하세요.
        int j = 10;
        System.out.println("8. " + (j * (-1)));

        // 9. int k = 5; 선언 후 k 값을 증가시키고, 증가된 값을 출력하는 코드를 작성하세요.
        int k = 5;
        System.out.println("9. " + ++k);

        // 10. 두 변수 num1 = 10, num2 = 20이 같은지 비교하는 코드를 작성하세요.
        int num1 = 10;
        int num2 = 20;
        if (num1 == num2){
            System.out.println("10. same");
        } else{
            System.out.println("10. diff");
        }

        // 11. 15가 10보다 큰지 확인하는 Java 코드를 작성하세요.
        if (15 > 10){
            System.out.println("11. bigger");
        } else{
            System.out.println("11. smaller");
        }

        // 12. 변수 age가 18 이상인지 확인하는 조건문을 작성하세요.
        int age = 30;
        if (age >= 18){
            System.out.println("12. older than or equal to 18");
        } else{
            System.out.println("12. younger than 18");
        }

        // 13. 변수 a = true, b = false일 때, 둘 다 참이어야 참을 반환하는 조건문을 작성하세요.
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("13. " + (bool1 && bool2));

        // 14. int age = 20;이 18 이상이면서 65 미만인지 확인하는 코드를 작성하세요.
        age = 20;
        System.out.println("14. " + (age >= 18 && age < 65));

        // 15. 변수 x = 10, y = 20일 때, x가 10이 아니거나 y가 25 이상인지 확인하는 코드를 작성하세요.
        x = 10;
        y = 20;
        System.out.println("15. " + (x != 10 && y >= 25));
    }
}

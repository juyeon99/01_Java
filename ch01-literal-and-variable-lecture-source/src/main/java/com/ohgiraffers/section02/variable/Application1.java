package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 변수의 사용목적
        * 1. 값에 의미를 부여하기 위한 목적 (의미 전달이 쉬워야 코드를 읽기 쉬워지고,
        *    협업 및 유지보수에 유리하기 때문)
        * 2. 한 번 저장해둔 값을 재사용하기 위한 목적 (변수를 이용하여 코드를 작성하면,
        *    값을 변경할 때도 보다 간편하게 변경할 수 있다.
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다. (변수는 변하는 값을 저장하기 위한 공간이다.)
        * */

        System.out.println("=========== 값에 의미 부여 테스트 ===========");
        System.out.println("보너스를 포함한 급여: " + (3000000 + 200000) + "원");
        int salary = 3000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여: " + (salary + bonus) + "원");

        System.out.println("\n=========== 변수에 저장한 값 재사용 테스트 ===========");
        // 10명의 고객에게 100 포인트를 지급
        System.out.println("1번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("6번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("7번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("8번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("9번 고객에게 100 포인트를 지급하였습니다.");
        System.out.println("10번 고객에게 100 포인트를 지급하였습니다.");

        int point = 100;
        System.out.println("\n=========== 변수를 사용해서 출력 ===========");
        System.out.println("1번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("6번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("7번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("8번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("9번 고객에게 " + point + " 포인트를 지급하였습니다.");
        System.out.println("10번 고객에게 " + point + " 포인트를 지급하였습니다.");

        System.out.println("\n=========== 변수에 저장한 값 변경 테스트 ===========");
        // 변수는 하나의 값을 저장하고 사용하기 위한 공간이기 보다, 변하는 값을 저장하기 위한 공간이다.
        int sum = 0;
        sum = sum + 10;
        System.out.println("sum + 10 = " + sum);

        sum = sum + 10;
        System.out.println("sum + 10 = " + sum);


        System.out.println("\n====================================================");
    }
}

package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        /*
        return

        모든 메소드의 내부에는 return; 이 존재한다.
        void method의 경우, 컴파일러가 마지막줄에 자동으로 추가해줌.
        return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가라는 명령어.
         */

        System.out.println("main() 시작됨...");

        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main() 종료됨...");
    }

    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        return;
//        System.out.println("return 후");
    }
}

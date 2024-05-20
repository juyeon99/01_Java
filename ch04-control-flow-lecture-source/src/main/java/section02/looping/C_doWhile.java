package section02.looping;

import java.util.Scanner;

public class C_doWhile {
    public void testSimpleDoWhileLoop(){
        do{
            System.out.println("최소 한번은 동작함");
        } while (false);
        System.out.println("반복문 종료");
    }

    public void testDoWhileExample1(){
        Scanner sc = new Scanner(System.in);
        String str = "";

        do{
            System.out.print("문자열 입력: ");
            str = sc.nextLine();
            System.out.println(str);
        } while (!str.equals("exit") /* String은 ==로 비교 불가 */);
        System.out.println("프로그램 종료");
    }

}
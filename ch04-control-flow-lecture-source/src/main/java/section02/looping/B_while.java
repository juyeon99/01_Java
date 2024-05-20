package section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileLoop(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println();

        i = 10;
        while (i >= 1){
            System.out.println(i);
            i--;
        }
    }

    public void testWhileExample1(){
        // 입력한 문자열의 인덱스를 이용해서 문자 하나씩 출력
        /*
        * charAt(n): 문자열에서 n번째 문자를 char형으로 반환
        * length():  문자열의 길이를 int로 반환
        *
        * index: 0 ~ n-1
        *        존재하지 않는 인덱스에 접근하면 StringIndexOutOfBoundsException이 발생
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();

        System.out.println("=========== for 문 ===========");
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i + ": " + ch);
        }

        System.out.println("\n=========== while 문 ===========");
        int i = 0;
        while (i < str.length()){
            char ch = str.charAt(i);
            System.out.println(i++ + ": " + ch);
        }
    }

    public void testWhileExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i++;
        }
        System.out.println("sum = " + sum);
    }

    // nested while
    public void testWhileExample3(){
        int dan = 2;
        while (dan < 10){
            int n = 1;
            while (n < 10){
                System.out.println(dan + " * " + n + " = " + dan*n++);
            }
            dan++;
            System.out.println();
        }
    }
}

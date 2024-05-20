package section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForLoop(){
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    public void testForExample1(){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생 이름 입력: ");
            String name = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + name + "입니다.");
        }
    }

    public void sum(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void sumRandNums(){
        int rand = (int) (Math.random() * 6) + 5;
        int sum = 0;
        for (int i = 1; i <= rand; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void sumInput(){
        /*
        * 두개의 숫자를 입력받아 작은수에서 큰수까지의 합계를 구하시오
        * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 조건
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Second Number: ");
        int secondNum = sc.nextInt();

        while (firstNum == secondNum) {
            System.out.println("\nInput numbers should be different.");
            System.out.print("First Number: ");
            firstNum = sc.nextInt();
            System.out.print("Second Number: ");
            secondNum = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        if(firstNum < secondNum){
            i = firstNum;
            j = secondNum;
        } else {
            i = secondNum;
            j = firstNum;
        }

        int sum = 0;
        for (; i <= j; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }

    public void printSimpleGugudan(){
        /*
        * 키보드로 2~9사이의 숫자를 입력받아
        * 2~9 사이인경우 해당 단의 구구단을 출력하고
        * 그렇지 않은 경우 "반드시 2~9 사이의 숫자를 입력해야 합니다." 출력
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수를 입력하세요: ");
        int dan = sc.nextInt();
        while (dan < 2 || dan > 9){
            System.out.println("반드시 2~9 사이의 숫자를 입력해야 합니다.\n");
            System.out.print("출력할 구구단의 단 수를 입력하세요: ");
            dan = sc.nextInt();
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}

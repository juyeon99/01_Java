package section01.conditional;

import java.util.Scanner;

public class A_If {
    public void testSimpleIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("even num");
        }
        System.out.println("exit");
    }

    public void testNestedIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num > 0){
            if (num % 2 == 0){
                System.out.println("positive & even num");
            }
        }
        System.out.println("exit");
    }
}
package section01.conditional;

import java.util.Scanner;

public class B_IfElse {
    public void testSimpleIfElseStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
        System.out.println("exit");
    }

    public void testNestedIfElseStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(num != 0){
            if(num > 0){
                System.out.println("positive");
            } else{
                System.out.println("negative");
            }
        } else{
            System.out.println("0");
        }
        System.out.println("exit");
    }
}

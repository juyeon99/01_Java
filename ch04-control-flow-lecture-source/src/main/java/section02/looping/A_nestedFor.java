package section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNine(){
        for(int i = 2; i < 10; i++){
            System.out.println("===== " + i + "단 =====");
            for(int j = 1; j < 10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println("===============\n");
        }
    }

    public void printUpgradedGugudanFromTwoToNine(){
        for(int i = 2; i < 10; i++){
            printGugudanOf(i);
            System.out.println();
        }
    }

    // 한 단씩 구구단을 출력하는 메소드
    public void printGugudanOf(int dan){
        System.out.println("===== " + dan + "단 =====");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + dan*i);
        }
    }

    /*
    * 키보드로 정수를 하나 입력받아 정수만큼 한 행에 "*"를 5개씩 출력
    * */
    public void printStarInputRowTimes(){
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++){
            printStar(5);
        }
    }

    public void printStar(int n){
        for (int j = 0; j < n; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void printTriangleStars(){
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄의 수: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleStarsInReverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄의 수: ");
        int row = sc.nextInt();

        for (int i = row; i >= 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printSymTriangleStars(){
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄의 수: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 0; j < row-i; j++){
                System.out.print(" ");
            }
            for (int j = row-i; j < row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPyramidTriangleStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄의 수: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 0; j < row-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

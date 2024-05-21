package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /*
        * 5명의 자바 점수를 정수로 입력받아 합계와 평균을 실수로 구하는 프로그램
        * */

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter the score: ");
            int score = sc.nextInt();
            scores[i] = score;
            sum += score;
        }
        System.out.println("합계: " + sum +"\n평균: " + (double)sum/scores.length);
    }
}

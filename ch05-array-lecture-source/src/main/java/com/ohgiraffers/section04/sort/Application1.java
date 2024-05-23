package com.ohgiraffers.section04.sort;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4};

        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("========== num1과 num2 exchange ==========");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] arr2 = {2,1,3};
        int temp2;
        temp2 = arr2[0];
        arr2[0] = arr2[1];
        arr2[1] = temp2;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

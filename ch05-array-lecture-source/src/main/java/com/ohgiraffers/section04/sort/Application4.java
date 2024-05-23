package com.ohgiraffers.section04.sort;

public class Application4 {
    public static void main(String[] args) {
        // bubble sort
        /*
        * 인접한 두 개의 숫자를 검사하여 정렬하는 방법
        * 구현이 쉽고 어느정도 정렬된 데이터를 정렬할 때 빠름
        * */
        // {6,5,4,3,2,1} => 역순으로 되어있을 때 worst case

        int[] arr = {2,5,4,6,1,3};
        int temp;
        for (int i = arr.length-1; i >= 0; i--) {
            // 바로 옆에 있는 수 비교
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

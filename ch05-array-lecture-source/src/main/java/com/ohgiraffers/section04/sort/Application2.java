package com.ohgiraffers.section04.sort;

public class Application2 {
    public static void main(String[] args) {
        // 순차정렬 sequential sort
        // 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 알고리즘

        int[] arr = {2,5,4,6,1,3};
        for (int i = 1; i < arr.length; i++) {  // no need to sort the first element
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

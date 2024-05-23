package com.ohgiraffers.section04.sort;

public class Application3 {
    public static void main(String[] args) {
        // 선택정렬 selection sort

        /*
        * 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
        * 데이터의 양이 적을 때 좋은 성능이 나타난다. (교환횟수가 적음)
        * 하지만 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에
        * 100개 이항의 자료에서는 급격하게 속도가 떨어짐
        * */

        int[] arr = {2,5,4,6,1,3};
        int min;    // 최소값을 가진 데이터의 인덱스
        int temp;

        for (int i = 0; i < arr.length; i++) {
            min = i;

            // 해당 인덱스의 다음 인덱스부터 끝까지 반복
            // min 값의 index를 찾는다
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            // 찾은 index를 왼쪽에서부터 값을 교환해준다
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}

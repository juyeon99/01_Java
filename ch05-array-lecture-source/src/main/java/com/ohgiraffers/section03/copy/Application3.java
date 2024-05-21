package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /*
        * deep copy
        *
        * heap에 생성된 array가 가지고 있는 값을 또 다른 array에 복사해놓은 것
        * 서로 다른 값을 가지고 있지만, 두 array는 서로 다른 array이므로
        * 하나의 array의 값을 변경해도 다른 array에 영향을 주지 X
        * */

        /*
        * deep copy 방법
        *
        * 1. for loop
        * 2. Object의 clone()
        * 3. System의 arrayCopy()
        * 4. Array의 copyOf()   =====> 가장 많이 사용
        *
        * clone() 이전 array와 같은 array밖에 만들 수 없음.
        * -> clone() 이외 다른 복사 방법은 array length 조절 가능
        * */

        int[] originalArr = new int[] {1,2,3,4,5};
        print(originalArr);

        // 1. for loop
        int[] copiedArr = new int[10];
        for (int i = 0; i < originalArr.length; i++) {
            copiedArr[i] = originalArr[i];
        }
        // 원본 array와 같은 값을 가지고 있지만, 나머지 인덱스는 다른 값.
        // hashcode (address)가 다름
//        print(copiedArr);


        // 2. Object의 clone()
        int[] copiedArr2 = originalArr.clone();
//        print(copiedArr2);


        // 3. System의 arrayCopy()
        int[] copiedArr3 = new int[10];
        // 원본 array, 복사를 시작할 index, 복사본 array, 복사를 시작할 index, length
        System.arraycopy(originalArr, 0, copiedArr3, 3, originalArr.length);
//        print(copiedArr3);

        // 4. Array의 copyOf()
        // 시작인덱스부터 원하는 길이만큼 복사 가능
        int[] copyArr4 = Arrays.copyOf(originalArr, 9);
        print(copyArr4);    // 복사한 만큼의 값은 같지만, 길이도 다르고, 주소도 다르다.

    }

    public static void print(int[] arr){
        System.out.println("hashcode: " + arr.hashCode());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

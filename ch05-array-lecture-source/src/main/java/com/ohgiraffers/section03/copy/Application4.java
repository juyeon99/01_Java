package com.ohgiraffers.section03.copy;

public class Application4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1.clone();

        for(int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("========향상된 for 문=======");
        for(int i : arr2) {
            i += 10;
        }

        System.out.println("====== 10씩 더한 후 출력 ======");
        for(int i : arr2) {
            System.out.print(i + " ");  // 값 변경 X
        }

        /*
        * 주의:
        * enhanced for loop은 array에 index에 차례로 접근할 때에는 편하게 사용할 수 있지만, 값변경은 불가능하다.
        * 대신, 값을 변경하는것이 아니고, 사용하는 것이 목적이라면 조금 더 편하게 사용 가능하다.
        * */
    }
}

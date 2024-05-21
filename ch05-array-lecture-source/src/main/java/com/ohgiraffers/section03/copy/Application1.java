package com.ohgiraffers.section03.copy;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 배열의 복사
        *
        * 1. shallow copy: stack의 address만 복사
        * 2. deep copy:    heap의 array에 저장된 값을 복사
        * */

        /*
        * shallow copy
        *
        * Stack에 저장되어있는 array의 address만 복사
        * 복사된 두 개의 reference variable은 동일한 array address를 가짐
        * 하나의 reference variable에 저장된 address를 가지고 array의 값을 수정하게 되면
        * 다른 ref var로 array에 접근했을 때도 값이 변경됨
        * */

        // 원본 배열
        int[] originalArr = {1,2,3,4,5};
        int[] copiedArr = originalArr;

        System.out.println("originalArr hashcode: " + originalArr.hashCode());
        System.out.println("copiedArr hashcode:   " + copiedArr.hashCode());

        for (int i = 0; i < originalArr.length; i++) {
            System.out.println("originalArr[" + i + "] = " + originalArr[i]);
        }
        System.out.println();

        originalArr[0] = 99;
        for (int i = 0; i < copiedArr.length; i++) {
            System.out.println("copiedArr[" + i + "] = " + copiedArr[i]);
        }
        System.out.println();
    }
}

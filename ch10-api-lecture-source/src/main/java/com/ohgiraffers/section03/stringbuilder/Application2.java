package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    // StringBuilder에서 자주 사용하는 메소드
    public static void main(String[] args) {
        /*
        * delete(): 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분 제거
        * deleteCharAt(): 문자열 인덱스를 이용해서 문자 하나 제거
        * => 둘 다 원본에 영향 O
        * */

        StringBuilder sb = new StringBuilder("javaoracle");

        System.out.println("sb = " + sb);
        System.out.println("delete(): " + sb.delete(2,5));
        System.out.println("sb = " + sb);
        System.out.println("deleteCharAt(): " + sb.deleteCharAt(2));
        System.out.println("sb = " + sb);
    }
}

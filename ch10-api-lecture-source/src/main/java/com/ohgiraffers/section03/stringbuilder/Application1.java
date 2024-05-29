package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {
        /*
        * String과 StringBuilder
        * String: 불변이라는 특성
        *         문자열에 + 연산으로 합치면 기존 인스턴스를 수정하는 것이 아니라 새로운 인스턴스 반환
        *         문자열 변경이 자주 일어나는 경우 성능 면에서 좋지 않음
        *         하지만, 변하지 않는 문자열을 자주 읽어들이는 경우에는 오히려 더 좋은 성능
        *
        * StringBuilder: 가변이라는 특성
        *                문자열에 append()를 이용해 합치는 경우
        *                기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 만들지 않음
        *                따라서 잦은 문자열 변경이 일어나는 경우 String보다 성능이 좋음
        * */

        /*
        * StringBuilder: thread 동기화 기능 제공 X
        *                thread 동기화 처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음
        *
        * StringBuffer: thread 동기화 기능 제공 O
        *               성능 면에서 StringBuilder보다는 느림.
        * */

        // StringBuilder 인스턴스 생성
        StringBuilder sb = new StringBuilder("java");

        System.out.println("sb = " + sb);

        /*
        * hashCode는 오버라이딩 안되어있음
        * => 인스턴스 자체가 동일해야만 같은 해시코드 반환 (동일한 값만 가지는 경우는 X)
        * */
        System.out.println("sb의 hashCode: " + sb.hashCode());   // 603742814
        sb.append("oracle");
        System.out.println("sb = " + sb);
        System.out.println("sb의 hashCode: " + sb.hashCode());   // 603742814
        // => StringBuilder는 문자열을 변경해도 새로운 인스턴스가 생성되지 X
    }
}

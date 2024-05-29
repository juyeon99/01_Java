package com.ohgiraffers.section08.initblock;

public class Application {
    public static void main(String[] args) {
        /*
        * 초기화 블럭
        * 복잡한 초기화를 수행 할 수 있는 블럭을 제공, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분
        *
        * 1. 인스턴스 초기화 블럭
        *   : 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행된다.
        *     인스턴스를 호출하는 시점마다 호출이 된다.
        *     인스턴스 변수를 초기화하며 정적필드에서는 실행시점마다 값을 덮어쓴다.
        * // 인스턴스 초기화 블럭 사용법
        * {
        *   // 초기화 내용 작성
        * }
        *
        * 2. 정적 초기화 블럭
        *   : 클래스가 로드될 때 한 번 동작한다.
        *     정적 필드를 초기화 하며, 인스턴스 변수는 초기화 하지 못한다.
        * // 정적 초기화 블럭 사용법
        * static {
        *   // 초기화 내용 작성
        * }
        * */

        // 인스턴스 생성
        // Product product = new Product();

        // 자료형별 기본값으로 초기화된 내용 확인
        // System.out.println(product.getInformation());

        // 명시적 초기화로 필드 초기화
        // System.out.println(product.getInformation());

        // 초기화블럭으로 필드 초기화
        // System.out.println(product.getInformation());

        // 매개변수 있는 생성자를 이용한 초기화 확인
        Product product = new Product("대륙폰", 30000, "샤오미");
        System.out.println(product.getInformation());

        /*
        * 초기화의 순서
        * 인스턴스 변수 : 기본값 -> 명시적초기값 -> 인스턴스초기화블럭 -> 생성자
        * 클래스 변수 : 기본값 -> 명시적초기값 -> 정적초기화블럭 -> 인스턴스초기화블럭 -> 생성자
        * */
    }
}

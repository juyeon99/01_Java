package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {

        /*
        * singleton pattern
        *
        * 어플리케이션이 실행될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고
        * 그 때 메모리에 인스턴스를 만들어서 하나의 인스턴스를 공유해서 사용하며
        * 메모리 낭비를 방지 할 수 있게 함. (매번 인스턴스를 생성하지 않음)
        * 장점.
        * 1. 첫번째 이용시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
        *    두번째 이용시에는 인스턴스 생성 시간 없이 사용할 수 있다.
        * 2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증 할 수 있다.
        * 단점.
        * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
        * 2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
        * */

        /*
        * 싱글톤 구현
        * 1. 이른 초기화 (Eager Initialization)
        * 2. 게으른 초기화 (Lazy Initialization)
        * */

        //EagerSingleton eager = new EagerSingleton(); 생성자가 private 이기 때문에 접근불가

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1의 hashCode : " + eager1.hashCode());
        System.out.println("eager2의 hashCode : " + eager2.hashCode());

        // 2. 게으른 초기화
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1의 hashCode : " + lazy1.hashCode());
        System.out.println("lazy2의 hashCode : " + lazy2.hashCode());

        /*
        * 이른 초기화를 사용하면 처음 인스턴스 반환 요청에서 속도가 빠르다.
        * 하지만 클래스를 로드하는 속도가 느리다.
        * 게으른 초기화를 사용하면 첫 번째 요청에 대한 속도가 두 번째 요청에 대한
        * 속도보다 느리다.
        * 하지만 클래스를 로드하는 속도는 빠르다.
        * */


    }
}

package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /*
        * super: 자식클래스를 이용해서 객체를 생성할 때 부모 generator를 호출하여
        *        부모 클래스의 인스턴스도 함께 생성하게 된다.
        *        이때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수.
        *
        * super(): 부모 generator를 호출. 인자와 parameter의 타입, 개수, 순서가 일치하는 부모 generator를 호출
        *          this()가 해당 클래스 내의 다른 generator를 호출하는 구문이라면
        *          super()은 부모 클래스가 가지는 private generator를 제외한 나머지 generator를 호출할 수 있도록 한 구문
        * */

        // Product -> Computer
        // Product def constructor
//        Product product1 = new Product();
//        System.out.println(product1.getInfo());

//        Product product2 = new Product("S-01234","삼성","갤럭시Z폴드4",2398000, new Date());
//        System.out.println(product2.getInfo());

        // Computer def constructor
//        Computer computer1 = new Computer();
//        System.out.println(computer1.getInfo());

//        Computer computer2 = new Computer("퀄컴 스냅드래곤",512,12,"안드로이드");
//        System.out.println(computer2.getInfo());

        Computer computer3 = new Computer("S-01234","삼성","갤럭시Z폴드4",2398000,new java.util.Date(),"퀄컴 스냅드래곤",512,12,"안드로이드");
        System.out.println(computer3.getInfo());
    }
}

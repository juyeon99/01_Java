package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {
    // Object의 equals()
    public static void main(String[] args) {
        /*
        * equals()
        *
        * equals()는 parameter로 전달받은 인스턴스와 == 연산하여 true/false 반환
        * 동일한 인스턴스인지 비교하는 기능
        *
        * 동일객체, 동등객체
        * 동일객체: 주소가 동일한 인스턴스
        * 동등객체: 주소는 다르더라도 필드값들이 동일한 객체
        * */

        // equals()의 기본기능은 동일객체 판단
        // => 동일한 필드값을 가지는 객체를 같은 객체로 판단할 수 있도록 하고싶은 경우가 생긴다.
        // => Override를 통해 각각의 필드가 동일한 값을 가지는지 확인 가능

        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1,"홍길동전","허균",50000);
        System.out.println("두 인스턴스의 == 연산 비교: " + (book1 == book2));      // 주소값 비교
        System.out.println("두 인스턴스의 == 연산 비교: " + (book1.equals(book2))); // override한 후
    }
}

package com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Date 클래스 => 대부분의 method가 deprecated
        *
        * Date는 java.sql.Date와 java.util.Date가 존재
        * 한 클래스에서 두 개의 타입을 전부 사용하게 되면 import를 하더라도
        * 사용하는 타입이 어느 패키지 Date클래스인지 모호하므로 플 클래스 네임을 작성해줘야 함
        * */

        // 1. def constructor 사용 방법
        // def constructor로 인스턴스를 생성하게 되면 OS의 날짜/시간 정보를 이용해 인스턴스를 만들게 된다
        Date today = new Date();
        System.out.println(today);

        // 2. Date(Long date) 사용 방법
        // getTime(): 1970.01.01 0시 0분 0초 이후 지난 시간을
        //            millisecond로 계산하여 long타입으로 반환
        System.out.println(today.getTime());

        Date time = new Date(1716962242071L);
        System.out.println(time);
    }
}

package com.ohgiraffers.section06.time;

import java.time.*;

public class Application1 {
    public static void main(String[] args) {
        // time 패키지 => Date, Calendar가 가지고 있는 단점을 해소하기 위해 탄생
        /*
        * LocalTime, LocalDate, LocalDateTime, ZonedDateTime 클래스들이 있다.
        * */

        /*
        * LocalTime
        *
        * 시간을 표현하는 클래스
        * - 시, 분, 초, 나노초
        * - 날짜 정보 포함 X
        * - 14:30:15.123
        * */
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalTime timeOf = LocalTime.of(15,25,1);
        System.out.println("timeOf = " + timeOf);

        /*
        * LocalDate
        *
        * 날짜를 표현하는 클래스
        * - 연도, 월, 일
        * - 시간 정보 포함 X
        * - 2024-05-29
        * */
        LocalDate dateNow = LocalDate.now();
        System.out.println("date = " + dateNow);
        LocalDate dateOf = LocalDate.of(2024,5,29);
        System.out.println("date = " + dateOf);

        /*
        * ZonedDateTime
        *
        * 날짜와 시간, 시간대를 함께 포함하는 클래스
        * - 연도, 월, 일, 시, 분, 초, 시간대
        * - 2024-05-29T15:27:52.986837500+09:00[Asia/Seoul]
        * */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf,timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);

        /*
        * LocalDateTime
        *
        * 날짜와 시간을 함께 포함하는 클래스
        * - 연도, 월, 일, 시, 분, 초, 나노초
        * - 2024-05-29T14:30:15.123
        * */
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);
        LocalDateTime localDateTimeOf = LocalDateTime.of(2024,5,9,9,30,15,123000000);
        System.out.println("localDateTimeOf = " + localDateTimeOf);
    }
}

package com.ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {
        /*
         * Calendar 클래스를 이용한 인스턴스 생성 방법에는 두 가지 방법이 있다.
         * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
         * 2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법
         * */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.toString());

        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        // month 1 ~ 12
        // 0 ~ 11

        int year = 2024;
        int month = 2;  // 월은 0 ~ 11월로 사용 2는 3월
        int dayOfMonth = 4;
        int hour = 13;
        int min = 1;
        int second = 0;

        Calendar startDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);

        Date date = new Date(startDay.getTimeInMillis());
        System.out.println(date);

        int startYear = startDay.get(1);
        int startMonth = startDay.get(2);
        int startDayOfMonth = startDay.get(5);

        System.out.println(startYear);
        System.out.println(startMonth);
        System.out.println(startDayOfMonth);

        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DATE);

        System.out.println("year : " + startDay.get(Calendar.YEAR));
        System.out.println("month : " + startDay.get(Calendar.MONTH));  // 0 ~ 11월
        System.out.println("dayOfMonth : " + startDay.get(Calendar.DATE));

        /* 요일 : 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7) 를 의미 */
        System.out.println("dayOfWeek : " + startDay.get(Calendar.DAY_OF_WEEK));

        String day = "";
        switch (startDay.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY : day = "일"; break;
            case Calendar.MONDAY : day = "월"; break;
            case Calendar.TUESDAY : day = "화"; break;
            case Calendar.WEDNESDAY : day = "수"; break;
            case Calendar.THURSDAY : day = "목"; break;
            case Calendar.FRIDAY : day = "금"; break;
            case Calendar.SATURDAY : day = "토"; break;
        }
        System.out.println("요일 : " + day);

        System.out.println("amPm : " + startDay.get(Calendar.AM_PM));  // 0 오전, 1은 오후
        System.out.println("hourOfDay : " + startDay.get(Calendar.HOUR_OF_DAY));  // 24시간 체계
        System.out.println("hour : " + startDay.get(Calendar.HOUR));                // 12시간 체계
    }
}

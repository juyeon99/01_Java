package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 형변환 보조 스트림
        *
        * 기본(기반) 스트림이 byte기반 스트림이고, 보조(필터) 스트림이 char 기반 스트림인 경우 사용
        * */

        /*
        * 표준 스트림
        *
        * 자바에서 콘솔이나 키보드 같은 표준 입출력 장치로부터 데이터를 입출력하기 위한 스트림 제공
        * System class의 필드 in, out, err가 대상 데이터에 스트림을 의미
        * System.in (InputStream): 콘솔로부터 데이터를 입력받음
        * System.out (PrintStream): 콘솔로 데이터 출력
        * System.err (PrintStream): 콘솔로 데이터 출력
        * */

        /*
        * System.in을 InputStreamReader로 변환 (byte 기반 스트림 -> 문자 기반 스트림)
        * Buffered를 이용한 보조스트림과 연결
        * */

        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in /* byte 기반 스트림 -> 문자 기반 스트림 */));

        System.out.print("String 입력: ");
        try {
            String str = breader.readLine();

            System.out.println("str: " + str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (breader != null){
                try {
                    breader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bwriter.write("java mysql jdbc");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bwriter != null){
                try {
                    bwriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

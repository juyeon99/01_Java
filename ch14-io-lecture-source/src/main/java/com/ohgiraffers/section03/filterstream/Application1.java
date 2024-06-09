package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {
    // BufferedWriter & BufferedReader
    public static void main(String[] args) {
        /*
        * java.io 패키지의 입출력 스트림은 기본(기반) 스트림과 필터(보조) 스트림으로 분류
        * 주로 성능을 향상시키는 목적으로 사용
        * 기본 스트림: 외부 데이터에 직접 연결되는 스트림
        * 필터 스트림: 기본 스트림에 추가로 사용 가능한 스트림
        *            constructor의 parameter로 다른 스트림을 이용하는 클래스
        * */

        // BufferedWriter
        BufferedWriter bwriter = null;
        try {
            bwriter = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            bwriter.write("안녕하세요");
            bwriter.write(10);
            bwriter.write("반갑습니다.");

            // buffer를 이용하는 경우 buffer가 가득차지 않는 상태에서 내보낼 때
            // flush로 강제 내보내기 가능
//            bwriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bwriter != null){
                try {
                    // close를 호출하면 내부적으로 flush()를 하고나서 resource 반납
                    bwriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // BufferedReader
        // buffer에 미리 읽어온 후, 한 줄 단위로 읽어들이는 기능 제공
        // => 기존 스트림보다 성능 개선
        BufferedReader breader = null;
        try {
            breader = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            String temp;

            // readLine(): buffer의 한 줄을 읽어와서 String으로 반환
            while ((temp = breader.readLine()) != null){
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(breader != null){
                try {
                    breader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

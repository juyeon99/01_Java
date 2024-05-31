package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Properties
        *
        * HashMap을 구현하여 사용용법이 거의 유사
        * key, value 모두 String만 사용 가능
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용
        * */
        Properties prop = new Properties();

        // 값을 추가
        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user","student1");
        prop.setProperty("password","pw");
        System.out.println("prop: " + prop);

        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");   // driver.dat 생성
            prop.store(new FileWriter("driver.txt"),"jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");  // 지금은 잘 안쓰이지만 유지보수 위해 쓰이는 경우
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop2 = new Properties();
        try {
            prop2.load(new FileInputStream("driver.dat")); // driver.dat 파일 읽어오기
            prop2.load(new FileReader("driver.txt"));    // prop2에 파일 내용 덮어씌움
            prop2.loadFromXML(new FileInputStream("driver.xml")); // prop2에 파일 내용 덮어씌움
            System.out.println("prop2: " + prop2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

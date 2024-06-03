package com.ohgiraffers.section03.use;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {
    // io 패키지에서 예외처리
    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            // FileReader라는 클래스에 FileNotFoundException을
            // throw 해놓아서 try-catch로 예외처리 필요
            in = new BufferedReader(new FileReader("test.dat"));

            // 파일 읽어서 저장할 String
            String str;

            // 파일을 한줄씩 읽어서 출력
            while ((str = in.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            // IOException
            // In-Out Exception 클래스
            // catch 블럭은 여러개 작성할 때, 상위 타입이 하단에 오고, 후손타입이 상단에 온다.
            throw new RuntimeException(e);
        } finally {
            /*
            * finally
            *
            * 예외 처리 구문과 상관없이 반드시 수행하는 경우 작성
            * 보통 사용한 자원을 반납할 목적으로 사용
            * */
            try {
                // BufferedReader 객체가 없을 때를 대비
                if (in != null){
                    // resource 반환
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

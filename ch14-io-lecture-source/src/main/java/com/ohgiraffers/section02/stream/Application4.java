package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    // FileWriter
    public static void main(String[] args) {
        /*
        * FileWriter
        *
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
        * character(한 글자) 단위로 데이터 처리
        * */

        FileWriter fwriter = null;

        try {
            // 파일이 존재하지 않으면 생성
            // 두 번째 parameter를 true로 하면 이어쓰기 가능 (default: false)
            fwriter = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fwriter.write(97);

            // char 자료형으로 내보내기 가능
            fwriter.write('a');

            // char array로 내보내기 가능
            char[] carr = {10,'a','p','p','l','e',10};
            fwriter.write(carr);
            fwriter.write("동해물과 백두산이 마르고 닳도록");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // resource 반환
            if (fwriter != null){
                try {
                    fwriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

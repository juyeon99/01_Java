package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    // FileReader
    public static void main(String[] args) {
        /*
        * FileReader
        *
        * FileInputStream과 사용하는 방법 거의 동일
        * 단, byte 단위가 아닌 character 단위로 읽어들임
        * => 2byte이든 3byte이든 글자 단위로 읽어오기 때문에 한글(3byte)도 정상적으로 읽을 수 있다.
        * */

        FileReader freader = null;
        try {
            freader = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

//            int value;
//            while((value = freader.read()) != -1){
//                System.out.println((char) value);
//            }

            int size = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length();
            System.out.println("size = " + size);   // 한글의 경우 3bytes * (length)

            char[] carr = new char[size];
            freader.read(carr);

            for (int i = 0; i < carr.length; i++){
                System.out.println(carr[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (freader != null){
                try {
                    freader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

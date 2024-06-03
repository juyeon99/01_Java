package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    // file class
    public static void main(String[] args) {
        /*
        * File
        *
        * 대상 파일에 대한 정보로 인스턴스를 생성하고 파일 생성, 삭제 등의 처리를 수행하는 기능 제공
        * */

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        /*
        * createNewFile()
        *
        * 파일 생성 후 성공여부를 boolean으로 리턴
        * 최초 실행시 새롭게 파일이 만들어지기 때문에 true 반환
        * 한번 생성 후에는 재생성되지 않기 때문에 false 반환
        * */
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("file 생성?: " + isCreated);

            System.out.println("파일 크기: " + file.length() + "byte");
            System.out.println("파일 경로: " + file.getPath());
            System.out.println("현재 파일의 상위 경로: " + file.getParent());
            System.out.println("파일의 절대 경로: " + file.getAbsolutePath());

            boolean isDeleted = file.delete();
            System.out.println("isDeleted: " + isDeleted);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

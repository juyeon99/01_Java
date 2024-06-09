package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 입출력 스트림
        *
        * 프로그래밍을 할 때 많은 종류의 데이터를 다루어야 한다.
        * 하지만 데이터는 프로그램 내부에 있을 수도 있지만
        * 프로그램 외부의 데이터를 가져와서 사용해야 할 수도 있다.
        *
        * 외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미
        * 외부 데이터는 하드디스크 상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이 될 수도 있다.
        * 외부 데이터를 대상으로 작업할 때 연결된 길을 스트림(Stream)이라고 한다.
        * 스트림은 단방향이기 때문에 데이터를 읽어올 때는 입력스트림, 데이터 출력할 때는 출력스트림이라고 한다.
        *
        * InputStream, Reader  => 데이터를 읽어오는 스트림
        * OutputStream, Writer => 데이터를 내보내는 스트림
        * Reader, Writer (2byte 혹은 3byte) 단위로 작업 (한글 작업할 때 유용)
        * */

        FileInputStream fin = null; // 1byte씩 읽어오기 때문에 한글은 X
        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

            // 1. 1byte 씩 반복해서 읽기
//            int value;
//            // read(): 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 게 없으면 -1 반환
//            //         1 byte 씩 반복해서 읽어옴 (시간이 오래걸림)
//            while ((value = fin.read()) != -1){
//                // 값을 정수로 받아오기
//                System.out.print(value + " ");
//                // 값을 문자로 형변환을 이용하여 출력
//                System.out.println((char) value);
//            }

            // 2. Byte 배열로 파일 한번에 읽기
            System.out.println("파일의 길이: " + new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());
            int size = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
            byte[] barr = new byte[size];

            // read() 메소드의 인자로 byte 배열을 넣으면 파일을 읽어서 byte 배열로 반환
            fin.read(barr);
            for (int i = 0; i < barr.length; i++){
                System.out.println((char) barr[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            if (fin != null){
                try {
                    /*
                    * 자원을 반납하지 않으면(Stream을 close하지 않으면)
                    * 장기간 실행중인 프로그램의 경우 다양한 자원에서 leak 발생
                    *
                    * buffer를 이용하는 경우 마지막에 flush()로 버퍼에 남아있는 데이터 강제 전송
                    *
                    * 잔류데이터가 남은 상황에서 추가로 스트림을 사용하면 DeadLock 교착 상태가 됨
                    * */
                    fin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

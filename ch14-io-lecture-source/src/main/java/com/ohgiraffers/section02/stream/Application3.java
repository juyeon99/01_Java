package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    // FileOutputStream
    public static void main(String[] args) {
        /*
        * FileOutputStream
        *
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 Stream
        * byte 단위로 데이터 처리
        * */

        FileOutputStream fout = null;
        try {
            // OutputStream의 경우 대상 파일이 존재하지 않으면 자동 생성
            // 두 번째 parameter가 true이면 이어쓰기가 됨 (default: false)
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt" /* , true => 이어쓰기 */);
            fout.write(97);

            byte[] barr = {10/*개행문자*/,98,99,100,101,102,10,103,10};
            fout.write(barr);

            // 1번 인덱스에서 3의 길이만큼 파일에 작성
            fout.write(barr,2,3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // resource 반환
            if (fout != null){
                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

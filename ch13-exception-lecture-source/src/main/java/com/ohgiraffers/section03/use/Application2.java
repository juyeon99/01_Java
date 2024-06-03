package com.ohgiraffers.section03.use;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * try-with-resource
        * JDK 1.7에서 추가된 문법
        *
        * close 해야하는 인스턴스의 경우 try 옆에 괄호안에서 생성하면
        * 해당 try-catch블럭이 완료될 때 자동으로 close ==> finally가 필요 X
        * */
        try(BufferedReader in = new BufferedReader(new FileReader("test.dat"))){
            String str;

            while((str = in.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

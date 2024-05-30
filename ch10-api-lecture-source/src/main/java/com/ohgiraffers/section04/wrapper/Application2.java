package com.ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {
        /*
        * parsing
        *
        * String값을 기본자료형 값으로 변경하는 것
        * */

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");       // 8l 안됨
        float f = Float.parseFloat("4.0f");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");

        char c = "abc".charAt(0);
    }
}

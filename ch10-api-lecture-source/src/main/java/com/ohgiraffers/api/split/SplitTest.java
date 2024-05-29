package com.ohgiraffers.api.split;

public class SplitTest {
    // 1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 분리하여 `char[]` 에 저장하여 출력하시오.
    // 2. 분리전 글자 및 개수 출력
    // 3. 분리 후 문자배열 갯수 출력 확인
    // 4. `char[]` 값 출력
    // 5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력

    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";

        // 2. 분리전 글자 및 개수 출력
        System.out.println("분리전 글자: " + str + "\n분리전 글자 개수: " + str.length());
        String[] strArr = str.split(" ");

        // 3. 분리 후 문자배열 갯수 출력 확인
        System.out.println("분리 후 문자배열 개수: " + strArr.length);

        char[] charArr = new char[strArr.length];
        for (int i = 0; i < charArr.length; i++){
            charArr[i] = strArr[i].charAt(0);
        }

        // 4. char[] 값 출력
        for (int i = 0; i < charArr.length; i++){
            System.out.println("char[" + i + "] = " + charArr[i]);
        }

        // 5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
        // 방법 1 - String
//        String newStr = "";
//        for (int i = 0; i < charArr.length; i++){
//            newStr += charArr[i];
//        }
//        System.out.println("newStr = " + newStr.toUpperCase());

        // 방법 2 - StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArr.length; i++){
            stringBuilder.append(charArr[i]);
        }
        String newStr = String.valueOf(stringBuilder).toUpperCase();
        System.out.println("newStr = " + newStr);
    }
}

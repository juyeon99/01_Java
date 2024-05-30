package com.ohgiraffers.api.string;

public class StringProcess {
    public String preChar(String str) {
        // 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드

        // 방법 1
//        char newChar = str.charAt(0);
//        newChar = Character.toUpperCase(newChar);
//        str.replace(str.charAt(0),newChar);
//        return str;

        // 방법 2
        String newStr = str.substring(0,1);
        newStr = newStr.toUpperCase();
        newStr += str.substring(1);
        return newStr;
    }

    public int charSu(String str, char ch) {
        // 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}

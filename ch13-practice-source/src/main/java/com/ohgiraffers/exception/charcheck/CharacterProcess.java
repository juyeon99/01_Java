package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {
    public CharacterProcess() {}

    public int countAlpha(String s) throws CharCheckException {
        // 1. 전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                count++;
            } else if (s.charAt(i) == '\n' || s.charAt(i) == ' '){
                // 2. 단, 공백문자가 있으면, `CharCheckException` 발생
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            }
        }
        return count;
    }
}

package com.ohgiraffers.section02.String;

public class Application3 {
    public static void main(String[] args) {
        /*
        * split(): 정규표현식을 이용하여 문자열 분리
        *          비정규화된 문자열을 분리할 때 유용. (공백 문자열 포함)
        *          정규표현식을 이용하기 때문에 속도가 느리다는 단점
        * StringTokenizer: 문자열의 모든 문자를 구분자로 하여 문자열을 분리
        *                  정형화된 문자열 패턴을 분리할 때 유용 (공백 문자열 무시)
        *                  split보다 속도면에서 더 빠름
        *                  delimeter를 생략하는 경우 공백이 delimeter
        * */

        String emp1 = "100,홍길동,서울,영업부";    // 모든값 존재
        String emp2 = "200,유관순,,총무부";       // 주소 없음
        String emp3 = "300,이순신,경기도,";       // 부서 없음

        String[] empArr1 = emp1.split(",");
        String[] empArr2 = emp2.split(",");
        String[] empArr3 = emp3.split(",");

        System.out.println("========== empArr1 ==========");
        for (int i = 0; i < empArr1.length; i++){
            System.out.println("empArr1[" + i + "] = " + empArr1[i]);
        }

        System.out.println("========== empArr2 ==========");
        for (int i = 0; i < empArr2.length; i++){
            System.out.println("empArr2[" + i + "] = " + empArr2[i]);
        }

        System.out.println("========== empArr3 ==========");
        for (int i = 0; i < empArr3.length; i++){
            System.out.println("empArr3[" + i + "] = " + empArr3[i]); // 마지막 값이 출력 안됨
        }

        System.out.println("========== empArr4 ==========");
        String[] empArr4 = emp3.split(",", -1); // limit = -1 ensures trailing empty strings
        for (int i = 0; i < empArr4.length; i++) {
            System.out.println("empArr4[" + i + "] : " + empArr4[i]);
        }
    }
}

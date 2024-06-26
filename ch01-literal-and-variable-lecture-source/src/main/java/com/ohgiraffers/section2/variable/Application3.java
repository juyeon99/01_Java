package com.ohgiraffers.section2.variable;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 변수의 명명 규칙
        *
        * 변수의 이름을 지을 때 정해진 규칙이 존재
        * 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫단추이다.
        * */

        /*
         *  변수의 명명규칙 // 크게 두가지로 나누어서 규칙이 있습니다.
         *   1. 컴파일 에러를 발생시키는 규칙
         * 	  1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
         *    1-2. 예약어는 사용이 불가능하다. (자바에서 미리 사용하겠다고 compiler와 약속한 키워드들을 예약어라고 한다.)
         *    1-3. 변수명은 대/소문자를 구분한다. (자바는 대/소문자를 엄격하게 구분하는 언어이다.)
         *    1-4. 변수명은 숫자로 시작할 수 없다. (시작만 할 수 없고 숫자를 섞어서 사용하는 것은 가능하다.)
         *    1-5. 특수 기호는 '_'와 '$'만 사용 가능하다. (따라서 공백을 사용할 수 없다.)
         *   2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙
         *    2-1. 변수명의 길이 제한은 없다.(하지만 적당히 해야겠지?)
         *    2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다. (camel-case)
         *    2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. (타 언어 네이밍 규칙이다.)
         *         상수를 사용할때는 특수하게 사용합니다.
         *    2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. (한글을 취급하는 다양한 방식들이 존재하기 때문에 에러를 유발할 수 있다.)
         *    2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
         *    2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.
         *    // 2-6 예를들면 더할때 sum, 평균낼때 avg 이런것들을 의미합니다.
         *    2-7. 명사형으로 작성할 수 있도록 한다.
         *    // 2-7 메소드는 동사형으로 작성
         *    2-8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다.
         * */

        // compile error
        int age = 20;
        // int age = 20; // 동일한 변수명을 가지므로 에러
        // int true;     // 예약어 사용 불가
        // int byte;

        int Age = 20;   // 위에서 만든 age와 다른 변수로 취급
        int True = 20;  // 예약어 true와 다른 변수로 취급

//        int 1age = 20;
        int age1 = 20;

//        int a ge;
//        int a@ge;
        int _age;   // underscore 사용 가능
        int $ha$rp$;  // $ 사용 가능. 위치 상관없음.

        /*
        * Camel case
        *
        * 자바에서는 클래스명만 유일하게 대문자로 시작
        * */

        int maxAge = 20;
        int minAge = 20;

//        String user_name;
        String userName;
        int 나이;    // 가능하지만 권장하지 않음
        String s;   // 변수가 어떤 의미인지 파악하기 힘듦
        String name;    // 의미를 분명히 해서 변수명을 지어야 의도가 파악이 된다.

        // 전형적인 변수명들
        int sum = 0;
        int max = 0;
        int min = 0;
        int count = 1;

//        String goHome;
        String home;    // 가급적 명사형으로.

        boolean isAlive = true;
        boolean isTrue = true;


    }
}

package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {
        /*
        * 접근제한자
        *
        * 클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
        * 1. public: 모든 패키지에 접근 허용
        * 2. protected: 동일 패키지에 접근 허용. 단, 상속관계에 있는 경우 다른 패키지에서도 접근 가능
        * 3. default: 동일 패키지만 접근 허용 (아무것도 작성하지 않으면 default)
        * 4. private: 해당 클래스 내부에서만 접근 허용
        * */

        /*
        * 위의 네 가지 접근제한자는 클래스의 멤버(필드, 메소드)에 모두 사용가능
        * 단, 클래스 선언시 사용하는 접근제한자 public과 default만 사용 가능
        * */

        /*
        * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        * public으로 접근을 허용한 메소드만 이용할 수 있게 해 놓은 것
        * => Encapsulation 캡슐화
        * */
        Monster monster1 = new Monster();
        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());
    }
}

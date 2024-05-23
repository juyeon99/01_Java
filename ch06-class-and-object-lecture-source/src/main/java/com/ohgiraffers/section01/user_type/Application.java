package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {
        // 회원 (아이디, 비밀번호, 이름, 나이, 성별, 취미)

        String id = "user01";
        String password = "password";
        String name = "jenny";
        int age = 20;
        char gender = 'f';
        String[] hobby = new String[] {"피아노","바이올린","TV시청"};

        System.out.println("ID: " + id);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.print("Hobby: ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

        /*
        * 위와같이 각각의 변수로 관리할 때 단점
        * 1. 변수명을 다 관리해야함
        * 2. 모든 회원 정보를 인자로 메소드 호출시, 값을 전달해야하면
        *    너무 많은 값을 인자로 전달해야 해서 가독성이 떨어진다.
        * 3. 메소드에서 리턴은 1개 값만 가능하기 때문에 다른 타입의 여러 변수를 묶어 리턴 불가
        * */

        /*
        * 사용자 정의 자료형 사용하기
        *
        * [자료형] [변수명] = new [클래스명]
        * 사용자 정의 자료형인 클래스를 이용하기 위해선 new로 heap에 할당해야 함
        * 아이디,비밀번호,이름 등을 연속된 메모리 주소에서 사용하도록 heap에 공간을 만듦
        * */

        Member member = new Member();

        /*
        * 필드에 접근하기 위해서는 ref var명, 필드명으로 접근
        * '.'은 참조연산자, ref var가 참고하고 있는 주소로 접근한다는 의미
        * 배열은 인덱스로 접근, 객체는 필드명으로 접근
        * */
        System.out.println("\n========== 생성한 객체 필드값 출력 ==========");
//        System.out.println("Member id: " + member.id);
//        System.out.println("Member password: " + member.pw);
//        System.out.println("Member name: " + member.name);
//        System.out.println("Member age: " + member.age);
//        System.out.println("Member gender: " + member.gender);
//        System.out.println("Member hobby: " + member.hobby[0] + ", " + member.hobby[1] + ", " + member.hobby[2]);
//        System.out.println();

        // 필드에 접근해 변수처럼 사용
        member.id = "user01";
        member.pw = "password";
        member.name = "jenny";
        member.age = 20;
        member.gender = 'f';
        member.hobby = new String[] {"피아노","바이올린","TV시청"};

        System.out.println("Member id: " + member.id);
        System.out.println("Member password: " + member.pw);
        System.out.println("Member name: " + member.name);
        System.out.println("Member age: " + member.age);
        System.out.println("Member gender: " + member.gender);
        for (int i = 0; i < member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }
    }
}

package com.ohgiraffers.section02.uses;

public class MemberService {
    // 연결만 해주는 곳이고, 실제구현은 다른곳에서 한다.
    public void signUpMembers() {
        Member[] members = new Member[5];

        // 객체로 입력을 잘 받았다고 가정.
        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "유관순", 16, '남');
        members[2] = new Member(3, "user03", "pass03", "이순신", 40, '남');
        members[3] = new Member(4, "user04", "pass04", "신사임당", 35, '여');
        members[4] = new Member(5, "user05", "pass05", "윤봉길", 22, '남');

        // 입력에 대한 처리 -> 클래스 만들어서
        MemberRegister memberRegister = new MemberRegister();

        memberRegister.regist(members);
    }

    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("================ 가입된 회원 목록 ===============");

        // MemberFinder에서 return 받은 Member[]
        Member[] foundMembers = finder.findAllMembers(); // 크기가 10

        for(Member m : foundMembers) {
            if(m != null) {
                System.out.println(m.getInformation());
            }
        }
        System.out.println("----------------------------------------------");
    }
}

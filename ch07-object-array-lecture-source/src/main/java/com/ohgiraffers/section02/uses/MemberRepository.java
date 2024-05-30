package com.ohgiraffers.section02.uses;

public class MemberRepository {
    // 정보 저장
    // static 필드로 회원 정보들을 관리

    // final static (Singleton)
    // -> means there will be only one instance of the members array throughout the lifetime
    // -> reference cannot be changed once initialized
    // -> members array is shared among all instances of the MemberRepository class
    // ==> way to create a globally accessible, immutable, and consistent repository of member information
    private final static Member[] members;
    private static int count; // 추가되는 인원의 배열의 인덱스 값을 관리하기 위한 변수

    // static block: to ensure that the members array is properly initialized
    //               with a predetermined size when the MemberRepository class
    //               is loaded, ensuring that the repository is ready for use
    //               and can store information for up to 10 members.
    static {
        members = new Member[10];   // 최대 10명까지만 지정
    }

    public static boolean store(Member[] newMembers) {
        for (int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {
        // 지금 가지고 있는 멤버만 넘겨줌
        return members;
    }
}

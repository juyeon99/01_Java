package com.ohgiraffers.section02.uses;

public class MemberRepository {

    // 정보 저장
    private final static Member[] members;

    private static int count; // 추가되는 인원의 배열의 인덱스 값을 관리하기 위한 변수

    static {
        members = new Member[10];
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

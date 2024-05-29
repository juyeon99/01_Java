package com.ohgiraffers.api.member;

import java.time.LocalDate;

public class Run {
    public static void main(String[] args) {
        // 각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.
        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] strArr = str.split("\\|");
        Member[] members = new Member[strArr.length];

        for (int i = 0; i < strArr.length; i++){
            String[] arr = strArr[i].split(",");
            int memberNo = Integer.parseInt(arr[0]);
            String memberName = arr[1];
            int height = Integer.parseInt(arr[2]);
            int weight = Integer.parseInt(arr[3]);
            LocalDate birth = LocalDate.of(
                    Integer.parseInt(arr[4].substring(0,4)),
                    Integer.parseInt(arr[4].substring(4,6)),
                    Integer.parseInt(arr[4].substring(6)));
            Member m = new Member(memberNo,memberName,height,weight,birth);
            members[i] = m;
        }

        Member member = new Member();
        member.printMembersArray(members);
    }
}

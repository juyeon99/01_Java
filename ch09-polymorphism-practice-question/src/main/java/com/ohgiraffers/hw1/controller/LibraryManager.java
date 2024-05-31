package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem){
        // 전달받은 mem 주소값을 통해 LibraryManager의 mem에 대입
        this.mem = mem;
    }

    public Member myInfo(){
        return mem;
    }

    public Book[] selectAll(){
        return bList;
    }

    public Book[] searchBook(String keyword){
        Book[] searchList = new Book[5];
        int count = 0;
        for (int i = 0; i < bList.length; i++){
            if(bList[i].getTitle().contains(keyword)){
                searchList[count++] = bList[i];
            }
        }
        return searchList;
    }

    public int rentBook(int index){
        int result = 0;
        if (bList[index] instanceof AniBook){
            // 회원의 나이와 해당 만화책의 제한나이를 비교하여
            // 회원 나이가 더 적은 경우 result를 1로 초기화
            if(((AniBook) bList[index]).getAccessAge() > mem.getAge()){
                result = 1;
            }
        } else if (bList[index] instanceof CookBook){
            // 요리책의 쿠폰 유무가 유일 경우 회원의
            // couponCount를 1증가 시킨 후 result 2로 초기화
            if (((CookBook) bList[index]).hasCoupon()){
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        }
        return result;
    }
}

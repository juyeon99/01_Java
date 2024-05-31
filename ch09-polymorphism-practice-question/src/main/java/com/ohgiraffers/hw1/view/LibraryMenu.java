package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별(m/f): ");
        char gender = sc.nextLine().charAt(0);

        Member member = new Member(name,age,gender);
        lm.insertMember(member);
        boolean flag = true;
        while (flag){
            System.out.println("\n========== 메뉴 ==========");
            System.out.println("1. 마이페이지\n2. 도서 전체 조회\n3. 도서 검색\n4. 도서 대여\n0. 프로그램 종료");
            System.out.print("입력: ");
            int input = sc.nextInt();

            switch (input){
                case 1:
                    Member m = lm.myInfo();
                    System.out.println(m.toString());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }

    }

    public void selectAll(){
        // for문 이용하여 bList의 모든 도서 목록 출력
        // 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
        //        ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++){
            System.out.print((i+1) + "번 도서: ");
            System.out.println(bList[i].toString());
        }
    }

    public void searchBook(){
        sc.nextLine();
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] searchList = lm.searchBook(keyword);

        // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
        int i = 1;
        for (Book b : searchList){
            // NullPointerException 발생 시 오류 해결
            try {
                System.out.println(i++ + "번 도서: " + b.toString());
            } catch (NullPointerException npe){
                break;
            }
        }
    }

    public void rentBook(){
        Book[] bList = lm.selectAll();
        System.out.print("대여할 도서 번호 선택: ");
        int index = sc.nextInt() - 1;
        int result = lm.rentBook(index);
        switch (result){
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n마이페이지를 통해 확인하세요.");
                break;
        }
    }
}

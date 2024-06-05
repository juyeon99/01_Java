package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;

import java.util.Scanner;

public class BoardMenu {
    private BoardManager bm = new BoardManager();
    private InputBoard ib = new InputBoard();

    public void mainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println();
            System.out.println("*** 게시글 서비스 프로그램 ***");
            System.out.println("1. 게시글 쓰기\n2. 게시글 전체보기\n3. 게시글 한 개보기\n4. 게시글 제목 수정\n5. 게시글 내용 수정\n6. 게시글 삭제\n7. 게시글 제목 검색\n8. 정렬하기\n9. 끝내기");
            System.out.print(" => 선택: ");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input){
                case 1:
                    bm.insertBoard(ib.inputBoard());
                    break;
                case 2:
                    bm.selectAllList();
                    break;
                case 3:
                    bm.selectOneBoard(ib.inputBoardNo());
                    break;
                case 4:
                    bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle() /* "" */);
                    break;
                case 5:
                    bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardContent());
                    break;
                case 6:
                    bm.deleteBoard(ib.inputBoardNo());
                    break;
                case 7:
                    bm.searchBoard(ib.inputBoardTitle());
                    break;
                case 8:
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    flag = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public void sortSubMenu(){
        System.out.println();
        System.out.println("*****  게시글 정렬 메뉴 *****\n1. 글번호순 오름차순 정렬\n2. 글번호순 내림차순 정렬\n3. 작성날짜순 오름차순 정렬\n4. 작성날짜순 내림차순 정렬\n5. 글제목순 오름차순 정렬\n6. 글제목순 내림차순 정렬\n7. 메인메뉴로 이동");
        System.out.print("선택: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        switch (input){
            case 1:
//                bm.sortList(AscBoardNo());
//                break;
//            case 2:
//                bm.sortList(DescBoardNo());
//                break;
//            case 3:
//                bm.sortList(AscBoardDate());
//                break;
//            case 4:
//                bm.sortList(AscBoardDate());
//                break;
//            case 5:
//                bm.sortList(AscBoardTitle());
//                break;
//            case 6:
//                bm.sortList(DescBoardTitle());
                break;
            case 7:
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}

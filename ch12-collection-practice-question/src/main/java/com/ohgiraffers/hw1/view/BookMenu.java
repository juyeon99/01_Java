package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc;
    private BookManager bm;

    public BookMenu() {
        sc = new Scanner(System.in);
        bm = new BookManager();
    }

    public void menu() {
        // 도서관리 프로그램에 해당하는 메인 메뉴 출력
        // 각 메뉴에 해당하는 BookManager 클래스의 메소드 실행 → 반복 출력되게 한다

        // test input ---------
//        BookDTO book = new BookDTO(3,"title1","author1");
//        BookDTO book2 = new BookDTO(2,"title2","author2");
//        BookDTO book3 = new BookDTO(1,"title3","author3");
//
//        bm.addBook(book);
//        bm.addBook(book2);
//        bm.addBook(book3);
        // end ---------

        boolean flag = true;
        while(flag){
            System.out.println();
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가\n2. 도서 정보 정렬\n3. 도서 삭제\n4. 도서 검색\n5. 전체 출력\n6. 끝내기");
            System.out.print("선택: ");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input){
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("정렬방식(1.오름차순, 2.내림차순): ");
                    int select = sc.nextInt();
                    if(select == 1 || select == 2){
                        bm.printBookList(bm.sortedBookList(select));
                    } else{
                        System.out.println("번호를 잘못입력하였습니다.");
                    }
                    break;
                case 3:
                    int index1 = bm.searchBook(inputBookTitle());
                    if (index1 == -1){
                        System.out.println("삭제할 글이 존재하지 않음");
                    } else {
                        bm.deleteBook(index1);
                        System.out.println("성공적으로 삭제");
                    }
                    break;
                case 4:
                    int index2 = bm.searchBook(inputBookTitle());
                    if(index2 == -1){
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else{
                        bm.printBook(index2);
                    }
                    break;
                case 5:
                    if(bm.getBookList().isEmpty()){
                        System.out.println("출력할 도서가 없습니다.");
                    }
                    bm.displayAll();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public BookDTO inputBook(){
        // BookDTO 객체의 필드 값을 키보드로 입력 받아 초기화 하고 객체 리턴
        System.out.print("도서 제목: ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자: ");
        String author = sc.nextLine();
        BookDTO book = new BookDTO(category,title,author);

        book.setbNo(bm.getBookList().size() + 1);   // 도서 번호
        return book;
    }

    public String inputBookTitle(){
        // 검색할 도서제목을 키보드로 입력 받아 리턴
        System.out.print("검색할 도서 제목: ");
        return sc.nextLine();
    }
}

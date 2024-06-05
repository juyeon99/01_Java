package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.*;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager(){
        bookList = new ArrayList<>();
    }

    public ArrayList<BookDTO> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<BookDTO> bookList) {
        this.bookList = bookList;
    }

    public void addBook(BookDTO book){
        bookList.add(book);
    }

    public void deleteBook(int index){
        bookList.remove(index);
    }

    public int searchBook(String bTitle){
        // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        // 도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
        int index = -1;
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getTitle().equals(bTitle)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void printBook(int index){
        // index에 해당하는 객체 출력
        System.out.println(bookList.get(index));
    }

    public void displayAll(){
        for (BookDTO book : bookList){
            System.out.println(book.toString());
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){
//        ArrayList<BookDTO> sortedList = new ArrayList<>();
        if (select == 1){
            bookList.sort(new AscCategory());
//            sortedList.add(bookList.get(0));
//            for (int i = 1; i < bookList.size(); i++){
//                for (int j = i+1; j < bookList.size(); j++){
//                    if (new AscCategory().compare(bookList.get(i),bookList.get(j)) > 0){
//
//                    }
//                }
//            }
        } else {
            bookList.sort(new DescCategory());
        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){
//        br.sort(new AscCategory());
        for (BookDTO book : br){
            System.out.println(book);
        }
    }
}

package com.ohgiraffers.practice.question2;

public class Book {
    // Joshua Bloch가 쓴 "Effective Java" 책을 만들고,
    // 416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.

    private String author;
    private String title;
    private int pages;
    private String cover;

    public Book(String author, String title, int pages, String cover) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void print(){
        System.out.println(this.author + "이(가) 쓴 \"" + this.title + "\"은(는), " +
                + this.pages + "페이지이며 " + this.cover + "입니다.");
    }
}

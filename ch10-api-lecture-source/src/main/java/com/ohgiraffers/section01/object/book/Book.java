package com.ohgiraffers.section01.object.book;

public class Book {
    private int number;     // 책번호
    private String title;   // 제목
    private String author;  // 저자
    private int price;      // 가격

    public Book() {
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 두 인스턴스의 address가 같으면 true
        if (this == obj){
            return true;
        }

        // parameter가 null이거나 obj와 class 타입이 다르면 false
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        // 다른 필드들을 비교해서 같지 않으면 false, 같으면 true
        Book book = (Book) obj;
        return this.number == book.number &&
                this.price == book.price &&
                this.author.equals(book.author) &&
                this.title.equals(book.title);
    }

    @Override
    public int hashCode(){
        // 곱셈연산으로 누적
        int result = 1;

        // 31이 소수이기 때문에 연산할 때 동일한 hashCode값이 나오지 않을 확률을 증가시킴
        // 31로 하는것이 관례
        final int PRIME = 31;

        // 각각의 필드값이 같으면 실제 address가 달라도 같은 hashCode값이 나오게 만듦
        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }
}

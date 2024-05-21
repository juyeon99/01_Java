package com.ohgiraffers.section03.copy;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 얕은 복사의 활용
        *
        * 얕은 복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경우
        * 리턴값을 동일한 배열을 리턴해주고 싶은 경우
        * */

        String[] names = {"홍길동","유관순","이순신"};
        System.out.println("names array의 hashcode: " + names.hashCode());

        print(names);   // names: shallow copy => same hashcode
        String[] animals = getAnimals();
        System.out.println("리턴받은 animals의 hashcode: " + animals.hashCode());
        print(animals); // 모두 same hashcode
    }

    public static void print(String[] arr) {    // static을 사용하면 메모리상에 이미 올라가 있으므로 따로 변수를 만들어주지 않아도 됨
        System.out.println("arr의 hashcode: " + arr.hashCode());
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals() {
        String[] animals = new String[]{"Bear","Koala","Gorilla"};
        // shallow copy
        System.out.println("새로 만든 animals의 hashcode: " + animals.hashCode());
        return animals;
    }
}

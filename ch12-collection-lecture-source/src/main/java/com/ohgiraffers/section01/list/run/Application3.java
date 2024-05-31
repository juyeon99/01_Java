package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application3 {
    public static void main(String[] args) {
        /*
        * Stack
        * LIFO 방식의 자료구조
        * */
        Stack<Integer> intStack = new Stack<>();
        intStack.push(11);
        intStack.push(22);
        intStack.push(33);
        intStack.push(44);
        intStack.push(55);

        /*
        * add()도 가능하지만 Vector의 method
        * push() 권장
        * */
//        intStack.add(66);

        System.out.println("intStack: " + intStack);

        /*
        * Stack에서 element를 찾을 때 search()
        * 인덱스가 아닌, 위에서부터의 순번을 의미
        * 가장 상단의 위치가 0이 아니라 1부터 시작
        * */
        /*
        *   stack   |   order
        * ----------------------
        *     55    |     1
        *     44    |     2
        *     33    |     3
        *     22    |     4
        *     11    |     5
        * */
        System.out.println("intStack.search(55) = " + intStack.search(55));

        /*
        * Stack에서 값을 꺼내는 method
        * peak(): 해당 Stack의 가장 마지막 element 반환
        * pop():  해당 Stack의 가장 마지막 element 반환 후 제거
        * */
        System.out.println("peek(): " + intStack.peek());
        System.out.println("pop(): " + intStack.pop());
        System.out.println("pop() 이후 Stack: " + intStack);

        System.out.println("pop(): " + intStack.pop());
        System.out.println("pop(): " + intStack.pop());
        System.out.println("pop(): " + intStack.pop());
        System.out.println("pop(): " + intStack.pop());
//        System.out.println("pop(): " + intStack.pop());       // EmptyStackException

        System.out.println("intStack: " + intStack);

    }
}

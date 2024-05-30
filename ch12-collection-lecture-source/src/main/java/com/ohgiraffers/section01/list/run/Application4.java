package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {
    public static void main(String[] args) {
        /*
        * Queue
        * FIFO 방식의 자료구조
        *
        * Queue interface를 상속받는 하위 interface: Deque, BlockingQueue, TransferQueue, ...
        * 대부분의 queue는 LinkedList 이용
        * */

        // queue는 interface이기 때문에 자체로 인스턴스 생성 불가
//        Queue<String> queue = new Queue<String>(); XXX
        Queue<String> queue = new LinkedList<>();

        // offer()를 통해 데이터를 넣는다
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println("queue = " + queue);

        /*
        * queue에서 데이터를 꺼내는 방식
        * peek(): queue의 맨 앞 element(가장 먼저 들어온 element) 반환
        * poll(): queue의 맨 앞 element(가장 먼저 들어온 element) 반환 후 제거
        * */
        System.out.println("peek(): " + queue.peek());
        System.out.println("poll(): " + queue.poll());
        System.out.println("queue = " + queue);
    }
}

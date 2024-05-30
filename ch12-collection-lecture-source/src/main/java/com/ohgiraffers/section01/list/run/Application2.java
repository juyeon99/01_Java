package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application2 {
    // LinkedList
    public static void main(String[] args) {
        /*
        * Linked List
        * ArrayList가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완
        *
        * 1. Singly Linked List
        *   저장한 element가 순서를 유지하지 않고 저장되지만 이러한 요소들 사이를 링크로
        *   연결하여 구성하며 마치 연결된 리스트 형태인 것처럼 만든 자료구조
        *   element의 저장과 삭제시 다음 요소를 가리키는 참조링크만 변경하면 되기 때문에
        *   element의 저장과 삭제가 빈번히 일어나는 경우 ArrayList보다 성능면에서 우수
        *   Singly Linked List는 next element만 링크하기 때문에 previous element로 접근X
        *
        * 2. Doubly Linked List
        *   Doubly Linked List는 previous element도 링크하여 이전 element로 접근 가능
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList: " + linkedList);

        for (int i = 0; i < linkedList.size(); i++){
            System.out.println(i + " : " + linkedList.get(i));
        }

        // remove()
        linkedList.remove(1);
        for (String s : linkedList){
            System.out.println(s);
        }

        // set(): 수정
        linkedList.set(0,"pineapple");

        // isEmpty(): list가 비었는지 확인
        System.out.println(linkedList.isEmpty());

        // clear(): list 내 모든 elements 삭제
        linkedList.clear();
        System.out.println(linkedList.isEmpty());
    }
}

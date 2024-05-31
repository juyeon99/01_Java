package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /*
        * TreeSet Class
        *
        * TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 Binary Search Tree의 형태로 element 저장
        * BST는 데이터를 추가하거나 제거하는 등 기본 동작 시간이 빠르다.
        * Set interface가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점
        * */
        TreeSet<String> treeSet = new TreeSet<>();
//        Set<String> treeSet2 = new TreeSet<>();   // polymorphism 이용

        treeSet.add("java");
        treeSet.add("oracle");
        treeSet.add("jdbc");
        treeSet.add("html");
        treeSet.add("css");
        System.out.println("treeSet: " + treeSet); // 자동 정렬

        System.out.println("\n========== Iterator 이용 ==========");
        // 목록 만들어서 하나씩 대문자로 변경해서 출력
        Iterator<String> iter = treeSet.iterator(); // 목록 만들기
        while (iter.hasNext()){
            System.out.println(((String) iter.next()).toUpperCase());
        }
        System.out.println("\n========== array 이용 ==========");
        Object[] arr = treeSet.toArray();
        for(Object obj : arr){
            System.out.println(((String) obj).toUpperCase());
        }
    }
}

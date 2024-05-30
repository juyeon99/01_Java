package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Set interface를 구현한 Set collection class의 특징
        * 1. element의 저장 순서 유지 X
        * 2. element의 중복 허용 X (null값도 중복되지 않게 하나의 null만 저장)
        * */

        /*
        * HashSet
        *
        * Set collection class에서 가장 많이 사용되는 클래스 중 하나
        * Hash-> 해시 알고리즘을 사용해서 검색 속도가 빠름
        * */
        HashSet<String> hSet = new HashSet<>(); // 권장 방식
//        Set hset2 = new HashSet();
//        Collection hset3 = new HashSet();

        hSet.add(new String("java"));
        hSet.add("oracle");
        hSet.add("jdbc");
        hSet.add("html");
        hSet.add("css");

        // 저장 순서 유지 X
        System.out.println("hSet: " + hSet);

        // 중복 허용 X
        hSet.add("java");
        System.out.println("hSet: " + hSet);
        System.out.println("저장된 객체 수: " + hSet.size());
        System.out.println("\"oracle\" 포함 확인: " + hSet.contains("oracle"));

        // 저장된 객체를 하나씩 꺼내는 기능이 X
        // 1. toArray() 배열로 바꾸고 for loop 사용
        Object[] arr = hSet.toArray();
        for (int i = 0; i < hSet.size(); i++){
            System.out.println(i + " : " + arr[i]);
        }

        // 2. iterator()로 list를 만들어 연속 처리
        Iterator<String> iter = hSet.iterator();
        while (iter.hasNext()){
            System.out.println("iter로 list를 만들어 출력 = " + iter.next());
        }

        Boolean result = hSet.remove("oracle");  // index가 없으므로 똑같은 값을 찾아서 제거
        System.out.println("remove(\"oracle\") :" + result);
        System.out.println("hset = " + hSet);

        hSet.clear();
        System.out.println("isEmpty = " + hSet.isEmpty());
        System.out.println("hset = " + hSet);
    }
}

package com.ohgiraffers.section03.map.run;

import java.util.Date;
import java.util.HashMap;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Map interface의 특징
        *
        * Collection interface와는 다른 저장 방식
        * (key,value) 쌍으로 저장
        *
        * key
        * value를 찾기 위한 이름역할을 하는 객체
        * 1. element의 저장 순서를 유지하지 X
        * 2. key는 중복을 허용하지 않지만, key가 다르면 중복되는 값은 저장 가능
        *
        * HashMap, HashTable, TreeMap 등 대표적인 클래스가 존재
        * HashMap이 가장 많이 사용되며 HashTable은 jdk 1.0부터 존재해 HashMap과 동일하게 동작 -> 하위 호환을 위해 남겨놓은 것
        * 따라서, 가급적이면 HashMap 사용 권장
        * */

        HashMap hashMap = new HashMap<>();
        // Map hashMap2 = new HashMap();

        // put()
        // key와 value 둘 다 객체여야 함 => autoBoxing 처리. (12 -> new Integer(12))
        hashMap.put("one" /* => 리터럴 */, new Date() /* => 객체 */);
        hashMap.put(12, "red apple");
        hashMap.put(33, 123);
        System.out.println("hashMap: " + hashMap);  // 저장 순서 유지 X

        // 중복 확인
        // 같은 key값에 value를 다르게 하면 덮어씌어짐
        hashMap.put(12, "yellow banana");
        System.out.println("hashMap: " + hashMap);  // value가 덮어씌어짐

        // key값이 다르면 중복된 value 값은 저장 가능
        hashMap.put(12, "yellow banana");
        hashMap.put(13, "yellow banana");
        hashMap.put(14, "yellow banana");
        System.out.println("hashMap: " + hashMap);

        // remove()
        hashMap.remove(13);
        hashMap.remove(14);
        System.out.println("hashMap: " + hashMap);

        // 저장된 객체 수 확인
        System.out.println("hashMap.size() = " + hashMap.size());
    }
}

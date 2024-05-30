package com.ohgiraffers.section01.list.run;

import java.time.LocalDateTime;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
         * Collection Framework
         *
         * 여러개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록 표준화 된 방법을 제공하는 클래스들의 집합
         * => 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스
         * */

        /*
         * Collection Framework는 크게 3가지 interface 중 한가지를 상속받아 구현해 두었다.
         * 1. List interface
         * 2. Set interface
         * 3. Map interface
         *
         * List와 Set interface의 공통 부분을 Collection 인터페이스에서 정의
         * 하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하지 X
         * */

        /*
         * 각 인터페이스 별 특징
         *
         * 1. List interface
         *   - 순서가 있는 데이터의 집합으로 데이터의 중복 저장 허용
         *   - Vector, ArrayList, LinkedList, Stack, Queue, ...
         * 2. Set interface
         *   - 순서가 없는 데이터의 집합으로 데이터의 중복 저장을 허용하지 X
         *   - HashSet, TreeSet, ...
         * 3. Map interface
         *   - (key,value) 한 쌍으로 이루어지는 데이터 집합
         *   - key를 Set방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고, 중복된 key를 허용하지 X
         *   - HashMap, TreeMap, HashTable, Properties, ...
         * */

        /*
         * ArrayList
         * => 배열의 단점을 보완
         * 배열의 단점: 크기 변경 불가, element의 추가, 수정, 삭제, 정렬 복잡함
         * 크기 변경(새로운 더 큰 배열 만들고 옮기기), element 추가, 수정, 삭제, 정렬 기능ㅇ르 미리 메소드로 구현해서 제공
         * */
        ArrayList<Object> alist = new ArrayList<>();

        /*
         * Polymorphism을 적용해 상위 레퍼런스(List)로 ArrayList 객체를 만들 수 있다.
         * List interface 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
         * 레퍼런스 타입은 List로 해두는게 더 유연한 코드를 작성 가능
         * */
        List<Object> list = new ArrayList<>();

        /*
        * ArrayList는 저장 순서가 유지, index가 적용됨
        * Object 클래스의 하위 타입 인스턴스를 모두 저장 가능
        * */
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(LocalDateTime.now());

        // toString()이 override 되어있음
        System.out.println("list: " + list);
        System.out.println("list size: " + list.size());

        // 인덱스가 지정되어있기 때문에 for 문으로 접근 가능
        for(int i = 0; i < list.size(); i++){
            System.out.println(i + " : " + list.get(i));
        }

        // ArrayList는 데이터의 중복저장을 허용한다.
        list.add("apple");
        System.out.println("list: " + list);

        /*
        * 원하는 인덱스 위치에 값을 추가할 수 있다.
        * 새로운 값이 들어가는 인덱스 위치에 값을 넣고, 이후 인덱스는 하나씩 뒤로 밀리게 된다.
        * */
        list.add(1,"banana");
        System.out.println("list: " + list);

        /*
        * remove()
        * */
        list.remove(2);
        list.remove(2);
        System.out.println("list: " + list);

        // 모든 collection framework class는 generic class로 작성되어있다.
        List<String> strList = new ArrayList<>();
        // 타입을 지정해서 타입 이외의 인스턴스는 저장하지 않을 수 있다.
        // strList.add(123);
        strList.add("apple");
        strList.add("banana");
        strList.add("orange");
        strList.add("mango");
        strList.add("grape");

        System.out.println("strList: " + strList);

        /*
        * sort
        *
        * Collection -> interface -> 바로 사용 불가
        * Collections 클래스 사용 -> Collection 사용되는 기능을 static method로 구현한 클래스
        * */
        Collections.sort(strList);
        Collections.reverse(strList);
        System.out.println("strList: " + strList);

        /*
        * ArrayList에는 역순으로 정렬하는 기능X
        * LinkedList descendingIterator()를 사용하면
        * 내림차순으로 정렬된 Iterator 타입의 list로 반환
        * */

        /*
        * Iterator
        * Collection interface의 iterator()를 이용해서 인스턴스를 생성할 수 있다.
        * Collection에서 값을 읽어오는 방식을 통일되게 제공하기 위해서 사용
        *
        * hasNext(): next element가 존재하면 true, 아니면 false
        * next():    next element 반환
        * */
        strList = new LinkedList<>(strList);
        Iterator<String> iter = ((LinkedList<String>) strList).descendingIterator();
        List<String> descList = new ArrayList<>();
        while(iter.hasNext()){
            descList.add(iter.next());
        }
        System.out.println("descList: " + descList);
    }
}

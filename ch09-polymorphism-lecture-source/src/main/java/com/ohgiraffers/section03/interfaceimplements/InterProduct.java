package com.ohgiraffers.section03.interfaceimplements;

public interface InterProduct /* extends java.io.Serializable, java.util.Comparator => 다중상속 가능 */{
    /*
    * interface가 interface를 상속받을 시 extends 키워드를 이용해 여러 인터페이스를 다중 상속 받을 수 있다.
    * */

    /*
    * interface는 상수 필드만 작성 가능
    * public static final => 이 제어자 조합을 constant field(상수 필드)라고 부른다.
    *                        반드시 declaration과 동시에 initialize 해주어야 함
    * */

    public static final int MAX_NUM = 100;  // constant field
    
    // String name;
    int MIN_NUM = 10;
    
    // interface는 constructor를 가질 수 X
    // public InterProduct(){} XXX
    
    // interface는 body가 있는 non-static method를 가질 수 없다.
    // public void nonStaticMethod(){}
    
    // 추상 메소드만 작성 가능
    public abstract void nonStaticMethod();
    
    /*
    * 인스턴스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가짐. (다른 접근제한자 사용불가)
    * => interface의 method를 override 하는 경우
    * 
    * 반드시 public으로 해야 override 가능
    * */
    
    /* public abstract */ void abstMethod();
    
    // static method는 작성 가능
    public static void staticMethod(){
        System.out.println("InterProduct class의 staticMethod 호출");
    }

    // default 키워드를 사용하면 non-static method도 작성 가능 (jdk 1.8 이후 추가됨)
    public default void defaultMethod(){
        System.out.println("InterProduct class의 defaultMethod 호출");
    }
}

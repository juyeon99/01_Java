package com.ohgiraffers.section01.generic;

public class GenericTest<T> /* <A,B,C> => 여러개 설정가능 */ {
    /*
    * 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자<>를 이용하여 작성
    * <> 내부에 작성하는 영문자는 관례상 대문자로 작성
    * */
    private T value;    // 타입이 결정되지 X

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

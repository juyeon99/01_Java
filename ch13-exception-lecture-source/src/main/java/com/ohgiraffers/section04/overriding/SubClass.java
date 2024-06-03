package com.ohgiraffers.section04.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
    // 1. Exception 없이 오버라이딩 가능
//    @Override
//    public void method(){}

    // 2. 같은 Exception을 던지는 구문으로 오버라이딩 가능
//    @Override
//    public void method() throws IOException {}

    // 3. 부모의 예외처리 클래스보다 상위의 예외로는 후손클래스에서 오버라이딩 불가
//    @Override
//    public void method() throws Exception /* => XXX */{}

    // 4. 부모의 예외처리 클래스보다 더 하위의 구체적인 예외로는 후손클래스에서 오버라이딩 가능
    @Override
    public void method() throws FileNotFoundException {}

    // => Exception에서 자식클래스는 부모클래스보다 더 많은 예외를 가질 수 없다
}

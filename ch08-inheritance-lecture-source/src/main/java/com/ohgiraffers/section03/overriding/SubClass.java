package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{
    // 1. 메소드 이름을 변경하면 에러
//    @Override
//    public void method2(int num2){}

    // 2. 메소드 리턴타입을 변경하면 에러
//    @Override
//    public int method(int num){
//        return num;
//    }

    // 3. parameter 개수/타입 변경하면 에러
//    @Override
//    public void method(String name){}

    // 메소드 이름, 리턴타입, parameter 개수/타입
    @Override
    public void method(int num){}

    // 4. private 메소드는 override 불가
//    @Override
//    private void privateMethod(){}

    // 5. final 메소드도 override 불가 -> final: 변경불가
//    @Override
//    public final void finalMethod(){}

    // 6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
//    @Override
//    void protectedMethod(){}  // 더 좁은 범위로는 불가

//    @Override
//    protected void protectedMethod(){}  // 같은 범위로는 가능

    @Override
    public void protectedMethod() {} // 더 넓은 범위로 가능

    // class에서도 final 키워드 추가 가능 => 상속 제한
}

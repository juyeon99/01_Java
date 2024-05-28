package com.ohgiraffers.section03.overriding;

public /* final => 클래스 전체가 변경 불가 => 상속 불가 */ class SuperClass {
    /*
    * Override
    *
    * 부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하여 사용하는 것
    *
    * 성립요건
    * 1. 동일한 메소드 이름
    * 2. 동일한 메소드 리턴타입
    * 3. 동일한 parameter의 타입, 개수, 순서
    * 4. private 메소드는 override 불가
    * 5. final 메소드도 override 불가 -> final: 변경불가
    * 6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
    * 7. 예외처리는 같은 예외이거나 더 구체적인(하위) 예외를 처리해야함
    * */

    public void method(int num){}
    private void privateMethod(){}
    public final void finalMethod() {}
    protected void protectedMethod(){}

}

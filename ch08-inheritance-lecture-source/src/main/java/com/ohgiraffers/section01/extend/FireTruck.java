package com.ohgiraffers.section01.extend;

public class FireTruck extends Car{
    /*
    * Car 클래스를 부모클래스로, FireTruck 클래스를 자식 클래스로 사용한다는 뜻
    * Car의 모든 멤버 -> FireTruck로 상속을 받음
    *
    * Generator는 상속받지 못함
    * 부모의 private 멤버는 접근 불가
    * */

    public FireTruck(){
        // calls parent class' constructor
        // 컴파일러가 자동으로 추가해줘서 작성하지 않아도 됨
//        super();

        System.out.println("FireTruck default constructor");
    }

    /*
    * @Override
    * overriding이 정상적으로 작성된 것인지 체크해주는 기능
    * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 함
    * */
    @Override
    public void soundHorn(){
        /*
        * isRunning은 private일 때만 사용이 불가능했지만
        * protected로 바꿔 사용가능하게 함
        * (캡슐화 위배) 그나마 범위가 좁은 것으로 대체
        * */
        if (isRunning()){
            System.out.println("빵빵빵빵빵빵빵빵");
        } else{
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요.");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }
}

package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {
        /*
        * 상속
        *
        * 상속은 부모가 가지고 있는 재산(클래스가 가진 멤버)를 자식이 물려받는다는 의미
        * 클래스 또한 부모클래스와 자식클래스로 역할을 나누어서 부모가 가지는 멤버를 자식이 물려받아 자기의 멤버인 것처럼 사용
        *
        * 단순히 물려받는 개념보다 부모 클래스의 확장(extend)이라는 개념을 가짐
        * 물려받아서 자신의 것처럼 사용하는 것 뿐만 아니라 추가적인 멤버도 작성이 가능
        *
        * 메소드 재정의(overriding)을 이용해서 부모가 가진 메소드를 재정의하는 것도 가능
        * */

        /*
        * overriding
        *
        * 부모가 가지는 메소드 선언부를 그대로 사용하면서
        * 자식 클래스가 정의한 메소드대로 동작하도록 body 부분을 새롭게 다시 작성하는 것
        * 메소드 호출시 재정의한 메소드가 우선적으로 동작함
        * */

        /*
        * inheritance의 장단점
        * 1. 장점
        *   1-1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용할 수 있다.
        *       a) 재사용시 생산성을 크게 향상시킬 수 있다.
        *       b) 공통적으로 사용하는 코드가 부모클래스에 존재하면 수정사항이 생길 시
        *          부모클래스만 수정해도 전체적으로 적용됨 (유지보수성 증가)
        *   1-2. 클래스간의 계층 관계가 형성되며 다형성의 문법적인 토대가 된다.
        *
        * 2. 단점
        *   2-1. 부모클래스의 기능을 추가/변경시 자식클래스가 정상적으로 동작하는지에 대한 예측이 힘듦
        *   2-2. 부모클래스의 변경이 쉽지 않다. 자식클래스에서 중요하게 사용하는 기능인 경우
        *        부모클래스를 변경할 시 자식 클래스에 모두 영향
        *   2-3. 부모클래스에서 의미있던 기능이 자식클래스에서는 무의미할 수 있다.
        * */

        /*
        * 장점과 단점을 고려했을 때 상속을 사용하는 때가 언젠지 정해서 잘 사용해야 함
        * 상속이 IS-A 관계로 구분되는 경우에 사용해야 함
        *
        * fireTruck is a car != car is a fireTruck
        * */

        /*
        * OOP 설계 관점에서 바라보는 inheritance
        *
        * 모든 객체는 자신이 수신한 메세지에 대한 응답을 해야하는 책임을 가지며, 그 책임의 규모는 적절해야 한다.
        * 적절한 책임을 가진 객체들이 서로 협력(메세지 수신과 응답)을 통해 프로그램을 동작하는 것 => OOP
        * */

        System.out.println("========== 그냥 차 ==========");
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        // 소방차
        System.out.println();
        System.out.println("========== 소방차 ==========");
        FireTruck fireTruck = new FireTruck();

        fireTruck.soundHorn();
        fireTruck.run();
        fireTruck.soundHorn();
        fireTruck.stop();
        fireTruck.soundHorn();
        fireTruck.sprayWater();

        // 레이싱카
        System.out.println();
        System.out.println("========== 레이싱카 ==========");
        RacingCar racingCar = new RacingCar();

        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

    }
}

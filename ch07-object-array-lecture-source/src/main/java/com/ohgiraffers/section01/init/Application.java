package com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {
        /*
         * 객체배열
         *
         * 객체배열은 레퍼런스변수에 대한 배열이다.
         * 생성한 인스턴스도 배열을 이용해서 관리하면
         * 동일한 타입의 여러개 인스턴스를 각각 취급하지 않고 연속 처리할수 있어서 좋다.
         * 또한 반환값은 1개의 값만 반환 할 수 있기 때문에
         * 동일 타입의 여러 인스턴스를 반환해야하는 경우 객체배열을 이용할 수 있다.
         * */

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티베이론", 400);
        Car car5 = new Car("포터", 500);

        System.out.println("================== 객체 배열 이용 안함 ==================");
        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] carArray = new Car[5];

//        carArray[0] = car1;
//        carArray[1] = car2;
//        carArray[2] = car3;
//        carArray[3] = car4;
//        carArray[4] = car5;

        // 배열에 생성한 객체로 초기화 가능.
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티베이론", 400);
        carArray[4] = new Car("포터", 500);

        System.out.println("============== 객체 배열 이용 ===============");
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

        // 객체 배열도 할당과 동시에 초기화 가능
        Car[] carArray2 = {car1, car2, car3, car4, car5};

        Car[] carArray3 = {
                new Car("페라리", 300)
                , new Car("람보르기니", 350)
                , new Car("롤스로이스", 250)
                , new Car("부가티베이론", 400)
                , new Car("포터", 500)
        };

        System.out.println("=========== 할당과 동시에 초기화 ============");
        for (Car c : carArray3) {
            c.driveMaxSpeed();
        }
    }
}

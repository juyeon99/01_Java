package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.setName("드라큘라");
        monster1.setHp(200);

        Monster monster2 = new Monster();
        monster2.setName("프랑켄슈타인");
        monster2.setHp(300);

        Monster monster3 = new Monster();
        monster3.setName("미이라");
        monster3.setHp(400);

        Monster monster4 = new Monster();
        monster4.setName("늑대인간");
        monster4.setHp(500);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        // 1. 사람이 실수해서 hp를 음수로 만드는 문제 해결
        // 2. 필드명을 수정했을 때 필드를 직접적으로 사용하는 다른 클래스들에서 컴파일 에러가 나와서
        //    유지보수가 어려워지는 문제 해결

        // 하지만 여전히 필드에 직접적으로 접근할 수 있기 때문에 완벽히 문제가 해결되진 않음
        monster1.name = "두치";
        monster1.hp = -1000;

        System.out.println(monster1.getInfo());
    }
}

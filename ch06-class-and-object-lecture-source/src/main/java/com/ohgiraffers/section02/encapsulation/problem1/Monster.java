package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    // hp에 음수가 저장되는 것을 막고자 hp가 양수인 경우에만 입력할 수 있게 변경하고
    // 0보다 작은 경우 0으로 변경할 수 있도록
    public void setHp(int hp){
        /*
        * this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 ref var
        * local var와 global var의 이름이 같으면 local var을 우선적으로 접근하기 때문에
        * global var에 접근하기 위해서 this.를 명시해야 함
        * */
        if(hp > 0){
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            this.hp = hp;
        } else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
            this.hp = 0;
        }
    }
}

package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
    String name;
    int hp;

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        if(hp > 0){
            this.hp = hp;
        } else{
            this.hp = 0;
        }
    }

    public String getInfo(){
        String info = "몬스터의 이름: " + this.name + ", 체력: " + this.hp;
        return info;
    }
}

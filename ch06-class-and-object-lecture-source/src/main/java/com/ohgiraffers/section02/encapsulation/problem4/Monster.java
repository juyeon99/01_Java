package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {
    private String kinds;
    private int hp;

    public void setKinds(String kinds){
        this.kinds = kinds;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public String getInfo(){
        return "몬스터의 종류: " + this.kinds + ", 체력: " + this.hp;
    }
}

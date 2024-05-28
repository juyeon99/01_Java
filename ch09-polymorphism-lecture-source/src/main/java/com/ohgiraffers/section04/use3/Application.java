package com.ohgiraffers.section04.use3;

public class Application {
    public static void main(String[] args) {
//        Dice dice = new HellDice();
        Dice dice = new SuperDice();
        Dicer dicer = new Dicer();
        dicer.throwDice(dice);
    }
}

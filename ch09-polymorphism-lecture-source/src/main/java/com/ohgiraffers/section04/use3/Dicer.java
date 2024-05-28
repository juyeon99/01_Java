package com.ohgiraffers.section04.use3;

public class Dicer {
    public void throwDice(Dice dice){
        int diceNumber = dice.getNumber();
        System.out.println("나온 숫자: [" + diceNumber + "]");
    }
}

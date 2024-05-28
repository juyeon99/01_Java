package com.ohgiraffers.subproject;

public class Barista {
    /*
    * 주문에 따라 커피를 만들어야함.
    * */
    private int coffeeStock = 200; // 200g 커피보유

    public Coffee[] makeCoffee(Order order) {

        // 재고 차감 처리 - 커피한잔에 20g 사용

        // 커피 생성
        Coffee[] coffees = new Coffee[order.getCount()];

        for(int i = 0; i < coffees.length; i++ ){
            coffees[i] = new Coffee(order.getMenuName(), order.getOption());
        }

        return coffees;
    }
}

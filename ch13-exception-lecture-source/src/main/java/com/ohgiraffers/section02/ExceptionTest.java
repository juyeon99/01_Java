package com.ohgiraffers.section02;

import com.ohgiraffers.section02.exception.MoneyNegativeException;
import com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception{
        if (money < 0){
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if (price < 0){
            throw new PriceNegativeException("상품 금액은 음수일 수 없습니다.");
        }

        if(money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다!!!");
        } else{
            throw new NotEnoughMoneyException("가지고 있는 돈보다 상품 금액이 더 큽니다.");
        }
    }
}

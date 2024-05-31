package com.ohgiraffers.section02.exception;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(){

    }

    public NotEnoughMoneyException(String msg) {
        super(msg);
    }
}

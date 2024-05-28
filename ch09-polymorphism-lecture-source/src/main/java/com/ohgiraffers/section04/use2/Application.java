package com.ohgiraffers.section04.use2;

public class Application {
    public static void main(String[] args) {
//        SaveProvider saveProvider = new FileSaveProvider(); // Polymorphism => type이 2개 (1. SaveProvider, 2. FileSaveProvider)
        SaveProvider saveProvider = new DatabaseSaveProvider(); // Polymorphism => type이 2개 (1. SaveProvider, 2. DatabaseSaveProvider)
        Person person = new Person(saveProvider);
        person.doSomething();
    }
}

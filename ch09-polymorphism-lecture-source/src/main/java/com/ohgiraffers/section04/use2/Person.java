package com.ohgiraffers.section04.use2;

public class Person {
    private SaveProvider saveProvider;

    // polymorphism을 이용하면 이 field들과 method들을 중복으로 적지 않아도 됨
//    private FileSaveProvider fileSaveProvider;
//    private DatabaseSaveProvider databaseSaveProvider;


    public Person(SaveProvider saveProvider){
        this.saveProvider = saveProvider;
    }

    public void doSomething(){
        String data = "문자열 데이터";
        saveProvider.save(data);
    }

    // polymorphism을 이용하면 이 method들을 중복으로 적지 않아도 됨
//    public void doSomethingFileSaveProvider(){
//        String data = "문자열 데이터";
//        fileSaveProvider.save(data);
//    }
//
//    public void doSomethingDatabaseSaveProvider(){
//        String data = "문자열 데이터";
//        databaseSaveProvider.save(data);
//    }
}

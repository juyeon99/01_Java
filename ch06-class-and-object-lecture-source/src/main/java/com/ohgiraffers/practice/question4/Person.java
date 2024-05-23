package com.ohgiraffers.practice.question4;

public class Person {
    // 나이가 30살이고 이름이 James인 남자가 있습니다.
    // 이 남자는 결혼을 했고 자식이 셋 있습니다.
    // 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    private String name;
    private int age;
    private String gender;
    private boolean isMarried;
    private int numOfChildren;

    public Person(String name, int age, String gender, boolean isMarried, int numOfChildren) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.numOfChildren = numOfChildren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    public void print(){
        if (isMarried){
            System.out.println("나이가 " + this.age + "살이고 이름이 " + this.name + "인 " + this.gender + "가 있습니다. \n" +
                    "이 " + this.gender + "는 결혼을 했고 자식이 " + this.numOfChildren +"명 있습니다. ");
        } else{
            System.out.println("나이가 " + this.age + "살이고 이름이 " + this.name + "인 " + this.gender + "가 있습니다. \n" +
                    "이 " + this.gender + "는 결혼을 안했고 자식이 " + this.numOfChildren +"명 있습니다. ");
        }

    }
}

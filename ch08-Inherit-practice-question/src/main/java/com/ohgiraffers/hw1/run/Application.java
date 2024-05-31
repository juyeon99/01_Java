package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("========== 학생 정보 ==========");
        PersonDTO[] students = new StudentDTO[3];
        StudentDTO s1 = new StudentDTO("홍길동",20,178.2,70,1,"정보시스템공학과");
        StudentDTO s2 = new StudentDTO("김말똥",21,187.3,80,2,"경영학과");
        StudentDTO s3 = new StudentDTO("강개순",23,167,45,4,"정보통신공학과");
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].information());
        }

        System.out.println("\n========== 사원 정보 ==========");
        PersonDTO[] employees = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        while (flag && count < 10){
            System.out.println("==============================");
            System.out.print("사원 정보를 추가하시겠습니까? (y/n) ");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("y")){
                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("나이: ");
                int age = sc.nextInt();
                System.out.print("신장: ");
                double height = sc.nextDouble();
                System.out.print("몸무게: ");
                double weight = sc.nextDouble();
                System.out.print("급여: ");
                int salary = sc.nextInt();
                sc.nextLine();
                System.out.print("부서: ");
                String dept = sc.nextLine();
                EmployeeDTO emp = new EmployeeDTO(name, age, height, weight, salary, dept);
                employees[count] = emp;
            } else if(input.equalsIgnoreCase("n")){
                flag = false;
            } else{
                System.out.println("잘못된 입력값입니다.");
            }

            count++;
        }

        System.out.println("\n========== 사원 정보 출력 ==========");
        for (int i = 0; i < employees.length; i++){
            if(employees[i] == null){
                break;
            }
            System.out.println(employees[i].information());
        }
    }
}

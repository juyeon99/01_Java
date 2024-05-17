package section01.conditional;

import java.util.Scanner;

public class C_IfElseIf {
    public void testSimpleIfElseStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠드리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물었다.");

        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼)");
        int input = sc.nextInt();

        if (input == 1){
            System.out.println("이런 거짓말쟁이! 너에게는 아무런 도끼도 줄 수 없구나, 이 욕심쟁이야!");
        } else if (input == 2){
            System.out.println("욕심이 과하지는 않지만, 넌 거짓말을 하고 있구나!");
        } else if (input == 3){
            System.out.println("오호 ~ 정직하구나! 금도끼, 은도끼, 쇠도끼 다 가져가거라~");
        } else{
            System.out.println("잘못 입력했구나.. 돌아가거라..");
        }
        System.out.println("그렇게.. 산신령은.. 다시 연못으로.. 사라지고 말았다..");
    }

    public void testNestedIfElseIfStatement(){
        /*
         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter score: ");
        int score = sc.nextInt();
        sc.nextLine();
        String grade = "";

        if (score <= 100 && score >= 0) {
            if (score >= 90){
                grade += "A";
                if(score >= 95){
                    grade += "+";
                }
            } else if (score >= 80){
                grade += "B";
                if(score >= 85){
                    grade += "+";
                }
            } else if (score >= 70){
                grade += "C";
                if(score >= 75){
                    grade += "+";
                }
            } else if (score >= 60){
                grade += "D";
                if(score >= 65){
                    grade += "+";
                }
            } else{
                grade += "F";
            }
            System.out.println("name: " + name + "\nscore: " + score + "\ngrade: " + grade);
        } else{
            grade += "invalid";
            System.err.println("Invalid score");
        }
    }
}

package section01.conditional;

import java.util.Scanner;

public class D_switch {
    /*
    * [switch문 표현식]
    *
    * switch([비교할 변수]){
    *   case [비교값1]: 비교값1과 일치하는 경우 실행할 구문;
    *                  break;
    *   case [비교값2]: 비교값2와 일치하는 경우 실행할 구문;
    *                  break;
    *   default: case에 모두 해당하지 않는 경우 실행할 구문;
    *            break;
    * }
    *
    * 여러개의 비교값중 일치하는 조건에 해당하는 로직을 실행하는 것
    * switch문으로 비교가능한 값은 정수, 문자, 문자열 형태
    * 정확하게 일치하는 경우만 비교가능. 대소비교를 할 수 없다.
    * case절에는 변수를 사용 할 수 없다. (값만 비교 가능)
    * */

    public void testSimpleSwitchStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력(+,-,*,/,%): ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            // 산술연산 외에 다른 문자에 대한 처리는 생략하였음. (default를 안쓴 이유)
        }

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void testSwitchVendingMachine(){
        /*
        * switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
        * 1. JDK 1.7 이상부터 switch 문을 이용해 문자열을 비교 할 수 있다.
        * 2. break;를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
        * */

        System.out.println("==== Vending machine ====");
        System.out.println("사이다 콜라 환타 박카스 솔의눈");
        System.out.println("=========================");
        System.out.print("음료를 선택해 주세요: ");
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();
        int price = 0;

        switch (selectedDrink){
            case "사이다":
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
                break;
            case "콜라":
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
                break;
            case "환타":
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
                break;
            case "박카스":
                System.out.println("박카스를 선택하셨습니다.");
                price = 800;
                break;
            case "솔의눈":
                System.out.println("솔의눈을 선택하셨습니다.");
                price = 1800;
                break;
            default:
                System.out.println("?");
        }
        if(price > 0){
            System.out.println(price + "원을 투입해주세요.");
        }
    }

    public void testSwitchAx(){
        Scanner sc = new Scanner(System.in);
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠드리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물었다.");

        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼)");
        String input = sc.nextLine();

        switch (input){
            case "1", "금도끼":
                System.out.println("이런 거짓말쟁이! 너에게는 아무런 도끼도 줄 수 없구나, 이 욕심쟁이야!");
                break;
            case "2", "은도끼":
                System.out.println("욕심이 과하지는 않지만, 넌 거짓말을 하고 있구나!");
                break;
            case "3", "쇠도끼":
                System.out.println("오호 ~ 정직하구나! 금도끼, 은도끼, 쇠도끼 다 가져가거라~");
                break;
            default:
                System.out.println("잘못 입력했구나.. 돌아가거라..");
        }

        System.out.println("그렇게.. 산신령은.. 다시 연못으로.. 사라지고 말았다..");
    }
}

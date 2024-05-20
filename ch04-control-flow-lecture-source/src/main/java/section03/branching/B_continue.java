package section03.branching;

public class B_continue {
    /*
    * continue는 반복문 내에서 사용
    *
    * 해당 반복문의 반복회차를 중간에 멈추고, 다시 증감식으로 넘어가게 해준다.
    * 일반적으로 if(조건식) { continue; }처럼 사용
    * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 사용
    * */

    public void testSimpleContinueStatement(){
        // 1~100 사이의 모든 4와 5의 공배수
        for(int i = 1; i <= 100; i++){
            if((i % 4 == 0) && (i % 5 == 0)){
                System.out.println(i);
            } else{
                continue;
            }
            System.out.println("공배수를 찾았습니다.");  // 공배수가 아닐경우에는 continue;때문에 실행 안됨
        }
    }

    public void testSimpleContinueStatement2(){
        // continue도 모든 반복문을 건너뛰는 것이 아니라, 자신에게 가장 인접한 loop만 건너뜀

        int dan = 2;
        while (dan < 10){
            int n = 1;
            while (n < 10){
                if(n % 2 == 0){
                    // n이 짝수일 경우 아래 문장을 출력하지 않음
                    n++;    // since continue is blocking the next statement, should do n++ before continue, otherwise it won't stop.
                    continue;
                }
                System.out.println(dan + " * " + n + " = " + dan*n++);    // in this case, n++ won't be running bc of continue;
            }
            dan++;
            System.out.println();
        }

        // for loop version
//        for(int dan = 2; dan < 10; dan++) {
//            System.out.println(dan + "단 입니다.");
//            for (int n = 1; n < 10; n++) {
//                if (n % 2 == 0) {
//                    // n이 짝수일 경우 아래 문장을 출력하지 않고 증감식으로 이동
//                    continue;
//                }
//                System.out.println(dan + " * " + n + " = " + (dan * n));
//            }
//            System.out.println();
//        }
    }

    public void testJumpContinue(){
        int dan = 1;

        label:
        while (dan < 10){
            dan++;  // label이 있으므로 이 위치에 있어야 dan++;가 실행가능
            System.out.println(dan + "단 입니다.");
            int n = 1;
            while (n < 10){
                if(n % 2 == 0){
                    // n이 짝수일 경우 아래 문장을 출력하지 않음
                    continue label;
                }
                System.out.println(dan + " * " + n + " = " + dan*n++);
            }
            // dan++;   // label이 있으므로 dan++;가 맨 위로 가야지만 실행가능. 이 위치에 있으면 dan은 매번 2이므로 무한루프
            System.out.println();
        }


        // for loop version
//        label:
//        for(int dan = 2; dan < 10; dan++){
//            System.out.println(dan + "단 입니다.");
//            for(int n = 1; n < 10; n++){
//                if(n % 2 == 0) {
//                    // n이 짝수일 경우 증감식으로 이동
//                    continue label;
//                }
//                System.out.println(dan + " * " + n + " = " + (dan*n));
//            }
//            System.out.println();
//        }
    }
}

package section03.branching;

public class A_break {
    public void testSimpleBreakStatement(){
        int sum = 0;
        int i = 1;
        while(true){
            sum += i;
            if (i++ == 100){
                break;
            }
        }
        System.out.println("1~100의 합: " + sum);
    }

    public void testSimpleBreakStatement2() {
        int dan = 2;
        while (dan < 10){
            int n = 1;
            while (n < 10){
                if(dan > 5){
                    break;
                }
                System.out.println(dan + " * " + n + " = " + dan*n++);
            }
            dan++;
            System.out.println();
        }
    }

    public void testJumpBreak(){
        label:      // 지정된 곳으로 나가게 함
        for(;;){
            for(int i = 0; i < 10; i++){
                System.out.println(i);
                if(i == 3){
                    break label;    // label이 있는 곳으로 나감
                }
            }

        }
    }
}

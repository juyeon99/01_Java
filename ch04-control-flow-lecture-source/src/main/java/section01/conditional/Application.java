package section01.conditional;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        A_If a = new A_If();
//        a.testSimpleIfStatement();
//        a.testNestedIfStatement();

        B_IfElse b = new B_IfElse();
//        b.testSimpleIfElseStatement();
//        b.testNestedIfElseStatement();

        C_IfElseIf c = new C_IfElseIf();
//        c.testSimpleIfElseStatement();
//        c.testNestedIfElseIfStatement();

        D_switch d = new D_switch();
//        d.testSimpleSwitchStatement();
//        d.testSwitchVendingMachine();
        d.testSwitchAx();
    }
}

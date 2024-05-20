package section02.looping;

public class Application {
    public static void main(String[] args) {
        A_for a_for = new A_for();
//        a_for.testSimpleForLoop();
//        a_for.testForExample1();
//        a_for.sum();
//        a_for.sumRandNums();
//        a_for.sumInput();
//        a_for.printSimpleGugudan();

        A_nestedFor a_nestedFor = new A_nestedFor();
//        a_nestedFor.printGugudanFromTwoToNine();
//        a_nestedFor.printUpgradedGugudanFromTwoToNine();
//        a_nestedFor.printStarInputRowTimes();
//        a_nestedFor.printTriangleStars();
//        a_nestedFor.printTriangleStarsInReverse();
//        a_nestedFor.printSymTriangleStars();
        a_nestedFor.printPyramidTriangleStars();

        B_while b_while = new B_while();
//        b_while.testSimpleWhileLoop();
//        b_while.testWhileExample1();
//        b_while.testWhileExample2();
//        b_while.testWhileExample3();

        C_doWhile c_doWhile = new C_doWhile();
//        c_doWhile.testSimpleDoWhileLoop();
//        c_doWhile.testDoWhileExample1();
    }
}

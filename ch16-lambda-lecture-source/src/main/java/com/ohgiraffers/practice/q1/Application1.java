package com.ohgiraffers.practice.q1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class Application1 {
    public static void main(String[] args) {
        Application1 app = new Application1();
        app.test1();
//        app.test2();
//        app.test3();
//        app.test4();
//        app.test5();
    }

    // 1. 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
    private void test1() {
        // (1) 함수형 인터페이스 - Supplier
//        Supplier<LocalTime> supplier = () -> LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
//        LocalTime localTime = supplier.get();
//        System.out.println(localTime);

        // (2) 함수형 인터페이스 - Consumer
        Consumer<LocalTime> consumer = time -> System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
        consumer.accept(LocalTime.now());

        // (3) 람다식
//        new TimeImpl().currentTime();
    }

    @FunctionalInterface
    public interface Time {
        public void currentTime();
    }

    public class TimeImpl implements Time {
        @Override
        public void currentTime(){
            System.out.println(LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"))));
        }
    }

    // 2. 로또를 생성하는 람다식을 작성하세요.
    private void test2() {
        // (1) 함수형 인터페이스 - IntSupplier
//        Set<Integer> set = new TreeSet<>();
//        IntSupplier intSupplier = () -> (int) (Math.random() * 45) + 1;
//        while(set.size() < 6){
//            set.add(intSupplier.getAsInt());
//        }

        // (2) 함수형 인터페이스 - Supplier<T>
        Supplier<Set<Integer>> supplier =
            () -> {
                Set<Integer> treeSet = new TreeSet<>();
                while(treeSet.size() < 6){
                    treeSet.add((int) (Math.random() * 45) + 1);
                }
                return treeSet;
            };

        // (3) 람다식
//        Set<Integer> set = new LotteryImpl().getRandNumSet();

        System.out.println("Lotto = " + supplier.get());
    }

    @FunctionalInterface
    public interface Lottery {
        public Set<Integer> getRandNumSet();
    }

    public class LotteryImpl implements Lottery {
        @Override
        public Set<Integer> getRandNumSet(){
            Set<Integer> set = new TreeSet<>();
            while(set.size() < 6){
                set.add((int) (Math.random() * 45) + 1);
            }
            return set;
        }
    }

    // 3. 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
    //    1달러 = 1350원
    private void test3() {
        System.out.print("원화 입력: ");
        Scanner sc = new Scanner(System.in);
        double won = sc.nextDouble();
        System.out.println(won + "원 => $" + new CurrencyExchangeImpl().wonToDollar(won));
    }

    @FunctionalInterface
    public interface CurrencyExchange {
        public double wonToDollar(double won);
    }

    public class CurrencyExchangeImpl implements CurrencyExchange {
        @Override
        public double wonToDollar(double won){
            return won/1350;
        }
    }

    // 4. 위 문제를 jdk가 제공하는 Function 함수형 인터페이스 형식에 맞게 변형하세요.
    private void test4() {
        DoubleFunction<Double> doubleFunction =
                (won) -> (won/1350);

        Function<Double,Double> function =
                (won) -> {
                    double dollar = (won/1350);
                    return (won/1350);
                };

        System.out.print("원화 입력: ");
        Scanner sc = new Scanner(System.in);
        double won = sc.nextDouble();
        System.out.println("= $" + doubleFunction.apply(won));
    }

    // 5. 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
    //    문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");
        // 함수형 인터페이스
//        Predicate<String> predicate = str -> str.trim().isEmpty();
//        for (String s : strList){
//            System.out.println(s + ":\t" + predicate.test(s));
//        }

        // 람다식
        new CheckStringImpl().checkEmptyStr(strList);
    }

    @FunctionalInterface
    public interface CheckString{
        public void checkEmptyStr(List<String> list);
    }

    public class CheckStringImpl implements CheckString{
        @Override
        public void checkEmptyStr(List<String> list) {
            for (String str : list){
                System.out.println("[" + str + "]의 길이는 0입니까?\t" + str.trim().isEmpty());
            }
        }
    }
}

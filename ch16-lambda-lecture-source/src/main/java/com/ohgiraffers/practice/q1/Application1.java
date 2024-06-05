package com.ohgiraffers.practice.q1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class Application1 {
    public static void main(String[] args) {
        Application1 app = new Application1();
//        app.test1();
//        app.test2();
//        app.test3();
        app.test4();
//        app.test5();
    }

    // 1. 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
    private void test1() {
        // (1) 함수형 인터페이스 - Supplier
//        Supplier<LocalTime> now1 = () -> LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
//        LocalTime localTime = now1.get();
//        System.out.println(localTime);

        // (2) 함수형 인터페이스 - Consumer
        Consumer<LocalTime> now2 = time -> System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
        now2.accept(LocalTime.now());

        // (3) Runnable
//        Runnable now3 = () -> {
//            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
//        };
//        now3.run();

        // (4) 람다식
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
        // Set: 중복저장 허용 X
        // TreeSet: 자동 정렬
        // Collection -> 컬렉션에서 다룰 수 있는 데이터는 기본적으로 Object만 가능 -> Integer를 사용한 이유

        // (1) 함수형 인터페이스 - IntSupplier
//        Set<Integer> set = new TreeSet<>();
//        IntSupplier lotto = () -> (int) (Math.random() * 45) + 1;
//        while(set.size() < 6){
//            set.add(lotto.getAsInt());
//        }

        // (2) 함수형 인터페이스 - Supplier<T>
        Supplier<Set<Integer>> lotto =
            () -> {
                Set<Integer> treeSet = new TreeSet<>();
                while(treeSet.size() < 6){
                    treeSet.add((int) (Math.random() * 45) + 1);
                }
                return treeSet;
            };

        // (3) 람다식
//        Set<Integer> set = new LotteryImpl().getRandNumSet();

        System.out.println("Lotto = " + lotto.get());
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
        System.out.println("￦" + won + " = $" + new CurrencyExchangeImpl().wonToDollar(won));
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
        DoubleFunction<Double> currencyExchange =
                (won) -> (won/1350);

//        Function<Double,Double> currencyExchange2 =
//                (won) -> {
//                    // double dollar = (won/1350);
//                    return (won/1350);
//                };

        BiFunction<Double,Double,Double> currencyExchange3 =
                (won,rate) -> (won/rate);

        System.out.print("원화 입력: ");
        Scanner sc = new Scanner(System.in);
        double won = sc.nextDouble();
        System.out.print("달러 환율 입력: ");
        double rate = sc.nextDouble();
        System.out.println("￦" + won + " = $" + currencyExchange3.apply(won,rate));
    }

    // 5. 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
    //    문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
    private void test5() {
        // List를 만드는 방법 1
        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("");
        strList.add("대한민국");
        strList.add("    ");

        // List를 만드는 방법 2
        /* Arrays.asList(): 나열된 값을 리스트로 만들어준다.
           asList()로 만든 리스트의 경우, 컬렉션 프레임워크가 아닌
           Arrays 클래스 내부의 static inner class로 만들어진다.
           -> 추가/삭제 불가. 변경만 가능 */
        List<String> strList2 = Arrays.asList("abc", "", "대한민국", "   ");
        // strList2.add("추가 삭제 불가"); // XXX => unsupportedOperationException 발생
        // strList2.clear(); // XXX => unsupportedOperationException 발생

        // List를 만드는 방법 3
        /* List.of(): 팩토리 메소드, 나열된 값을 리스트로 만들어준다.
           List.of()로 만든 리스트는 ImmutableCollections 객체의 내부클래스인 List 클래스로 List를 생성 */
        // List<String> strList3 = List.of("1","2");
        // strList3.add("추가 삭제 불가");  // XXX => unsupportedOperationException 발생
        // strList2.clear(); // XXX => unsupportedOperationException 발생
        List<String> strList4 = new ArrayList<>(List.of("1","2"));  // ArrayList로 변환시키면 추가/삭제 가능

        /*
        * List.of(), Arrays.asList()
        * -> 추가, 삭제 불가능한 이유: 불변객체이어야 다른 컬렉션으로 변환이 용이하기 때문
        * */


        // 1. 함수형 인터페이스
//        Predicate<String> isLengthZero = str -> str.trim().length() == 0;
//        for (String s : strList){
//            System.out.println(s + ":\t" + isLengthZero.test(s));
//        }

        // 2. 람다식
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

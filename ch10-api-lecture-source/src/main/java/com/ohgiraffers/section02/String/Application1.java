package com.ohgiraffers.section02.String;

public class Application1 {
    // String class의 자주 사용하는 메소드
    public static void main(String[] args) {
        /*
        * charAt(): 문자열의 특정 인덱스에 해당하는 문자를 반환
        *           인덱스를 벗어나면 IndexOutOfBoundsException
        * */
        String str1 = "apple";
        for (int i = 0; i < str1.length(); i++){
            System.out.println("charAt(" + i + ") = " + str1.charAt(i));
        }

        /*
        * compareTo(): 인자로 전달된 문자열과 사전순으로 비교하여 두 문자열이 같다면 0,
        *              인자로 전달된 문자열보다 작으면 음수, 크면 양수 반환
        *              대소문자를 구분하여 비교
        * */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        // 같으면 0 반환
        System.out.println("compareTo() = " + str2.compareTo(str3));

        // 대문자와 소문자 차이는 32
        System.out.println("compareTo() = " + str2.compareTo(str4));
        System.out.println("compareTo() = " + str4.compareTo(str2));

        // compareToIgnoreCase(): 대소문자 구분X
        System.out.println("compareTo() = " + str3.compareToIgnoreCase(str4));

        /*
        * concat(): 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환
        *           원본 문자열에는 영향을 주지 않는다.
        * */
        System.out.println("concat() = " + (str2.concat(str5)));
        System.out.println("str2 = " + str2);

        /*
        * indexOf(): 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치 반환
        *            단, 일치하는 문자가 없을 때에는 -1 반환
        * */
        String indexStr = "java oracle";
        System.out.println("indexStr('a') = " + indexStr.indexOf('a'));
        System.out.println("indexStr('z') = " + indexStr.indexOf('z'));

        /*
        * trim(): 문자열의 앞 뒤 공백 제거
        *         원본에 영향 X
        * */
        String trimStr = "      java oracle      ";
        System.out.println("trimStr.trim() = " + trimStr.trim());
        System.out.println("trimStr = " + trimStr); // 원본에 영향 X

        /*
        * toLowerCase()
        * toUpperCase()
        * */
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() = " + caseStr.toLowerCase());
        System.out.println("toUpperCase() = " + caseStr.toUpperCase());
        System.out.println("caseStr = " + caseStr); // 원본에 영향 X

        /*
        * substring(): 문자열의 일부분을 잘라내어 새로운 문자열을 반환
        *              원본에 영향 X
        * */
        String javaoracle = "javaoracle";
        System.out.println("substring(3,6) = " + javaoracle.substring(3,6)); // [3,6)
        System.out.println("substring(3) = " + javaoracle.substring(3)); // [3,)
        System.out.println("javaoracle = " + javaoracle); // 원본에 영향 X

        /*
        * replace(): 문자열에서 대체할 문자열로 기존 문자열 변경해서 반환
        *            원본에 영향 X
        * */
        System.out.println("replace() = " + javaoracle.replace("java", "python"));
        System.out.println("javaoracle = " + javaoracle); // 원본에 영향 X

        /*
        * length(): 문자열의 길이 반환
        *           길이가 0인 문자열은 null과는 다르다.
        * */
        System.out.println("length() = " + javaoracle.length());
        System.out.println("빈문자열의 길이 = " + "".length());

        /*
        * isEmpty(): 문자열의 길이가 0이면 true, 아니면 false
        *            길이가 0인 문자열은 null과는 다르다.
        * */
        System.out.println("isEmpty() = " + "".isEmpty());
        System.out.println("isEmpty() = " + "abc".isEmpty());

//        String nullStr = null;
//        System.out.println("isEmpty() = " + nullStr.isEmpty()); // nullPointerException
    }
}

package kr.hs.dgsw.java.string;

public class StringIndexOf {
    static void showPosition(String str, String pattern) {
        System.out.println("str : " + str + "\npattern : " + pattern + "\nposition : " + str.indexOf(pattern) + "\n");
    }

    static void showPosition(String str, String pattern, int fromIndex) {
        System.out.println("str : " + str + "\npattern : " + pattern + "\nposition : " + str.indexOf(pattern, fromIndex) + "\n");
    }

    public static void main(String[] args) {
        String str1 = "죽는 날까지 하늘을 우러러 한 점 부끄럼 없기를";
        String str2 = "Hello world!";

        showPosition(str1, "죽는");
        showPosition(str1, "하늘");
        showPosition(str2, "world");
        showPosition(str2, "abcd");
        showPosition(str2, "l");

        showPosition(str2, "l", 2);
        showPosition(str2, "l", 5);
        showPosition(str2, "l", 10);
    }
}

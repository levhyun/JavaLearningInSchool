package kr.hs.dgsw.java.string;

public class StringLength {
    static void showLength(String str) {
        System.out.println("str : \"" + str + "\"\nlenght : " + str.length());
    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "홍길동";

        showLength(str1);
        showLength(str2);
    }
}

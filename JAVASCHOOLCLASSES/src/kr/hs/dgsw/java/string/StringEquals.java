package kr.hs.dgsw.java.string;

public class StringEquals {
    void study() {
        String name = "John";
        String name1 = "John";
        String name2 = "Peter";
        String name3 = new String("John");
        String name4 = new String("John");

        showEquvlent(name, name1);
        showEquvlent(name1, name2);
        showEquvlent(name, name3);
        showEquvlent(name3, name4);

        showEquals(name, name1);
        showEquals(name1, name2);
        showEquals(name, name3);
        showEquals(name3, name4);
    }

    void showEquvlent(String str1, String str2) {
        boolean result = str1 == str2;
        System.out.println(str1 + " == " + str2 + " : " + result);
    }

    void showEquals(String str1, String str2) {
        boolean result = str1.equals(str2);
        System.out.println("str1.equals(str2) : " + str1 + ", " + str2 + " = " + result);
    }

    public static void main(String[] args) {
        StringEquals se = new StringEquals();
        se.study();
    }
}

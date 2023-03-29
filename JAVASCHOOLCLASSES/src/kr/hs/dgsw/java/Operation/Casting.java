package kr.hs.dgsw.java.Operation;

public class Casting {
    public static void main(String[] args) {
        int value = 3;
        double value2 = 3;

        value = (int) 3.14; // 3

        long value3 = value;

//        boolean bool = (boolean) value;

        char ch = 'A';
        value2 = (int) ch;

        String str = "123";
//        value = (int) str;
    }
}

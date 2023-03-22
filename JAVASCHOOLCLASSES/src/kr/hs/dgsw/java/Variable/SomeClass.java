package kr.hs.dgsw.java.Variable;

public class SomeClass {
    String name;
    int count;

    static final String VALUE = "Final Variable";
    static final double PI = 3.1415926;

    public static void main(String[] args) {
        SomeClass some = new SomeClass();
        some.name = "홍길동";
        some.count = (some.name).length();
        int temp = some.count + 1;
        System.out.println("some.name = " + some.name + "\nsome.count = " + some.count + "\ntemp = " + temp);

        {
            int value = 1;
            System.out.println("\nvalue = " + value + "\n");
        }
//        System.out.println("\nvalue = " + value);

        for (int i = 0; i < 4; i++) {
            int vlaue = i;
            System.out.println("vlaue = " + vlaue);
        }

        final int value = 3;
//        value = 4;

        final int value2;
        value2 = 4;
//        value2 = 5;

        System.out.println("\nVALUE = " + VALUE);
        System.out.println("PI = " + PI);
    }
}

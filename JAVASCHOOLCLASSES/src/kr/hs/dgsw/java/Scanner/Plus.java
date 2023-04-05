package kr.hs.dgsw.java.Scanner;

import java.util.Scanner;

public class Plus {
    public static int a;
    public static int b;
    public static int result;
    private static Scanner sc = null;
    public static int plusIntValue() {
        sc = new Scanner(System.in);

        System.out.print("Enter a number1 > ");
        a = sc.nextInt();

        System.out.print("Enter a number2 > ");
        b = sc.nextInt();

        sc.close();

        return a + b;
    }
    public static void main(String[] args) {
        result = Plus.plusIntValue();
        System.out.println("result = " + result);
    }
}

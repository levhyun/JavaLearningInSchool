package kr.hs.dgsw.java.SimpleTest;

import java.util.Scanner;

public class test {
    public static void koreaMoney(int money){
        String result = "";
        if (money >= 50000) {
            result += "오만원권 " + money/50000 + "장, ";
            money%=50000;
        }

        if (money >= 10000) {
            result += "일만원권 " + money/10000 + "장, ";
            money%=10000;
        }

        if (money >= 5000) {
            result += "오천원권 " + money/5000 + "장, ";
            money%=5000;
        }

        if (money >= 1000) {
            result += "일천원권 " + money/1000 + "장, ";
            money%=1000;
        }

        if (money >= 500) {
            result += "오백원권 " + money/500 + "장, ";
            money%=500;
        }

        if (money >= 100) {
            result += "백원권 " + money/100 + "장, ";
            money%=100;
        }

        if (money >= 50) {
            result += "오십원권 " + money/50 + "장, ";
            money%=50;
        }

        if (money >= 10) {
            result += "십원권 " + money/10 + "장, ";
            money%=10;
        }

        System.out.println(result.substring(0, result.length()-2));
    }
    public static void multiplicationTable(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", dan, i ,dan*i);
        }
    }
    public static void perfectNumber(int number) {
        int sum = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.printf("%d는 완전수가 %s\n", number, sum == number ? "맞습니다." : "아닙니다.");
    }
    public static int greatestCommonDenominator(int op1, int op2) {
        int temp;
        while (op2 != 0) {
            temp = op1 % op2;
            op1 = op2;
            op2 = temp;
        }
        return op1;
    }
    public static void minimumCommonMultiple(int op1, int op2) {
        System.out.println(op1 + "과 " + op2 + "의 최소공배수는 " + (op1 * op2) / greatestCommonDenominator(op1,op2) + "입니다.");
    }
    public static void factorial(int number) {
        int sum = 1;
        for (int i = 2; i <= number; i++) {
            sum *= i;
        }
        System.out.println(number + "!는 " + sum + "입니다.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        koreaMoney(sc.nextInt()); // 1번
//        multiplicationTable(sc.nextInt()); // 2번
//        perfectNumber(sc.nextInt()); // 3번
//        minimumCommonMultiple(sc.nextInt(), sc.nextInt()); // 4번
//        factorial(sc.nextInt()); // 5번
    }
}

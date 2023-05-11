package kr.hs.dgsw.java.Inter.Calculator;

import java.util.Scanner;

public class testCalculator {
    public String add(int op1, int op2) {
        Calculator add = new Add();
        add.calculator(op1, op2);
        return add.getOperator();
    }

    public String minus(int op1, int op2) {
        Calculator minus = new Minus();
        minus.calculator(op1, op2);
        return minus.getOperator();
    }

    public static void main(String[] args) {
        testCalculator calculator = new testCalculator();
        Scanner sc = new Scanner(System.in);
        int op1 = sc.nextInt();
        int op2 = sc.nextInt();
        System.out.println(calculator.add(op1, op2));
        System.out.println(calculator.minus(op1, op2));
    }
}

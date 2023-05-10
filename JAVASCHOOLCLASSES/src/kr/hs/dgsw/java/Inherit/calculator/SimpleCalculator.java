package kr.hs.dgsw.java.Inherit.calculator;

import java.util.Scanner;

public abstract class SimpleCalculator {
    protected int op1;
    protected int op2;
    protected final Scanner scanner = new Scanner(System.in);

    public void execute() {
        while (true) {
            inputOperands();

            if (this.op1 == 0 && this.op2 == 0) {
                break;
            }

            int result = calculate();

            printResult(result);
        }

        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }

    public void inputOperands() {
        System.out.print("두 개의 정수를 입력하세요 > ");
        this.op1 = scanner.nextInt();
        this.op2 = scanner.nextInt();
    }

    public abstract int calculate();

    public abstract String getOperator();

    public void printResult(int result) {
        System.out.printf("%d %s %d = %d\n", op1, getOperator(), op2, result);
    }
}

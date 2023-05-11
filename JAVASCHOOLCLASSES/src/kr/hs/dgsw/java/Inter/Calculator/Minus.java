package kr.hs.dgsw.java.Inter.Calculator;

public class Minus implements Calculator {
    protected int op1;
    protected int op2;
    protected int result;

    public int minus() {
        return this.op1 - this.op2;
    }

    @Override
    public void calculator(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.result = minus();
    }

    @Override
    public String getOperator() {
        return this.op1 + " - " + this.op2 + " = " + this.result;
    }
}

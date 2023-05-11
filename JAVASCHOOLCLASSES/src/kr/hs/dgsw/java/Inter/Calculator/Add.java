package kr.hs.dgsw.java.Inter.Calculator;

public class Add implements Calculator {
    protected int op1;
    protected int op2;
    protected int result;

    public int add() {
        return this.op1 + this.op2;
    }

    @Override
    public void calculator(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.result = add();
    }

    @Override
    public String getOperator() {
        return this.op1 + " + " + this.op2 + " = " + this.result;
    }
}

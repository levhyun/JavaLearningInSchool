package kr.hs.dgsw.java.Inherit.calculator;

public class AddCalculator extends SimpleCalculator {
    @Override
    public int calculate() {
        return super.op1 + super.op2;
    }

    @Override
    public String getOperator() {
        return "+";
    }

    public static void main(String[] args) {
        SimpleCalculator add = new AddCalculator();
        add.execute();
    }
}

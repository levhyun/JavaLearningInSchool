package kr.hs.dgsw.java.Class;

public class Multiplier {
    private int operand1;
    private int operand2;
    private int result;

    public void setOperand1(int operand) {
        this.operand1 = operand;
    }

    public void setOperand2(int operand) {
        this.operand2 = operand;
    }

    private void multiplier() {
        for (int i = 1; i <= operand2; i++) {
            this.result += operand1;
        }
    }

    public void showResult() {
        this.multiplier();
        System.out.println(this.operand1 + " X " + this.operand2 + " = " + result);
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        multiplier.setOperand1(3);
        multiplier.setOperand2(4);
        multiplier.showResult();
    }
}

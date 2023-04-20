package kr.hs.dgsw.java.Inherit;

public class Minus extends Adder {
    @Override
    public int calculate() {
        return op1 - op2;
    }

    public static void main(String[] args) {
        Minus minus = new Minus();
        minus.setOp1(4);
        minus.setOp2(3);
        int result = minus.calculate();
        System.out.println("result : " + result);
    }
}

package kr.hs.dgsw.java.FirstClasses;

public class Adder {
    int add(int operand1, int operand2){
        return operand1 + operand2;
    }

    int add(int operand1, int operand2, int operand3){
        return add(add(operand1,operand2),operand3);
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));
        System.out.println(adder.add(1,2,3));
    }
}

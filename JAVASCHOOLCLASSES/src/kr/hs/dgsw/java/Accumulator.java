package kr.hs.dgsw.java;

public class Accumulator {
    int money;
    static Adder adder = new Adder();

    Accumulator(int num) {
        money = num;
    }

    void add(int operand) {
        money = adder.add(money, operand);
    }

    int getMoney() {
        return money;
    }

    void resetMoney() {
        money = 0;
    }

    public static void main(String[] args) {
        Accumulator accu = new Accumulator(10000);
        System.out.println("현재 "+accu.getMoney()+"원 보유중.");
        accu.add(10000);
        System.out.println("현재 "+accu.getMoney()+"원 보유중.");
        accu.add(-5000);
        System.out.println("현재 "+accu.getMoney()+"원 보유중.");
        accu.resetMoney();
        System.out.println("현재 "+accu.getMoney()+"원 보유중.");
    }
}

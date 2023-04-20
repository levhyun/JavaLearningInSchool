package kr.hs.dgsw.java.Inherit;

public class Cat extends Mammal {
    @Override
    public void move() {
        System.out.println("사뿐히 뛴다.");
    }

    public void attack() {
        System.out.println("할퀸다");
    }

    public void shouting() {
        System.out.println("야옹~");
    }

    public static void main(String[] args) {
        Mammal mammal1 = new Whale();
        Mammal mammal2 = new Cat();

//        Whale whale1 = (Whale)mammal1; // 가능
//        Cat cat1 = (Cat)mammal1; // 불가능
//
//        Cat cat2 = (Cat)mammal2; // 가능
//        Whale whale2 = (Whale)mammal2; // 불가능
    }
}

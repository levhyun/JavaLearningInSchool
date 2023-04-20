package kr.hs.dgsw.java.Inherit;

public class Whale extends Mammal {
    @Override
    public void move() {
        System.out.println("헤엄친다.");
    }

    public void spout() {
        System.out.println("물을 뿜는다.");
    }

    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.feed();
        whale.birth();
        whale.move();
        whale.die();

//        Mammal whale2 = new Whale();
//        whale2.move(); // 가능
//        whale2.spout(); // 불가능

//        Whale dolphin = (Whale)whale2;
//        dolphin.spout(); // 가능
    }
}

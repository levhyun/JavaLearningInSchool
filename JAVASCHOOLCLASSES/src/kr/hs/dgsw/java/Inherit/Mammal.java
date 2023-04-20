package kr.hs.dgsw.java.Inherit;

public class Mammal extends Animal {
    public void feed() {
        System.out.println("젖을 먹인다.");
    }

    public void birth() {
        System.out.println("태생으로 자식을 넣는다.");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("빠르게 움직인다.");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.feed();
        mammal.birth();
        mammal.move();

        // 다형성
        Animal lion = new Mammal(); // 상속한 클래스는 상속받은 클래스에 넣을수 있다.
//        Mammal dog = new Animal();
        lion.move();
//        lion.feed(); // lion은 현재 Animal 타입이기에 Mammal이 소유한 feed함수를 lion이 호출할 수 없다.

    }
}

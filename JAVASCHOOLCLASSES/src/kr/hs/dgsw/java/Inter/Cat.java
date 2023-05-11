package kr.hs.dgsw.java.Inter;

public class Cat implements Soundable, Jump{ // Soundable클래스의 메소드를 Cat클래스에서 구현한다. : implements(예약어)
    // 인터페이스 클래스를 다중으로 구현이 가능하다
    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }

    @Override
    public void jump() {
        System.out.println("점~프");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();

        Soundable pet = new Cat();
        pet.makeSound();
//        pet.jump(); // 불가능

        Jump cat = new Cat();
        cat.jump();
    }
}

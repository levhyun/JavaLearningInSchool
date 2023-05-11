package kr.hs.dgsw.java.Inter;

public class Dog implements Soundable { // Soundable클래스의 메소드를 Dog클래스에서 구현한다. : implements(예약어)
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public static void main(String[] args) {
        Dog GoldenRetriever = new Dog();
        GoldenRetriever.makeSound();

        Soundable pet = new Dog();
        pet.makeSound();
    }
}

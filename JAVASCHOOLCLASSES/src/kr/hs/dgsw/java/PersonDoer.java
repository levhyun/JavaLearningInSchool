package kr.hs.dgsw.java;

public class PersonDoer {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동");
        person1.aged(18);
        System.out.println(person1.printInformation());
    }
}

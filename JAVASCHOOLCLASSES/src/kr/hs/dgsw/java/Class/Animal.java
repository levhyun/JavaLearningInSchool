package kr.hs.dgsw.java.Class;

import kr.hs.dgsw.java.Array.Stack;

public class Animal {

    private String name;

    private static String category;

    public Animal() {
        this("없음");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void printCategory() {
        System.out.println(category);
    }

    public static void main(String[] args) {
        Animal elephant = new Animal("코끼리");
        Animal.category = "초식동물";
        System.out.printf("%s는 %s입니다.\n", elephant.name, Animal.category);
        Animal turtle = new Animal("거북이");
        Animal.category = "해양동물";
        System.out.printf("%s는 %s입니다.\n", turtle.name, Animal.category);
    }
}

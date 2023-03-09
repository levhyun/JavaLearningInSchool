package kr.hs.dgsw.java;

public class Person {
    String name;
    int age = 0;
    double height = 0.0;

    Person(String name){
        this.name = name;
    }

    void aged(int aged){
        age+=aged;
        height+=6.2*aged;
    }

    String printInformation(){
        return String.format("%s님의 나이는 %d세이고 키는 %.2fcm입니다.", name, age, height);
    }
}

package kr.hs.dgsw.java.FirstClasses;

public class School {
    String schoolName = "대구 소프트웨어 마이스터 고등학교";
    int countOfStudent = 0;

    void teach(){
        System.out.println("학생들을 가르친다");
        System.out.printf("%d %f %s",3, 3.14, "원주율");
    }

    void enroll(){
        countOfStudent++;
    }

    void graduate(){
        if(countOfStudent > 0) {
            countOfStudent--;
        }
    }

    void printInformation(){
        System.out.printf("%s에는 %d명이 재학 중입니다", schoolName, countOfStudent);
    }
}

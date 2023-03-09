package kr.hs.dgsw.java;

public class SchoolDoer {
    public static void main(String[] args){
        School school = new School();
        school.enroll();
        school.enroll();
        school.enroll();
        school.graduate();
        school.printInformation();
    }
}

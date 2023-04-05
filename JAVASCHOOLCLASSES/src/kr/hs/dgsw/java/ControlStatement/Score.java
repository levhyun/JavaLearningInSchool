package kr.hs.dgsw.java.ControlStatement;

import java.util.Scanner;

public class Score {
    public static String Calculation(int score) {
        String result = "";
        if (score >= 0 && score < 60) {
            result = "가";
        } else if (score >= 60 && score < 70) {
            result = "양";
        } else if (score >= 70 && score < 80) {
            result = "미";
        } else if (score >= 80 && score < 90) {
            result = "우";
        } else if (score >= 90 && score <= 100) {
            result = "수";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("점수를 입력하세요 > ");
        Scanner sc = new Scanner(System.in);
        System.out.println("등급 : " + Score.Calculation(sc.nextInt()));
    }
}

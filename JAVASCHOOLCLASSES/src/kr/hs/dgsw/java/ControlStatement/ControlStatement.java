package kr.hs.dgsw.java.ControlStatement;

import java.util.Scanner;

public class ControlStatement {
    public static void If() {
        boolean flag1 = false;
        boolean flag2 = true;
        if (flag1) {
            System.out.println("좋아요");
        } else if (flag2) {
            System.out.println("그저그래요");
        }else {
            System.out.println("싫어요");
        }
    }

    public static void While() {
        Scanner scanner = new Scanner(System.in);
        String str = "";

        // while
        while(!str.equals("그만")) {
            System.out.printf("문자를 입력하세요 > ");
            str = scanner.next();
            System.out.println("str = " + str);
        }

        // do while
//        do {
//            System.out.printf("문자를 입력하세요 > ");
//            str = scanner.next();
//            System.out.println("str = " + str);
//        } while (!str.equals("그만"));

        scanner.close();
    }

    public static void For() {
        int sum = 0;
        int sum2 = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        for (int i = 2; i <= 100; i+=2) {
            sum2 += i;
        }

        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);
    }
    
    public static void ForEach() {
        String[] colors = new String[] {"red", "yellow", "green", "blue", "pink"};
//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }
        for (String color : colors) {
            System.out.printf("%s ",color);
        }
    }

    public static void Switch() {
        int value = 1;
        switch (value) {
            case 1:
                System.out.println("Very nice");
                break;
            case 2:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("not bad");
                break;
            default:
                System.out.println("bad");
        }
    }
    
    public static void main(String[] args) {
        // if
//        If();

        // while
//        While();

        // for
//        For();

        // for each
//        ForEach();

        // switch
//        Switch();
    }
}

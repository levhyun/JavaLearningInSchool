package kr.hs.dgsw.java.Scanner;

import java.util.Scanner;

public class scanner {
    public static void inputProgram() {
        String str;
        do {
            System.out.printf("[inputProgram] Enter a string > ");
            str = scanner.next();
            System.out.println("input value : " + str);
        } while (!(str.equals("QUIT")));
        System.out.println("returning inputProgram function...");
        return;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Enter a number > ");
        int number = scanner.nextInt();
        System.out.println("number = " + number);

        System.out.printf("Enter a string > ");
        String str = scanner.next();
        System.out.println("str = " + str);

        System.out.printf("Enter a double > ");
        double number2 = scanner.nextDouble();
        System.out.println("number2 = " + number2);

        System.out.printf("Enter a byte > ");
        byte number3 = scanner.nextByte();
        System.out.println("number3 = " + number3);

//        inputProgram();

        scanner.close();
    }
}

package kr.hs.dgsw.java.Operation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Binary {
    static String result = "";
    public static String toBinary(int value){
        if(value == 0) {
            return "0";
        } else {
            toBinary(value/2);
            Binary.result += Integer.toString(value%2);
        }
        return Binary.result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number > ");
        System.out.println("Result : " + Binary.toBinary(sc.nextInt()));
    }
}
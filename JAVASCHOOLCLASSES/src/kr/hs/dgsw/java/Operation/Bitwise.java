package kr.hs.dgsw.java.Operation;

public class Bitwise {
    public static void main(String[] args) {
        int op1 = 5;
        int op2 = 3;
        // op1 : 0101, op2 : 0011

        // 2진수
        int op3 = 0b0100; // 0100 -> 4
        // 형식 : 0b[2진수]
        System.out.println("op3 = " + op3);

        // 16진수
        int op4 = 0xA; // A -> 10
        // 형식 : 0x[16진수]
        System.out.println("op4 = " + op4);

        // 비트 연산자
        int result;
        result  = op1 & op2; // 0001 -> 1
        // 비트 AND (&) : 둘다 참이어야 참
        result = op1 | op2; // 0111 -> 7
        // 비트 OR (|) : 하나라도 참이라면 참
        result  = op1 ^ op2; // 0110 -> 6
        // 비트 XOR (^) : 서로 다르면 참
        result  = ~op1; // 1010 -> -6
        // 비트 NOT (~) : 부정
        result  = ~op2; // 0000 0011 -> 1111 1100 -> -4
        System.out.println("result = " + result);
        // 비트 NOT (~) : 부정

        // 비트연산자 - 시프트 연산자
        byte res;
        byte value = 6;
        int cnt = 1;

        int res2;
        int value2 = -1;

        // 왼쪽 시프트
        res = (byte)(value << cnt); // 0110 -> 1100 = 12
        // 오른쪽 시프트
        res = (byte)(value >> cnt); // 0110 -> 0011 = 3

        // 부호 없는 오른쪽 시프트
        res2 = (value2 >>> cnt);
        System.out.printf("%02X >>> %d = %02X", value2, cnt, res2);
    }
}

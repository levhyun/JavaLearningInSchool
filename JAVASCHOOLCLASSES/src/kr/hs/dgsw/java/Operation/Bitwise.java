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
        result  = ~op1; // 1010 -> 10
        // 비트 NOT (~) : 부정
        result  = ~op2; // 1100 -> 12
        // 비트 NOT (~) : 부정

        result  = op1 << op2;
        // 비트 값을 왼쪽으로 지정된 수만큼 이동시킵니다.
        // 예: 0b0011 << 2 = 0b1100
        result  = op1 >> op2;
        // 비트 값을 오른쪽으로 지정된 수만큼 이동시킵니다.
        // 이동된 비트의 최상위 비트는 이동 전과 같은 값으로 채워집니다.
        // 예: 0b1100 >> 2 = 0b0011
        result  = op1 >>> op2;
        // 비트 값을 오른쪽으로 지정된 수만큼 이동시킵니다.
        // 이동된 비트의 최상위 비트는 항상 0으로 채워집니다.
        // 예: 0b1100 >>> 2 = 0b0011
    }
}

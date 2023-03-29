package kr.hs.dgsw.java.Operation;

public class operation {
    public static void main(String[] args) {
        int op1 = 5;
        int op2 = 3;

        // 산술 연산자
        int plus = op1 + op2; // 8
        int minus = op1 - op2; // 2
        int multiply = op1 * op2; // 15
        int divide = op1 / op2; // 1
        int modulus = op1 % op2; // 2

//        op2 = 0;
//        divide = op1 / op2; // ERROR : Exception in thread "main" java.lang.ArithmeticException: / by zero
//        modulus = op1 % op2; // ERROR : Exception in thread "main" java.lang.ArithmeticException: / by zero


        // 관계 연산자
        boolean res;
        res = (op1 == op2); // false
        res = (op1 > op2); // true
        res = (op1 < op2); // false
        res = (op1 != op2); // true
        res = (op1 >= op2); // true
        res = (op1 <= op2); // false


        // 논리 연산자
        boolean t = true;
        boolean f = false;
        boolean result;

        // 논리 우선순위 : [1] &&, [2] ||
        result = (t && f); // false
        result = (t || f); // true
        result = !t; // false
        result = !f; // true


        // 삼항 연산자
        // 형식 : (조건식) ? (참인 경우 값) : (거짓인 경우 값)
        boolean condition = true;
        int result2 = condition ? 5 : 2; // 5
    }
}

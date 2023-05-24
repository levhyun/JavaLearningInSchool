package kr.hs.dgsw.java.Exception;

public class exception extends Throwable {
    public void nullMethod() {
        String name = null;
        int length = name.length();
    }

    public int device(int op1, int op2) {
        try {
            int result = op1 / op2;
            return result;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "\n'0'으로 나눌 수 없습니다.");
            return 0;
        }
    }

    public static void main(String[] args) {
        exception exception = new exception();
//        exception.nullMethod();
        exception.device(5, 0);
    }
}

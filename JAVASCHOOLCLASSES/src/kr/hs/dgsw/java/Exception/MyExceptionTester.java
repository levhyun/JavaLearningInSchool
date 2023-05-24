package kr.hs.dgsw.java.Exception;

public class MyExceptionTester {
    public void method1(String name) {
        try {
            method2(name);
        } catch (MyException e) {
//            e.printStackTrace();
//            System.out.println("name 변수가 null입니다.");
            throw new RuntimeException(e);
        }
    }

    public void method2(String name) throws MyException {
        if (name != null) {
            System.out.printf("Hello %s\n", name);
        } else {
            MyException e = new MyException();
            throw e;
        }
    }

    public static void main(String[] args) {
        MyExceptionTester tester = new MyExceptionTester();
        tester.method1(null);
    }
}

package kr.hs.dgsw.java.Exception;

public class Throws {
    public void method1() throws exception {
        System.out.println("Throws.method1");
        method2();
        method3();
    }

    public void method2() throws exception {
        System.out.println("Throws.method2");
    }

    public void method3() throws NullPointerException {
        System.out.println("Throws.method3");
    }

    public static void main(String[] args) throws exception {
        Throws throwsController = new Throws();
        throwsController.method1();
    }
}

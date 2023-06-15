package kr.hs.dgsw.java.Threads;

public class Mother {
    public static void main(String[] args) throws InterruptedException {
        Son son = new Son();
        Thread thread = new Thread(son);
        thread.start();

        Thread.sleep(3000);

        thread.interrupt();
    }
}
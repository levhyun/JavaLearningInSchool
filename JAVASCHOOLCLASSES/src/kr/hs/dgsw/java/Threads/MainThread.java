package kr.hs.dgsw.java.Threads;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        DownThread thread = new DownThread();
        thread.start();

        for (int i = 1; i <= 100; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}

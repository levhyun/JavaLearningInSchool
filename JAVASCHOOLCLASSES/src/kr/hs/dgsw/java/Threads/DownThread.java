package kr.hs.dgsw.java.Threads;

public class DownThread extends Thread {
    @Override
    public void run() {
        for (int i = 100; i >= 1; i--) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

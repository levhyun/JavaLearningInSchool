package kr.hs.dgsw.java.Threads;

public class Son implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("아~ 잘잤다!..");
    }
}

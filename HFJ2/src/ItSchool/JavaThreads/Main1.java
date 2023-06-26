package ItSchool.JavaThreads;

public class Main1 implements Runnable {
    public static void main(String[] args) {
        Main1 obj = new Main1();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

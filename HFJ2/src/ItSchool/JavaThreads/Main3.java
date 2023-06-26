package ItSchool.JavaThreads;

public class Main3 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main3 thread = new Main3();
        thread.start();
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Main3: " + amount);
        amount++;
        System.out.println("Main3: " + amount);
    }
    public void run () {
        amount++;
    }
}

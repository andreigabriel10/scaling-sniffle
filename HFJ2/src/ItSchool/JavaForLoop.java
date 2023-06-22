package ItSchool;

public class JavaForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        for (int z = 0; z <= 10; z = z + 2) {
            System.out.println(z);
        }
        for (int x = 1; x <= 2; x++) {
            System.out.println("Outer: " + x);
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }
        }
    }
}

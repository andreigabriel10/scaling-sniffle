package ItSchool;

public class JavaBreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        for (int z = 0; z < 10; z++) {
            if (z == 4) {
                continue;
            }
            System.out.println(z);
        }
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
            if (a == 4) {
                break;
            }
            int b = 0;
            while (b < 10) {
                if (b == 4) {
                    b++;
                    continue;
                }
                System.out.println(b);
                b++;
            }
        }
    }
}

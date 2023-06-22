package ItSchool;

public class JavaTypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        double firstDouble = 9.78d;
        int firstInt = (int) myDouble;
        System.out.println(firstDouble);
        System.out.println(firstInt);
    }
}

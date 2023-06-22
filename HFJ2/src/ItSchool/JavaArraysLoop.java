package ItSchool;

public class JavaArraysLoop {
    public static void main(String[] args) {
        String [] cars = {"Volvo", "BMW", "Opel", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            }
        for (String i : cars) {
            System.out.println(i);
        }
    }
}

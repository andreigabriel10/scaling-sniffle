package ItSchool;

public class JavaClassMethods {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        JavaClassMethods myCar = new JavaClassMethods();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}

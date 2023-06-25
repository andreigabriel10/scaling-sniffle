package ItSchool;

public class JavaClassAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        JavaClassAttributes myObj = new JavaClassAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}

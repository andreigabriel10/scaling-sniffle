package ItSchool;

public class JavaStrings {
    public static void main(String[] args) {
        String greeting = "Hello!";
        System.out.println(greeting);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt is: " + txt.length());
        String text = "Hello world";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        String text1 = "Please locate where 'locate' occurs!";
        System.out.println(text1.indexOf("locate"));
    }
}

package ItSchool.JavaHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Smith", 44);
        people.put("Michael", 21);
        people.put("Alison", 33);
        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " +people.get(i));
        }
    }


}

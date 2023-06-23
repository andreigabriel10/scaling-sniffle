package ItSchool.JavaArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(11);
        myNumbers.add(12);
        myNumbers.add(13);
        myNumbers.add(20);
        myNumbers.add(100);
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}

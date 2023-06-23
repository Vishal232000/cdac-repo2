package com.practice;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Google");
        names.add("Apple");
        names.add("Samsung");
         
        //update element of arraylist
        names.set(1, "Asus");
         
        for(String name: names) {
            System.out.println(name);
        }
    }
}
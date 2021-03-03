package com.company.singleton.singleThreaded;

public class Demo {
    public static void main(String[] args){
        System.out.println("If you see the same value, then singleton was reused ,good\n" +
                "If you see different values, then 2 singletons were created , bad\n" +
                "Result: ");
        Singleton singleton = Singleton.getInstance("Fifa");
        Singleton anotherSingleton = Singleton.getInstance("Fifa 1234");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

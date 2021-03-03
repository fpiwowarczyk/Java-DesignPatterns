package com.company.singleton.threadSafe;

public class Demo {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused ,good\n" +
                "If you see different values, then 2 singletons were created , bad\n" +
                "Result: ");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadBar.start();
        threadFoo.start();
    }
    static class ThreadFoo implements Runnable {
        @Override
        public void run(){
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run(){
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.value);
        }
    }
}

package com.example.designPatterns.creational.singleton.singleThread;

public class SingletonImpl {
    public SingletonImpl() {
        System.out.println("Single Thread Implementation");

        Singleton singletonFirst = Singleton.getInstance(" - Singleton First ............. Loaded");
        Singleton singletonSecond = Singleton.getInstance(" - Singleton Second ............. Loaded");

        System.out.println(singletonFirst.value);
        System.out.println(singletonSecond.value);
    }
}

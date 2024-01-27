package com.example.designPatterns.creational.singleton.multiThread;

import com.example.designPatterns.creational.singleton.singleThread.Singleton;

public class SingletonMultiThreadImpl {
    public SingletonMultiThreadImpl() {
        System.out.println("Multi Thread Implementation");

        Thread threadFirst = new Thread(new ThreadFirst());
        Thread threadSecond = new Thread(new ThreadSecond());

        threadFirst.start();
        threadSecond.start();
    }

    static class ThreadFirst implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(" - Singleton First  ............. Loaded");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSecond implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(" - Singleton Second ............. Loaded");
            System.out.println(singleton.value);
        }
    }
}

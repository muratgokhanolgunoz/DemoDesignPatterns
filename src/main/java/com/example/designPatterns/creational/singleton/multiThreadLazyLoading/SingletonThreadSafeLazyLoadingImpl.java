package com.example.designPatterns.creational.singleton.multiThreadLazyLoading;

public class SingletonThreadSafeLazyLoadingImpl {
    public SingletonThreadSafeLazyLoadingImpl() {
        System.out.println("Thread Safe Lazy Loading Implementation");

        Thread threadFirst = new Thread(new ThreadFirst());
        Thread threadSecond = new Thread(new ThreadSecond());

        threadFirst.start();
        threadSecond.start();
    }

    static class ThreadFirst implements Runnable {

        @Override
        public void run() {
            SingletonThreadSafeLazyLoading singleton = SingletonThreadSafeLazyLoading.getInstance(" - Singleton First ............. Loaded");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSecond implements Runnable {

        @Override
        public void run() {
            SingletonThreadSafeLazyLoading singleton = SingletonThreadSafeLazyLoading.getInstance(" - Singleton Second  ............. Loaded");
            System.out.println(singleton.value);
        }
    }
}

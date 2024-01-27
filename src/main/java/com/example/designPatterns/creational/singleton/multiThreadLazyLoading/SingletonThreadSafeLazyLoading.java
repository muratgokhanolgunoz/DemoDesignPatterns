package com.example.designPatterns.creational.singleton.multiThreadLazyLoading;

public class SingletonThreadSafeLazyLoading {
    private static volatile SingletonThreadSafeLazyLoading instance;
    public String value;

    private SingletonThreadSafeLazyLoading(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException interruptedException) {
            interruptedException.getStackTrace();
        }

        this.value = value;
    }

    public static SingletonThreadSafeLazyLoading getInstance(String value) {
        SingletonThreadSafeLazyLoading result = instance;

        if (result != null) {
            return result;
        }

        synchronized (SingletonThreadSafeLazyLoading.class) {
            if (instance == null) {
                instance = new SingletonThreadSafeLazyLoading(value);
            }

            return instance;
        }
    }
}

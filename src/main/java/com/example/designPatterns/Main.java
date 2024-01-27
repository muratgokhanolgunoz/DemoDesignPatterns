package com.example.designPatterns;

import com.example.designPatterns.creational.singleton.multiThread.SingletonMultiThreadImpl;
import com.example.designPatterns.creational.singleton.multiThreadLazyLoading.SingletonThreadSafeLazyLoadingImpl;
import com.example.designPatterns.creational.singleton.singleThread.SingletonImpl;

public class Main {
    public static void main(String[] args) {
//        SingletonImpl singletonImpl = new SingletonImpl();
//        SingletonMultiThreadImpl singletonMultiThreadImpl = new SingletonMultiThreadImpl();
        SingletonThreadSafeLazyLoadingImpl singletonThreadSafeLazyLoadingImpl = new SingletonThreadSafeLazyLoadingImpl();
    }


}
package com.homel.singleton;

public class Singleton {
    // volatile - to prevent reordering
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) { // in second thread it can be not null
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }
}

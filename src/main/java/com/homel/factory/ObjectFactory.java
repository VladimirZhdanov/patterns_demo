package com.homel.factory;

import lombok.SneakyThrows;

public class ObjectFactory {
    private static ObjectFactory objectFactory = new ObjectFactory();
    private Config config = new JavaConfig("com.homel");

    private ObjectFactory() {
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    @SneakyThrows
    public <T> T getInstance(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        return implClass.getDeclaredConstructor().newInstance();
    }
}

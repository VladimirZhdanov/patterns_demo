package com.homel.factory;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> type);
}

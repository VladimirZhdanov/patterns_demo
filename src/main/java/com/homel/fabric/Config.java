package com.homel.fabric;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> type);
}

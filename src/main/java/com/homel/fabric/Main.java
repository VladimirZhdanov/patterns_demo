package com.homel.fabric;

public class Main {
    public static void main(String[] args) {
        Shape circle = ObjectFactory.getInstance().getInstance(Circle.class);
        Shape triangle = ObjectFactory.getInstance().getInstance(Triangle.class);
        Shape shape = ObjectFactory.getInstance().getInstance(Shape.class);
    }
}

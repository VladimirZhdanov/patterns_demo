package com.homel.prototype;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Person person = new Person("Tom", 32);
        Person clone = (Person) person.clone();
        System.out.println("Person object: " + person + " Name: " + person.getName() + " Age: " + person.getAge());
        System.out.println("Person object: " + clone + " Name: " + clone.getName() + " Age: " + clone.getAge());
    }
}

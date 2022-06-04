package com.homel.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person extends Prototype {
    private String name;
    private int age;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package com.homel.command;

public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}

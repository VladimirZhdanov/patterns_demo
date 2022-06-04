package com.homel.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand("LightOnCommand", light);
        Command lightsOff = new LightOffCommand("LightOffCommand", light);

        // switch on
        control.pressButton(lightsOn);

        // switch off
        control.pressButton(lightsOff);

        // undo
        control.undo();

        // redo
        control.redo();
    }
}

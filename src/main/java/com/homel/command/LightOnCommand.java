package com.homel.command;

public class LightOnCommand implements Command {
    private final String name;
    private final Light light;

    public LightOnCommand(String name, Light light) {
        this.name = name;
        this.light = light;
    }

    public void execute() {
        light.switchOn();
    }

    @Override
    public void undo() {
        light.switchOff();
    }

    @Override
    public void redo() {
        light.switchOn();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Light getLight() {
        return light;
    }
}

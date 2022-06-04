package com.homel.command;

public class LightOffCommand implements Command {
    private final String name;
    private final Light light;

    public LightOffCommand(String name, Light light) {
        this.light = light;
        this.name = name;
    }

    public void execute() {
        light.switchOff();
    }

    @Override
    public void undo() {
        light.switchOn();
    }

    @Override
    public void redo() {
        light.switchOff();
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

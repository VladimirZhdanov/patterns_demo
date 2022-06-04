package com.homel.command;

public interface Command {
    void execute();
    void undo();
    void redo();

    String getName();
    Light getLight();
}

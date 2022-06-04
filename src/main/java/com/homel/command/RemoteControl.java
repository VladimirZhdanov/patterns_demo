package com.homel.command;

import java.util.*;

public class RemoteControl {
    private Queue<Command> queueStackNormal;
    private Queue<Command> queueStackReverse;

    private List<String> actionHistory;

    public RemoteControl() {
        queueStackNormal = Collections.asLifoQueue(new ArrayDeque<>());
        queueStackReverse = Collections.asLifoQueue(new ArrayDeque<>());
        actionHistory = new ArrayList<>();
    }

    public void pressButton(Command command) {
        queueStackNormal.offer(command);
        command.execute();
        actionHistory.add(command.getName() + ". Light is " + (command.getLight().isOn() ? "on" : "off"));
    }

    public void undo() {
        Command command = queueStackNormal.poll();
        if (command != null) {
            command.undo();
            queueStackReverse.offer(command);
            actionHistory.add(command.getName() + " - undo." + " Light is " + (command.getLight().isOn() ? "on" : "off"));
        }
    }

    public void redo() {
        Command command = queueStackReverse.poll();
        if (command != null) {
            command.redo();
            queueStackReverse.offer(command);
            actionHistory.add(command.getName() + " - redo." + " Light is " + (command.getLight().isOn() ? "on" : "off"));
        }
    }

    public void clearNormal() {
        queueStackNormal.clear();
    }

    public void clearReverse() {
        queueStackReverse.clear();
    }

    public List<String> getActionHistory() {
        return actionHistory;
    }
}

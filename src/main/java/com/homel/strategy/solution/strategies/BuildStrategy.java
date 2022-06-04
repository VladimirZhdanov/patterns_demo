package com.homel.strategy.solution.strategies;

import com.homel.strategy.problem.model.Input;

public abstract class BuildStrategy {
    public abstract String buildQuery(Input input);
    public abstract boolean isAvailable(Input input);
}

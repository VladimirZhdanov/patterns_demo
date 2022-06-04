package com.homel.strategy.solution.strategies;

import com.homel.strategy.problem.enums.Type;
import com.homel.strategy.problem.model.Input;
import com.homel.strategy.solution.annotations.Name;

@Name(value = "PNBuildStrategy", clazz = PNBuildStrategy.class)
public class PNBuildStrategy extends BuildStrategy {

    @Override
    public String buildQuery(Input input) {
        return "return PN";
    }

    @Override
    public boolean isAvailable(Input input) {
        return input.getType() == Type.PN;
    }
}

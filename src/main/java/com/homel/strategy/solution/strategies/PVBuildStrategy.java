package com.homel.strategy.solution.strategies;

import com.homel.strategy.problem.enums.Type;
import com.homel.strategy.problem.model.Input;
import com.homel.strategy.solution.annotations.Name;

@Name(value = "PVBuildStrategy", clazz = PVBuildStrategy.class)
public class PVBuildStrategy extends BuildStrategy {

    @Override
    public String buildQuery(Input input) {
        return "return PV";
    }

    @Override
    public boolean isAvailable(Input input) {
        return input.getType() == Type.PV;
    }
}

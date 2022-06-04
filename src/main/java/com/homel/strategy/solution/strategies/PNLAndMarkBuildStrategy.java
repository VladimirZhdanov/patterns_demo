package com.homel.strategy.solution.strategies;

import com.homel.strategy.problem.enums.Type;
import com.homel.strategy.problem.model.Input;
import com.homel.strategy.solution.annotations.Name;

import java.util.Locale;

@Name(value = "PNLAndMarkBuildStrategy", clazz = PNLAndMarkBuildStrategy.class)
public class PNLAndMarkBuildStrategy extends BuildStrategy {

    @Override
    public String buildQuery(Input input) {
        return "return PNL and mark";
    }

    @Override
    public boolean isAvailable(Input input) {
        return input.getType() == Type.PNL && input.getName().toLowerCase(Locale.ROOT).contains("mark");
    }
}

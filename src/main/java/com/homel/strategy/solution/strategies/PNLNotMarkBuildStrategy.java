package com.homel.strategy.solution.strategies;

import com.homel.strategy.problem.enums.Type;
import com.homel.strategy.problem.model.Input;
import com.homel.strategy.solution.annotations.Name;

import java.util.Locale;

@Name(clazz = PNLNotMarkBuildStrategy.class)
public class PNLNotMarkBuildStrategy extends BuildStrategy {

    @Override
    public String buildQuery(Input input) {
        return "return PNL and not mark";
    }

    @Override
    public boolean isAvailable(Input input) {
        return input.getType() == Type.PNL && !input.getName().toLowerCase(Locale.ROOT).contains("mark");
    }
}

package com.homel.strategy.solution.strategies;

import com.homel.strategy.problem.model.Input;
import com.homel.strategy.solution.annotations.Name;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private final Map<String, BuildStrategy> map = new HashMap<>();

    public StrategyFactory() {
        // In Spring, it will be beans
        PNBuildStrategy pnBuildStrategy = new PNBuildStrategy();
        PVBuildStrategy pvBuildStrategy = new PVBuildStrategy();
        PNLNotMarkBuildStrategy pnlNotMarkBuildStrategy = new PNLNotMarkBuildStrategy();
        PNLAndMarkBuildStrategy pnlAndMarkBuildStrategy = new PNLAndMarkBuildStrategy();

        map.put(getName(pnBuildStrategy), pnBuildStrategy);
        map.put(getName(pvBuildStrategy), pvBuildStrategy);
        map.put(getName(pnlNotMarkBuildStrategy), pnlNotMarkBuildStrategy);
        map.put(getName(pnlAndMarkBuildStrategy), pnlAndMarkBuildStrategy);
    }

    private String getName(BuildStrategy strategy) {
        Name annotation = strategy.getClass().getAnnotation(Name.class);
        return annotation.value().isBlank() ? annotation.clazz().getSimpleName() : annotation.value();
    }

    public BuildStrategy getStrategy(Input input) {
        return map.entrySet().stream()
                .filter(a -> a.getValue().isAvailable(input))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new).getValue();
    }
}

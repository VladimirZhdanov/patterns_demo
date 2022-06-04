package com.homel.strategy.solution.service;

import com.homel.strategy.problem.model.Input;
import com.homel.strategy.solution.strategies.StrategyFactory;

public class QueryBuilderImpl implements QueryBuilder {
    private final StrategyFactory strategyFactory = new StrategyFactory();

    @Override
    public String buildQuery(Input input) {
        return strategyFactory.getStrategy(input).buildQuery(input);
    }
}

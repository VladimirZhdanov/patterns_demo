package com.homel.strategy.solution.service;

import com.homel.strategy.problem.model.Input;

public interface QueryBuilder {
    String buildQuery(Input input);
}

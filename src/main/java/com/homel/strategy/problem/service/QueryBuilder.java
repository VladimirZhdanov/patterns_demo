package com.homel.strategy.problem.service;

import com.homel.strategy.problem.model.Input;

public interface QueryBuilder {
    String buildQuery(Input input);
}

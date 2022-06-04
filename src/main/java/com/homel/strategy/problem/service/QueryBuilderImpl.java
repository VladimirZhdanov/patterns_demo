package com.homel.strategy.problem.service;

import com.homel.strategy.problem.enums.Type;
import com.homel.strategy.problem.model.Input;

//Yje problem is whe have to add new "if" when we want to add new type(and it can be not only type)
public class QueryBuilderImpl implements QueryBuilder {
    @Override
    public String buildQuery(Input input) {
        if (input.getType() == Type.PN) {
            return "return PN";
        } else if (input.getType() == Type.PV) {
            return "return PV";
        } else if (input.getType() == Type.PNL && !input.getName().contains("mark")) {
            return "return PNL and not mark";
        } else if (input.getType() == Type.PNL && input.getName().contains("mark")) {
            return "return PNL and mark";
        } else {
            return "TODO this shit";
        }
    }
}

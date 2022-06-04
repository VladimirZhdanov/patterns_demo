package com.homel.strategy.problem.model;

import com.homel.strategy.problem.enums.Type;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Input {
    private Type type;
    private String name;
}

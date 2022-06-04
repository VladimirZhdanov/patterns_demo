package com.homel.strategy.solution.service;

import com.homel.strategy.problem.enums.Type;
import com.homel.strategy.problem.model.Input;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QueryBuilderImplTest {

    @Test
    void shouldReturnPnlAndMarkWhenPutPnlAndMark() {
        Input input = Input.builder()
                .type(Type.PNL)
                .name("mark 1")
                .build();

        QueryBuilder queryBuilder = new QueryBuilderImpl();

        assertEquals("return PNL and mark", queryBuilder.buildQuery(input));
    }

    @Test
    void shouldReturnPnlAndNotMarkWhenPutPnlAndMark() {
        Input input = Input.builder()
                .type(Type.PNL)
                .name("Model 1")
                .build();

        QueryBuilder queryBuilder = new QueryBuilderImpl();

        assertEquals("return PNL and not mark", queryBuilder.buildQuery(input));
    }

    @Test
    void shouldReturnPnWhenPutPn() {
        Input input = Input.builder()
                .type(Type.PN)
                .name("Model 1")
                .build();

        QueryBuilder queryBuilder = new QueryBuilderImpl();

        assertEquals("return PN", queryBuilder.buildQuery(input));
    }

    @Test
    void shouldReturnPvWhenPutPv() {
        Input input = Input.builder()
                .type(Type.PV)
                .name("Model 1")
                .build();

        QueryBuilder queryBuilder = new QueryBuilderImpl();

        assertEquals("return PV", queryBuilder.buildQuery(input));
    }

    @Test
    void shouldThrowExceptionWhenNoStrategy() {
        Input input = Input.builder()
                .type(Type.FAKE)
                .name("Model 1")
                .build();

        QueryBuilder queryBuilder = new QueryBuilderImpl();
        assertThrows(IllegalArgumentException.class, () -> queryBuilder.buildQuery(input));
    }
}
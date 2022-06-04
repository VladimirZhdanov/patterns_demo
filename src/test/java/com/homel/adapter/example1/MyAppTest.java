package com.homel.adapter.example1;

import com.homel.adapter.BugattiVeyron;
import com.homel.adapter.Movable;
import com.homel.adapter.MovableAdapter;
import com.homel.adapter.MovableAdapterImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyAppTest {

    @Test
    void shouldInitCorrectMapByPhone() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }
}
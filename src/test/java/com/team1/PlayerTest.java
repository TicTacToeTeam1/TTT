package com.team1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    Player player;

    @BeforeEach
    public void setUp(){
        player = new Player('X', "femcoder");
    }

    @Test
    public void shouldReturnName(){
        String result = "femcoder";

        assertEquals(result, player.getName());
    }

    @Test
    public void shouldSetTurn(){
        player.setTurn(true);

        boolean result = player.getTurn();

        assertTrue(result);
    }
}

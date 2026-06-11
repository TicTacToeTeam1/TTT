package com.team1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    Board board;

    @BeforeEach
    public void setUp(){
        board = new Board();
    }

    @Test
    public void shouldSetBoard(){
        board.setBoard(1, 1, 'X');

        char result = 'X';

        assertEquals(result, board.getBoard(1, 1));
    }

    @Test
    public void shouldReturnIfBoardIsEmpty(){
        board.setBoard(1, 1, 'X');

        boolean result = board.isEmpty(1, 1);

        assertFalse(result);
    }
}

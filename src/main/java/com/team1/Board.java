package com.team1;

public class Board {

    private char[][] board = new char[3][3];


    public Board() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                this.board[i][j] = '_';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
    public void setBoard(char x, char y, char player) {
        this.board[x][y] = player;
    }
}

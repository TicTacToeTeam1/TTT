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

    public char getBoard(int x, int y) {
        return this.board[x][y];
    }

    public void setBoard(int x, int y, char token) {
        if (this.board[x][y] == '_') {
            this.board[x][y] = token;
        }
    }

    public boolean isEmpty(int x, int y) {
        return this.board[x][y] == '_';
    }

    public boolean isFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasThreeInLine(char token) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == token && board[i][1] == token && board[i][2] == token)
                return true;
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == token && board[1][j] == token && board[2][j] == token)
                return true;
        }

        if (board[0][0] == token && board[1][1] == token && board[2][2] == token)
            return true;
   
        if (board[0][2] == token && board[1][1] == token && board[2][0] == token)
            return true;

        return false;
    }
}
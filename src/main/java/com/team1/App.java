package com.team1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        System.out.println("Juguemos tic tac toe");
        System.out.println("Objetivo: en un tablero de 3x3, debes completar con 3 símbolos (X o O) una fila, columna o diagonal para ganar el juego.");

        System.out.print("Introduce un nombre para la primera jugadora: ");
        String name = scanner.nextLine();
        Player player1 = new Player('X', name);

        System.out.print("Introduce un nombre para la segunda jugadora: ");
        name = scanner.nextLine();
        Player player2 = new Player('O', name);

        System.out.println("Jugadora " + player1.getName() + " eres " + player1.getToken());
        System.out.println("Jugadora " + player2.getName() + " eres " + player2.getToken());

        player1.setTurn(true);
        player2.setTurn(false);
        boolean gameOver = false;

        do {
            board.printBoard();

            Player current = player1.getTurn() ? player1 : player2;
            Player next    = player1.getTurn() ? player2 : player1;

            boolean validMove = playGame(current, board, scanner);

            if (validMove) {
                if (board.hasThreeInLine(current.getToken())) {
                    board.printBoard();
                    System.out.println("¡" + current.getName() + " ha ganado la partida!");
                    gameOver = true;
                } else if (board.isFull()) {
                    board.printBoard();
                    System.out.println("¡Empate! No quedan casillas libres.");
                    gameOver = true;
                } else {
                    current.setTurn(false);
                    next.setTurn(true);
                }
            }

        } while (!gameOver);

        scanner.close();
    }

    public static boolean playGame(Player player, Board board, Scanner scanner) {
        System.out.println("Turno de: " + player.getName());
        System.out.print("Selecciona una fila y columna (1-3): ");
        String field = scanner.nextLine().trim();

        if (!field.matches("[1-3] [1-3]")) {
        System.out.println("Formato incorrecto. Introduce dos números del 1 al 3 separados por un espacio (ej: '2 3').");
        return false;
    }

        int row    = Character.getNumericValue(field.charAt(0));
        int column = Character.getNumericValue(field.charAt(2));

        if (board.isEmpty(row - 1, column - 1)) {
            board.setBoard(row - 1, column - 1, player.getToken());
            return true;
        } else {
            System.out.println("Este sitio está ocupado, intenta de nuevo.");
            return false;
        }
    }
}
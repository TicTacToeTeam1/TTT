package com.team1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Board board = new Board();

        // WELCOME
        System.out.println("Juguemos tic tac toe");
        System.out.println(
                "Objetivo: en un tablero de 3x3, debes completar con 3 símbolos (X o O) una fila, columna o diagonal para ganar el juego.");

        System.out.print("Introduce un nombre para la primera jugadora: ");
        String name = scanner.nextLine();
        Player player1 = new Player('X', name);

        System.out.print("Introduce un nombre para la segunda jugadora: ");
        name = scanner.nextLine();
        Player player2 = new Player('O', name);

        System.out.println("Jugadora " + player1.getName() + " eres " + player1.getToken());
        System.out.println("Jugadora " + player2.getName() + " eres " + player2.getToken());

        // GAME
        boolean game = true;
        player1.setTurn(true);
        String field = "";
        int row = 0;
        int column = 0;

        do {
            if (player1.getTurn() == true) {
                if (playGame(player1, board, field, row, column, scanner)){
                    player2.setTurn(true);
                    player1.setTurn(false);
                }
            } else if(player2.getTurn()==true){
                if(playGame(player2, board, field, row, column, scanner)){
                    player1.setTurn(true);
                    player2.setTurn(false);
                }
            }
            board.printBoard();

        } while (game);

        // END

        scanner.close();

    }

    public static boolean playGame(Player player, Board board, String field, int row, int column, Scanner scanner) {
        System.out.println("Turno de: " + player.getName());
        System.out.print("Selecciona una fila y columna (1-3): ");
        field = scanner.nextLine();
        row = Character.getNumericValue(field.charAt(0));
        column = Character.getNumericValue(field.charAt(2));
        if (board.isEmpty(row - 1, column - 1, player.getToken())) {
            return true;
        } else {
            System.out.println("Este sitio está ocupado, intenta de nuevo: ");
            return false;
        }
    }
}
